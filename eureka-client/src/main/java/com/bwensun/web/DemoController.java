package com.bwensun.web;

import com.bwensun.domain.USER;
import com.bwensun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 郑建雄
 * @program zzc
 * @description
 * @date 2019/5/24
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${spring.application.name}")
    private String hostname;

    @Autowired
    private UserService userService;

    @GetMapping(value = "hello")
    public void helloEureka(){
        System.out.println(hostname + "服务端口为=====>" + serverPort);
    }

    @GetMapping("feign/userList")
    public List<USER> getUserList(USER user){
        System.out.println("==================>");
        return userService.getUserList();
    }

    @PostMapping("feign/userAdd")
    public String userAdd(USER user){
        System.out.println("==================>");
        System.out.println(user.getName());
        userService.userAdd(user);
        return "success";
    }

    @GetMapping("feign/select")
    public USER userAdd(Integer uid){
        System.out.println("==================>");
        return userService.selectById(uid);
    }

    @GetMapping("feign/select2")
    public USER select(Integer uid, String name){
        System.out.println("==================>");
        return userService.select2(uid, name);
    }
}
