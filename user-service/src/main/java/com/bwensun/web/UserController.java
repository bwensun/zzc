package com.bwensun.web;

import com.bwensun.domain.USER;
import com.bwensun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 郑建雄
 * @program zzc
 * @description
 * @date 2019/5/24
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    public List<USER> getUserList(){
        System.out.println("=================");
        return userService.findList();
    }
}
