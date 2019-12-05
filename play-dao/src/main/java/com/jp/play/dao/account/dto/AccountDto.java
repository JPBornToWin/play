package com.jp.play.dao.account.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

@Data
@Accessors(chain = true)
public class AccountDto {
    private String uniqueId;

    private String username;

    private Timestamp LastLoginTime;

    private String email;

    private String phone;

    private Integer gender;

    private String nickname;

    private Timestamp createTime;

    private Timestamp updateTime;

    private Integer status;
}
