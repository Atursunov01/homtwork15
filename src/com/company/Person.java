package com.company;

public abstract class Person {
    private String name;
    private String designation;

    public  void learn () {
        System.out.println("окуу");
    }
    public void walk () {
        System.out.println("чуркоо");
    }
    public void eat() {
        System.out.println("тамак");
    }
    public Person (){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}


