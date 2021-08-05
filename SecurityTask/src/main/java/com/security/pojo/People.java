package com.security.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Topic
 * @Date 2021/08/04 13:56
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler"})
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "t_people")
public class People {
    /**
     *  编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增长主键
    private Integer id;
    /**
     *  姓名
     */
    @Column(name = "people_name")
    private String people_name;
    /**
     *  性别
     */
    @Column(name = "people_sex")
    private String people_sex;
    /**
     *  年龄
     */
    @Column(name = "people_age")
    private Integer people_age;
    /**
     *  工作
     */
    @Column(name = "people_subject")
    private String people_subject;
}
