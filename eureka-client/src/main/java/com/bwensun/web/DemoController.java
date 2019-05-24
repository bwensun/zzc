package com.bwensun.web;

import com.bwensun.domain.USER;
import com.bwensun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String getUserList(USER user){
        return userService.getUserList();
    }
}
