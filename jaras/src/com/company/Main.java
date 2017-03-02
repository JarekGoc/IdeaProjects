package com.company;

import java.util.Scanner;

public class Main {

    public static void Pytaj(String tresc) {
        System.out.println(tresc);
    }

    public static void Wy(double a) {
        System.out.println(a);

    }

    public static void main(String args[]) {
        String czy;
        int parametrA, parametrB, parametrC;
        double miejsceZerowe;
        Scanner s = new Scanner(System.in);
        do {
            Pytaj("podaj parametr A: ");
            parametrA = s.nextInt();
            Pytaj("podaj parametr B: ");
            parametrB = s.nextInt();
            Pytaj("podaj parametr C: ");
            parametrC = s.nextInt();

            if (parametrA == 0) Pytaj("nie jest to funkcja kwadratowa");
            else {
                double delta = parametrB * parametrB - 4 * parametrA * parametrC;
                if (delta == 0) {
                    miejsceZerowe = -parametrB / 2 * parametrA;
                    Pytaj("miejsce zerowe tylko 1: ");
                    Wy(miejsceZerowe);
                } else if (delta < 0) Pytaj("brak miejsc zerowych");
                else {
                    miejsceZerowe = (-parametrB + (Math.sqrt(delta))) / 2 * parametrA;
                    double miejsceZerowe2 = (-parametrB - (Math.sqrt(delta))) / (2 * parametrA);
                    Pytaj("miejsca zerowe to: ");
                    Wy(miejsceZerowe);
                    Pytaj("i");
                    Wy(miejsceZerowe2);
                }
            }
            Pytaj("5-exit, dowolny klawisz sprawdź nową funkcję: ");
            czy = s.next();
        } while (czy != "5");
    }
}


