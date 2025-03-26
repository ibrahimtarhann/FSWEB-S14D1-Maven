package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is architecting the system.");
        setSalary(getSalary() * 1.10);
    }

    /*
    @Override
    public void work(){
        System.out.println("Senior Developer starts to working");
    }*/
}
