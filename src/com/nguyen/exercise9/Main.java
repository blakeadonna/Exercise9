package com.nguyen.exercise9;
//Johnny Nguyen | Exercise 9 | 12 March 2019

abstract class Contacts {
    private String name;

    public Contacts(String name){
        this.name = name;
    }

    public abstract void contact();
}

class Email extends Contacts {
    private String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }


    @Override
    public void contact() {
        System.out.println("Emailing to: " + email );

    }
}

class Phone extends Contacts {
    private String phone;

    public Phone(String name, String phone) {
        super(name);
        this.phone = phone;
    }



    @Override
    public void contact() {
        System.out.println("Calling: " + phone);
    }
}



public class Main {

    public static void main(String[] args) {
        Email kaede = new Email("Kaede Takagaki", "infinote@chaldea.net");
        Phone kaede2 = new Phone("Kaede Takagaki", "714-345-8678");
        kaede.contact();
        kaede2.contact();


    }
}
