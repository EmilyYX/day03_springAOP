package com.yanxia.study.utils;

import com.yanxia.study.service.IAccountService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用于记录日志的工具类，提供了公共的代码
 */
public class Logger {

    public void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }

    IAccountService accountService;

    /**
     * 用于打印日志，计划让其在切入点方法执行之前执行
      */
    public void printLog(){
        System.out.println("开始记录日志");
    }


}
