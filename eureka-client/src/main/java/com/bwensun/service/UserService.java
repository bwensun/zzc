package com.bwensun.service;

import com.bwensun.domain.USER;
import feign.hystrix.FallbackFactory;
import org.apache.catalina.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 郑建雄
 * @program zzc
 * @description
 * @date 2019/5/24
 */
@FeignClient(name = "user-service", fallback = FallbackFactory.Default.class)
public interface UserService {

    @RequestMapping(value = "/user/test")
    List<USER> getUserList();

    @PostMapping("/user/add")
    void userAdd(@RequestBody USER user);

    @RequestMapping("/user/select")
    USER selectById(Integer id);

    @RequestMapping("user/select2")
    USER select2(@RequestParam("uid") Integer uid, @RequestParam("name") String name);
}
