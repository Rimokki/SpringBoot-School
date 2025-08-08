package gene.recombine.springboot.service;

import gene.recombine.springboot.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import gene.recombine.springboot.vo.LoginUserVO;

/**
* @author ShiRyant
* @description 针对表【user】的数据库操作Service
* @createDate 2025-08-07 17:38:53
*/
public interface UserService extends IService<User> {
    LoginUserVO loginUser(User user);
}
