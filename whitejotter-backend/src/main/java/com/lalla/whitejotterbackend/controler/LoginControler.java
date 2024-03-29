package com.lalla.whitejotterbackend.controler;

import com.lalla.whitejotterbackend.pojo.Result;
import com.lalla.whitejotterbackend.pojo.User;
import com.lalla.whitejotterbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@Controller
public class LoginControler {

    @Autowired
    UserService userService;

    @CrossOrigin    // 跨域支持
    @PostMapping("api/login")
    @ResponseBody   // 将返回对象按Json或xml格式返回
    Result login(@RequestBody User requestUser) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);


        if (null == userService.get(username, requestUser.getPassword())) {
            String message = "账号密码错误";
            System.out.println("test");
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}
