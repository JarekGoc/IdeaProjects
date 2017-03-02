package com.company.helper;

/**
 * Created by rickwind on 2017-02-26.
 */
public class ArithmeticHelper {
    int liczba1;
    int liczba2;

    public int dodawanie(int a, int b){
        liczba1=a;
        liczba2=b;
        int wynik=a+b;
        return wynik;
    }

    public int odejmowanie(int a, int b){
        liczba1=a;
        liczba2=b;
        int wynik=a-b;
        return wynik;
    }

    public int mnożenie(int a, int b){
        liczba1=a;
        liczba2=b;
        int wynik=a*b;
        return wynik;
    }

    public double dzielenie(int a, int b){
        liczba1=a;
        liczba2=b;
        double wynik=((double)a/(double)b);
        return wynik;
    }

  public int maksik(int tablica[]){
        int maks=tablica[0];
        for (int i=1;i<tablica.length;i++){
            if (tablica[i]>maks) maks = tablica[i];
        }
        return maks;

  }
    public int mini(int tablica[]){
        int minimum=tablica[0];
        for (int i=1;i<tablica.length;i++){
            if (tablica[i]<minimum) minimum = tablica[i];
        }
        return minimum;

    }





}
