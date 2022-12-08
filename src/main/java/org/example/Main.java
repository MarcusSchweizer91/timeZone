package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.SECONDS;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Animal tiger = new Animal("Frank", LocalDate.of(1991, 12, 1));

        System.out.println(tiger);



        System.out.println(DAYS.between(LocalDate.now(),
                LocalDate.of(LocalDate.now().plusYears(1).getYear(),
                        tiger.birthdate().getMonth(),
                        tiger.birthdate().getDayOfMonth())));



    }
}