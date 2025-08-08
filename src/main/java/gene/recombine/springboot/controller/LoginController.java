package gene.recombine.springboot.controller;

import gene.recombine.springboot.common.enums.GlobalErrorCodeConstants;
import gene.recombine.springboot.common.result.CommonResult;
import gene.recombine.springboot.entity.User;
import gene.recombine.springboot.service.UserService;
import gene.recombine.springboot.vo.LoginUserVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Resource
    UserService userService;

    @RequestMapping("login")
    public CommonResult login(@RequestBody User user) {
        LoginUserVO loginUserVO = userService.loginUser(user);

        if(loginUserVO == null) {
            return CommonResult.error(GlobalErrorCodeConstants.LOGIN_ERROR);
        }

        return CommonResult.success(loginUserVO);
    }
}
