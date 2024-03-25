package org.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/springcore/collections/collectionconfig.xml");
        Emp emp=context.getBean("emp",Emp.class);
        System.out.println(emp.getName()+" "+emp.getPhones()+" "+emp.getAddress()+" "+emp.getCourses());

    }
}
