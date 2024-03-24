package org.example;
public class Student {
   private int  age;
   private int fees;
   private Computer com;
   public Student(){
//       System.out.println("Student object created");
   }

//    public Student(int age,int fees, Computer com) {
//
//        System.out.println("Parameterized constructor called");
//        this.age = age;
//        this.fees=fees;
//        this.com = com;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding...");
        com.compile();
    }
}
