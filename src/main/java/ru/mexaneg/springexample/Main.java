package ru.mexaneg.springexample;

import org.springframework.context.support.*;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Computer computer = applicationContext.getBean("computer", Computer.class);
        System.out.println(computer.toString());
        applicationContext.close();
    }
}
