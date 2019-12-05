package com.jp.play.dao.account.dao;

import com.jp.play.dao.account.dto.AccountDto;
import org.apache.ibatis.annotations.Mapper;
import user.Account;

@Mapper
public interface AccountDao {
    Account getAccount(Long id, Integer status);

    AccountDto getAccountDto(Long uniqueId, Integer status);
}
