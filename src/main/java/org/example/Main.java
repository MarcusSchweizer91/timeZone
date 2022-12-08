package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static java.time.temporal.ChronoUnit.DAYS;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Animal tiger = new Animal("Frank", LocalDate.of(1991, 12, 15));

        LocalDate nexBirthday;

        if (LocalDate.now().getMonth().getValue()>=tiger.birthdate().getMonth().getValue() && LocalDate.now().getDayOfMonth()>=tiger.birthdate().getDayOfMonth()){

        }

        System.out.println(tiger);

        Period p = Period.between(LocalDate.now(), LocalDate.of(LocalDate.now().plusYears(1).getYear(),tiger.birthdate().getMonth(), tiger.birthdate().getDayOfMonth()));



        System.out.println(p);

        System.out.println(DAYS.between(LocalDate.now(),
                LocalDate.of(LocalDate.now().plusYears(1).getYear(),
                        tiger.birthdate().getMonth(),
                        tiger.birthdate().getDayOfMonth())));





        LocalDate orignalBirthDate = LocalDate.of(1991, Month.DECEMBER, 7);
        LocalDate today = LocalDate.now();
        int year = today.getYear();

        LocalDate nextBirthDate = orignalBirthDate.withYear(year);
        if (nextBirthDate.isBefore(today)) {
            nextBirthDate = nextBirthDate.plusYears(1);
        }

        System.out.println("Next birthday = " + DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(nextBirthDate));

    }
}