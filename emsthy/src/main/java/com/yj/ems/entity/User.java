package com.yj.ems.entity;

import lombok.*;

@Data
@AllArgsConstructor//全参构造器
@NoArgsConstructor//无参数构造器
@ToString//toString方法
@Getter
@Setter
public class User {
    private  String id;
    private  String username;
    private String realname;
    private String password;
    private String sex;


}
