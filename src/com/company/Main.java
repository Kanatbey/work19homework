package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Pets sheep1 = new Sheep(37.4, 4, "female", "Karakoi1");
        Pets sheep2 = new Sheep(25.9, 1, "female", "Karakoi2");
        Pets sheep3 = new Sheep(39.8, 5, "female", "Karakoi3");

        Pets cow1 = new Cow(138.5, 3, "female", "Sarala1");
        Pets cow2 = new Cow(147.5, 3, "female", "Sarala2");
        Pets cow3 = new Cow(157.5, 3, "female", "Sarala3");
        Pets cow4 = new Cow(198.5, 3, "female", "Sarala4");
        Pets cow5 = new Cow(168.5, 3, "female", "Sarala5");

        Pets horse1 = new Horse(321.3, 4, "black", "male", "Akkula");
        Pets horse2 = new Horse(321.3, 4, "black", "male", "Akkula");

        Pets[] pets = {sheep1, sheep2, sheep3, cow1, cow2, cow3, cow4, cow5, horse1, horse2};


        Sheep[] sheeps1 = new Sheep[3];
        Cow[] cows1 = new Cow[5];
        Horse[] horses1 = new Horse[2];

        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;


        for (Pets a : pets) {
            if (a instanceof Sheep) {
                sheeps1[counter++] = ((Sheep) a);
            }
            if (a instanceof Cow) {
                cows1[counter1++] = ((Cow) a);
            }
            if (a instanceof Horse) {
                horses1[counter2++] = ((Horse) a);
            }
        }
        Pets[] pets2 = {sheep1, cow1, horse1};
        Sheep[] sheeps2 = new Sheep[1];
        Cow[] cows2 = new Cow[1];
        Horse[] horses2 = new Horse[1];
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (Pets a : pets2) {
            if (a instanceof Sheep) {
                sheeps2[count++] = ((Sheep) a);
            }
            if (a instanceof Cow) {
                cows2[count1++] = ((Cow) a);
            }
            if (a instanceof Horse) {
                horses2[count2++] = ((Horse) a);
            }
        }
        Farm farm1 = new Farm("Koruk", cows1, sheeps1, horses1, "Shaaban");
        Farm farm2 = new Farm("Koruk", cows2, sheeps2, horses2, "Shaaban");

        System.out.println(farm2);

    }
}
