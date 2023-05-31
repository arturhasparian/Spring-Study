package com.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contex =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = contex.getBean("myPet", Dog.class);
        myDog.say();

        Dog yourDog = contex.getBean("myPet", Dog.class);
        yourDog.say();

        contex.close();
    }
}
