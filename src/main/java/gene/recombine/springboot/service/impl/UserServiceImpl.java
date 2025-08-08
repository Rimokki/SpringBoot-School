package gene.recombine.springboot.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import gene.recombine.springboot.entity.Menu;
import gene.recombine.springboot.entity.User;
import gene.recombine.springboot.mapper.MenuMapper;
import gene.recombine.springboot.service.UserService;
import gene.recombine.springboot.mapper.UserMapper;
import gene.recombine.springboot.vo.LoginUserVO;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
* @author ShiRyant
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-08-07 17:38:53
*/
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Resource
    private UserMapper userMapper;
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public LoginUserVO loginUser(User user) {
        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.eq(User::getUsername,user.getUsername());
        userLambdaQueryWrapper.eq(User::getPassword,user.getPassword());

        User loginUser = baseMapper.selectOne(userLambdaQueryWrapper);

        if (loginUser==null){
            return null;
        }

        List<Menu> menus = menuMapper.getMenusByUserType(loginUser);
        String token = UUID.randomUUID().toString();
        stringRedisTemplate.opsForValue().set("Token::" + token, JSON.toJSONString(loginUser), 600, TimeUnit.SECONDS);

        LoginUserVO loginUserVO = new LoginUserVO();
        loginUser.setPassword("");
        loginUserVO.setUser(loginUser);
        loginUserVO.setMenus(menus);
        loginUserVO.setToken(token);

        return loginUserVO;
    }
}




