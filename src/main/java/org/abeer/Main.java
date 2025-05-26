package org.abeer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Ram ram=context.getBean("Ram",org.abeer.Ram.class);
        Shyam shyam=context.getBean("Shyam",org.abeer.Shyam.class);
        ram.eat();
        ram.sleep();
        shyam.eat();
        shyam.sleep();
    }
}