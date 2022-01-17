package com.company;

public class Singer extends Person{
   private String bandName;

   public  void singing() {
   }
   public  void playGitar() {
   }

   public String getBandName() {
      return bandName;
   }

   public void setBandName(String bandName) {
      this.bandName = bandName;
   }

   @Override
   public String toString() {
      return "\n" + getName() + "," + getDesignation() + "," + getBandName();
   }
}
