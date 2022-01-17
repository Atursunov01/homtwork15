package com.company;

public class Danser extends Person{
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing() {

    }

    @Override
    public String toString() {
        return  "\n" + getName() +"," + getDesignation() + "," + getGroupName();
    }
}
