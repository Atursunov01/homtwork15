package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Programmer programmer =  new Programmer();
        programmer.setName("elnura");
        programmer.setDesignation("texnik");
        programmer.setCompanyName("GOOGLE");

        programmer.learn();
        programmer.eat();
        programmer.walk();

        System.out.println("___________________________");

        Danser danser = new Danser();
        danser.setName("наргиза");
        danser.setDesignation("бийлоо");
        danser.setGroupName("кызбурак");

        System.out.println(danser);
        danser.learn();
        danser.walk();
        danser.eat();
        danser.dancing();
        System.out.println("________________________________");

        Singer singer = new Singer();
        singer.setName("Azho");
        singer.setBandName("zhebe");
        singer.setDesignation("yrdoo");

        System.out.println(singer);

            singer.learn();
            singer.walk();
            singer.eat();
            singer.singing();
            singer.playGitar();
        }
    }

