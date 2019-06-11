package com.bwensun.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 郑建雄
 * @program zzc
 * @description
 * @date 2019/6/11
 */
@RestController
@RefreshScope
public class UserConfigController {

    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("name")
    public String getName(){
        return this.name;
    }
}
