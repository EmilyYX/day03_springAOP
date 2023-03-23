package com.yanxia.study.utils;

import com.yanxia.study.service.IAccountService;
import org.aspectj.lang.ProceedingJoinPoint;

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

    /**
     * 环绕通知
     * 它是spring框架为我们提供的一种可以在代码中手动控制增强方法合适执行的方式。
     */
    public Object printAroundLog(ProceedingJoinPoint pjp){
        Object returnValue = null;
        try{
            System.out.println("前置log");
            Object[] args = pjp.getArgs();
            returnValue = pjp.proceed(args);
            System.out.println("后置log");
            return returnValue;
        } catch (Throwable e) {
            System.out.println("异常log");
            throw new RuntimeException(e);
        }finally {
            System.out.println("最终log");
        }
    }


}
