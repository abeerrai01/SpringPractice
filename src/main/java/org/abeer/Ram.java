package org.abeer;

public class Ram implements Action{
    private int id;
    private String name;
    private String Salary;
    private Address address;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public void eat() {
        System.out.println("RAM IS EATING");
    }

    @Override
    public void sleep() {
        System.out.println("RAM IS SLEEPING");
    }
}
