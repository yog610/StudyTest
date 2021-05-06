package com.yj.ems.entity;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Emp {
    private String id;
    private String name;
    private Double salary;
    private Integer age;
    private Date bir;

}
