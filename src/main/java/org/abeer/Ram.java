package org.abeer;

public class Ram implements Action{
    @Override
    public void eat() {
        System.out.println("RAM IS EATING");
    }

    @Override
    public void sleep() {
        System.out.println("RAM IS SLEEPING");
    }
}
