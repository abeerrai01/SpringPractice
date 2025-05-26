package org.abeer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Ram ram=context.getBean("Ram",org.abeer.Ram.class);
        Shyam shyam=context.getBean("Shyam",org.abeer.Shyam.class);
        Address address=context.getBean("Address",org.abeer.Address.class);
        Scanner in=new Scanner(System.in);
        address.setId(in.nextInt());
        System.out.println();
        address.setAddress(in.next());
        System.out.println();
        address.setCity(in.next());
        System.out.println();
        address.setState(in.next());
        System.out.println();
        ram.eat();
        ram.sleep();
        shyam.eat();
        shyam.sleep();
    }
}