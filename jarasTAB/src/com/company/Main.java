package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tablica[] = new int[10];
        int suma=0;
        for (int i=0;i<10;i++){
            System.out.println("Podaj wartość dla pozycji: "+(i+1));
            tablica[i]=s.nextInt();


        }

        for (int kolejna : tablica ){
        suma+=kolejna;



        }
        System.out.println("suma: "+suma);
        double srednia = (double) suma /10;
        System.out.print("średnia: ");
        System.out.println(srednia);
        System.out.print("dł tablicy to: "+tablica.length);





    }
}
