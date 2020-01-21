package org.example.entity;

import lombok.Data;

/**
 * 描述:
 * admin实体类
 *
 * @author：Guorc
 * @create 2020-01-21 18:56
 */
@Data
public class Admin {
    private Integer id;
    private String mobile;
    private String password;
    private String name;
}
