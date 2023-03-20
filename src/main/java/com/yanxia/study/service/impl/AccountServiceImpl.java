package com.yanxia.study.service.impl;

import com.yanxia.study.service.IAccountService;

import java.sql.SQLOutput;

public class AccountServiceImpl implements IAccountService {
    /**
     * 模拟保存账户
     */
    @Override
    public void saveAccount() {
        System.out.println("account saved");
    }

    /**
     * 模拟更新账户
     *
     * @param i
     */
    @Override
    public void updateAccount(int i) {
        System.out.println("account updated"+i);
    }

    /**
     * 模拟删除账户
     */
    @Override
    public int deleteAccount() {
        System.out.println("account deleted");
        return 1;
    }
}
