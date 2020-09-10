package com.company;


public class Main {

    public static void main(String[] args) {
        psina d1 = new psina("Mike", 2);
        psina d2 = new psina("Helen", 7);
        psina d3 = new psina("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        Book b1 = new Book("BBC", "Helen");
        Book b2 = new Book("NTV", "Bob");
        Book b3 = new Book("TNT");
        b3.setAuthor("Mike");
        System.out.println(b3);

        Ball ba1 = new Ball("Backetball", 10);
        Ball ba2 = new Ball("Football", 10);
        Ball ba3 = new Ball("hockey", 10);
        ba3.setgame("rainbow six siege");
        System.out.println(ba3);
    }

}
