package com.xianglan.qnytv.domain.auth;

import lombok.Data;

import java.util.Date;

@Data
public class AuthMenu {
    private Long id;

    private String name;

    private String code;

    private Date createTime;

    private Date updateTime;
}
