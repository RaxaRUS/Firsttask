package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        //Программисты
        Programmist tom = new Programmist("Tom", 25, "Microsoft", 19000, "C++", 5);
        Programmist andrey = new Programmist("Andrey", 20, "Microsoft", 22000, "Java", 2);
        Programmist samuel = new Programmist("Samuel", 32, "Microsoft", 27000, "C#", 7);

        //Художники
        Artist george = new Artist("George", 19, "Microsoft", 12000, "Concept", 1);
        Artist robert = new Artist("Robert", 27, "Microsoft", 15000, "Illustrations", 3);
        Artist joe = new Artist("Joe", 39, "Microsoft", 32000, "3d", 9);

        //Вывод
        tom.display();
        andrey.display();
        samuel.display();
        george.display();
        robert.display();
        joe.display();
    }
}
