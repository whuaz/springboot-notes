package com.whuaz.spring.boot.mybatis.mapper;

import com.whuaz.spring.boot.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

/**
 * @author grez
 * @date 19-4-28
 **/
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    Optional<User> selectById(Long id);
}
