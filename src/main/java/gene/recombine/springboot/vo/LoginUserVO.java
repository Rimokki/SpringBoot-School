package gene.recombine.springboot.vo;

import gene.recombine.springboot.entity.Menu;
import gene.recombine.springboot.entity.User;
import lombok.Data;

import java.util.List;

@Data
public class LoginUserVO {
    private User user;
    private List<Menu> menus;
    private String token;
}
