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
     * 前置通知，计划让其在切入点方法执行之前执行
     */
    public void printBeforeLog(){
        System.out.println("方法开始执行");
    }

    /**
     * 后置通知，计划让其在切入点方法正常执行之后执行
     */
    public void printAfterLog(){
        System.out.println("方法正常执行完毕");
    }

    /**
     * 异常通知，计划让其在切入点方法执行出现异常时执行
     */
    public void printThrowLog(){
        System.out.println("方法执行出现异常");
    }

    /**
     * 最终通知，计划让其在切入点方法执行结束后执行
     */
    public void printFinalLog(){
        System.out.println("方法执行结束");
    }


}
