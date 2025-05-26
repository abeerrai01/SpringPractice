package org.abeer;

public class Shyam implements Action
{
    @Override
    public void eat() {
        System.out.println("SHYAM IS EATING");
    }

    @Override
    public void sleep() {
        System.out.println("SHYAM IS SLEEPING");
    }
}
