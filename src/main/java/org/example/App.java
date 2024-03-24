package org.example;

import org.example.config.Appconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args)
    {
        /*----***********--------Java Based Configuration code--------**********-----------*/
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Desktop dt = context.getBean(Desktop.class);
        dt.compile();


        /*****************XML Based Configuration code*******************/
//
//        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//        Student stud = (Student) context.getBean("student");
//
//        /*we can write another way by giving object type*/
//
//        Student stud = context.getBean("student",Student.class);
//        stud.setAge(21);
//        System.out.println("Student ages is  : "+stud.getAge());
//        stud.setFees(500000);
//        System.out.println("Student fees : "+ stud.getFees());
//        stud.code();

        /*Aslo we can define it without defining type directly by class type  below object creation */

//        Desktop obj= context.getBean(Desktop.class);

         /***********************************************************************/
    }
}
