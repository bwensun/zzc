package com.bwensun.web;

import com.bwensun.domain.USER;
import com.bwensun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @RequestMapping("test")
    public List<USER> getUserList(){
        System.out.println("=================");
        return userService.findList();
    }

    @PostMapping("add")
    public void userAdd(USER user){

        System.out.println("=================>进入userController");
        System.out.println(user.getName());
        userService.userAdd(user);
    }

    @RequestMapping("select")
    public USER userSelect(Integer id){
        System.out.println("=================>进入userController");
        return userService.selectById(id);
    }

    @RequestMapping("select2")
    public USER userSelect(Integer uid, String name){
        System.out.println("=================>进入userController");
        return userService.select(uid, name);
    }

    @RequestMapping("select3")
    public USER userSelect(USER user){
        System.out.println("=================>进入userController");
        return userService.select3(user);
    }
}
