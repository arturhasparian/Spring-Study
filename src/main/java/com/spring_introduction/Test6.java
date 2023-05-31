package com.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contex =
                new AnnotationConfigApplicationContext(Config.class);

//        Pet cat1 = contex.getBean("catBean", Pet.class);
//        Pet cat2 = contex.getBean("catBean", Pet.class);

        Person person = contex.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        contex.close();
    }
}
