package com.bwensun.service;

import com.bwensun.domain.USER;

import java.util.List;

/**
 * @author 郑建雄
 * @program zzc
 * @description
 * @date 2019/5/24
 */
public interface UserService {

    List<USER> findList();

    void userAdd(USER user);

    USER selectById(Integer id);

    USER select(Integer id, String name);

    USER select3(USER user);
}
