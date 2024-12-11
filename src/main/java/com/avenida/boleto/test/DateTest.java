package com.avenida.boleto.test;

import com.avenida.boleto.model.Boleto;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Boleto b1 = new Boleto(1,
                buildDate(2025, 2, 7),
                "115408",
                "Tintas Lux",
                3612.14,
                3,
                4);

        Boleto b2 = new Boleto(2,
                buildDate(2026, 3, 25),
                "578646",
                "Cerâmica Cerbras",
                473.68,
                4,
                5);

        System.out.println(b1);
        System.out.println(b2);
    }

    private static Date buildDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        return calendar.getTime();
    }
}
