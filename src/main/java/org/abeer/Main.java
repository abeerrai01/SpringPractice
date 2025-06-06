package org.abeer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        //Ram ram=context.getBean("Ram",org.abeer.Ram.class);
        //Shyam shyam=context.getBean("Shyam",org.abeer.Shyam.class);
        //Address address=context.getBean("Address",org.abeer.Address.class);
        //System.out.println(ram);
        //ram.display();
        //System.out.println(shyam);
        //shyam.display();
        //System.out.println(address);
        //ram.eat();
        //ram.sleep();
        //shyam.eat();
        //shyam.sleep();

        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        context.registerShutdownHook();

        Student student=context.getBean("st",org.abeer.Student.class);
        System.out.println(student);
    }
}