package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCouplingExample.xml");
        UserManager userManager = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManager.getUserInfor());

        UserManager userManager2 = (UserManager) context.getBean("userManagerWithWebServiceDataProvider");
        System.out.println(userManager2.getUserInfor());

    }
}
