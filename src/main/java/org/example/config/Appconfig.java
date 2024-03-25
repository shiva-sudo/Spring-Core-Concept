package org.example.config;


import org.example.Desktop;
import org.example.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

    @Bean
    public Student student( @Autowired Desktop com){
        Student student =new Student();
        student.setAge(25);
        student.setCom(com);
        return student;
    }
    @Bean
    public Desktop desktop(){
        return new Desktop();
    }
}
