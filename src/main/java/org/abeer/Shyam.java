package org.abeer;

public class Shyam implements Action
{
    @Override
    public String toString() {
        return "Shyam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary='" + Salary + '\'' +
                ", address=" + address +
                '}';
    }

    private int id;
    private String name;
    private String Salary;
    private Address address;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return Salary;
    }

    public Address getAddress() {
        return address;
    }

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
    public void display() {
        System.out.println("Ram [id=" + id + ", name=" + name + ", salary=" + Salary + "]");
        if (address != null) {

            System.out.println("Address: " + address.getAddress() + ", " + address.getCity() + ", " + address.getState());
        }
    }
    @Override
    public void eat() {
        System.out.println("SHYAM IS EATING");
    }

    @Override
    public void sleep() {
        System.out.println("SHYAM IS SLEEPING");
    }
}
