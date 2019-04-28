package com.whuaz.spring.boot.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author grez
 * @since 19-4-28
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private Long id;

    private String name;

    private Integer age;

}
