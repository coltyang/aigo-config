package cn.itsource.aigo.web.controller;

import cn.itsource.aigou.domain.User;
import cn.itsource.util.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {

    @PostMapping("/login")
    public AjaxResult login(@RequestBody User user){
        System.out.println("\\__    ___/__.__.______   ____    /   _____/ ____   _____   _____/  |_|  |__ |__| ____    ____   \n" +
                "  |    | <   |  |\\____ \\_/ __ \\   \\_____  \\ /  _ \\ /     \\_/ __ \\   __\\  |  \\|  |/    \\  / ___\\  \n" +
                "  |    |  \\___  ||  |_> >  ___/   /        (  <_> )  Y Y  \\  ___/|  | |   Y  \\  |   |  \\/ /_/  > \n" +
                "  |____|  / ____||   __/ \\___  > /_______  /\\____/|__|_|  /\\___  >__| |___|  /__|___|  /\\___  /  \n" +
                "          \\/     |__|        \\/          \\/             \\/     \\/          \\/        \\//_____/   ");
        String username = user.getUsername();
        String password = user.getPassword();
        if ("admin".equals(username)&&"123456".equals(password)){
            return AjaxResult.me().setSuccess(true).setMessage("登陆成功");
        }else {
            return AjaxResult.me().setSuccess(false).setMessage("登录失败");
        }
    }

    @GetMapping("/logins")
    public AjaxResult login2(String username,String password){

        if ("admin".equals(username)&&"123456".equals(password)){
            return AjaxResult.me().setSuccess(true).setMessage("登陆成功");
        }else {
            return AjaxResult.me().setSuccess(false).setMessage("登录失败");
        }
    }
}
