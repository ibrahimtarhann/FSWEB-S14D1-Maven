package com.workintech.developers;

import java.util.ArrayList;
import java.util.List;

public class HRManager extends Employee{

    private List<JuniorDeveloper> juniorDevelopers = new ArrayList<>();
    private List<MidDeveloper> midDevelopers = new ArrayList<>();
    private List<SeniorDeveloper> seniorDevelopers = new ArrayList<>();


    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public void addEmployee(JuniorDeveloper jd) {
        juniorDevelopers.add(jd);
        System.out.println("JuniorDeveloper added successfully.");
    }

    public void addEmployee(MidDeveloper md) {
        midDevelopers.add(md);
        System.out.println("MidDeveloper added successfully.");
    }

    public void addEmployee(SeniorDeveloper sd) {
        seniorDevelopers.add(sd);
        System.out.println("SeniorDeveloper added successfully.");
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing human resources.");
        setSalary(getSalary() * 1.05);
    }

    /*
    @Override
    public void work(){
        System.out.println("HR Manager starts to working");
    }*/
}
