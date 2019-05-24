package com.bwensun.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 郑建雄
 * @program zzc
 * @description
 * @date 2019/5/24
 */
@FeignClient(name = "user-service")
public interface UserService {

    @RequestMapping(value = "test")
    String getUserList();
}
