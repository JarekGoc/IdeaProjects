package com.company;

import com.company.helper.ArithmeticHelper;
import com.company.helper.Stale_moje;
import com.company.helper.StringOperationHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArithmeticHelper liczby = new ArithmeticHelper();
        System.out.println("Wynik dodawania: " + liczby.dodawanie(10, 50));

        int[] tablica = {12, 44, 32, 88, 34, 33, 12};
        System.out.println("Wynik odejmowania: " + liczby.odejmowanie(10, 50));
        System.out.println("Wynik mnożenie: " + liczby.mnożenie(10, 50));
        System.out.println("Wynik dzielenie: " + liczby.dzielenie(10, 50));
        System.out.println("Największa wartość: " + liczby.maksik(tablica));
        System.out.println("Najmniejsz wartość: " + liczby.mini(tablica));


        StringOperationHelper tabik = new StringOperationHelper();
        System.out.println("Długość ciągu:" + tabik.dlugosC("kurczaki pieczone najlepsze są w KFC"));
        Stale_moje s = new Stale_moje();
        s.prn("tojest jakiś teks"+tabik.dlugosC("to jest długi tejstk"));
        Scanner odczyt = new Scanner(System.in);

        s.prn("podaj jakiś tekst i walnij w Entera: ");
        String ciag=odczyt.nextLine();
        s.prn("podaj co chcesz w nim zamienić");
        String wymiana=odczyt.nextLine();
        s.prn("podaj na co to zamienić: ");
        String zamiana=odczyt.nextLine();
        s.prn("Po wymianie:"+tabik.zamianka(ciag,wymiana,zamiana));

        s.prn("podaj jakiś tekst i walnij w Entera: ");
        ciag=odczyt.nextLine();
        s.prn("podaj co chcesz w nim usunąć");
        zamiana=odczyt.nextLine();
        s.prn("Po usuwce:"+tabik.usowka(ciag ,zamiana));
        s.prn("podaj jakiś tekst z separatorem: ");
        ciag=odczyt.nextLine();
        s.prn("podaj separator: ");
        zamiana=odczyt.nextLine();
        s.prn("Kolejne lelementy tablicy:");
        tabik.natab(ciag ,zamiana);

    }
}
