package com.company;

public class Programmer extends Person {
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public  void coding (){
        }

        @Override
        public String toString() {
            return getName() + "," + getCompanyName() + "," + getDesignation();

        }
}
