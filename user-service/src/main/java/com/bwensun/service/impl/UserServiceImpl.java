package com.bwensun.service.impl;

import com.bwensun.domain.USER;
import com.bwensun.repository.USERDynamicSqlSupport;
import com.bwensun.repository.USERDynamicSqlSupport.*;
import com.bwensun.repository.USERMapper;
import com.bwensun.service.UserService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.where.condition.IsEqualTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author 郑建雄
 * @program zzc
 * @description
 * @date 2019/5/24
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private USERMapper userMapper;

    @Override
    public List<USER> findList() {

/*        return userMapper.selectOne(SqlBuilder
                .select(USERDynamicSqlSupport.uid,USERDynamicSqlSupport.username)
                .from(USERDynamicSqlSupport.USER)
                .where(USERDynamicSqlSupport.uid, isEqualTo(user.getUid()))
                .build().render(RenderingStrategy.MYBATIS3));*/
        return userMapper.selectByExample().build().execute();
    }
}
