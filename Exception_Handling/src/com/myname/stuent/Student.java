package com.myname.stuent;

public class Student {
    private String name;
    private int rollno;
    private double cpi;

    public Student(String name, int rollno, double cpi) {
        this.name = name;
        this.rollno = rollno;
        this.cpi = cpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(int cpi) {
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nRoll No: " + getRollno() + "\nCPI: " + getCpi();
    }
}
