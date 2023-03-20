package com.yanxia.study.test;

import com.yanxia.study.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as =(IAccountService) ac.getBean("accountService");
        as.saveAccount();
        int i = as.deleteAccount();
        System.out.println(i);
        as.updateAccount(1);
    }
}
