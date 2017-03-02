package com.company.helper;

/**
 * Created by rickwind on 2017-02-27.
 */
public class StringOperationHelper {

    public int dlugosC(String ciag) {
        int dl = (int) ciag.length();
        return dl;


    }

    public String zamianka(String ciag, String wymiana, String zamiana) {
        ciag = ciag.replaceAll(wymiana, zamiana);

        return ciag;


    }

    public String usowka(String ciag, String zamiana) {
        ciag = ciag.replaceAll(zamiana, "");

        return ciag;


    }

    public void natab(String ciag, String zamiana) {
        String[] NoweTab = null;
        NoweTab = ciag.split(zamiana);
        for (int i = 0; i < NoweTab.length; i++) {
            System.out.println(NoweTab[i]);
        }


    }


}