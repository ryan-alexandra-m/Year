package com.company;

public class Main {

    public static void main(String[] args) {
        Holiday christmas = new Holiday(12, 25, "Christams", "Santa claus, jesus, nationally organized religion", true);
        System.out.println(christmas.celebrate());
        System.out.println(christmas.isToday());

        Holiday easter = new Holiday(4, 17, "Easter", "Easter Bunny, lost eggs, sugar high children", true);
        System.out.println(easter.celebrate());
        System.out.println(easter.isToday());


        Holiday hugAPlumberDay = new Holiday(4, 25, "National Hug a Plumber Day ", "Just ask first...", false);
        System.out.println(hugAPlumberDay.celebrate());
        System.out.println(hugAPlumberDay.isToday());

    }
}
