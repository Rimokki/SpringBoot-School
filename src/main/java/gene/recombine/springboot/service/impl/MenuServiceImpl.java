package gene.recombine.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import gene.recombine.springboot.entity.Menu;
import gene.recombine.springboot.service.MenuService;
import gene.recombine.springboot.mapper.MenuMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author ShiRyant
* @description 针对表【menu】的数据库操作Service实现
* @createDate 2025-08-07 17:38:53
*/
@Service
@Transactional(rollbackFor = Exception.class)
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu>
    implements MenuService{

}




