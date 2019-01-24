/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw12a05;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author lion
 */
public class QuickSearch {

   // public String[] a;
    
    
    public static String readFileAsString(String Book)throws Exception{
        String a = "";
        a = new String(Files.readAllBytes(Paths.get(Book)));
        return a;
    }
    
    public static int quickSearch(final String a, final String p) {
        final int n = a.length();
        final int m = p.length();

        final int range = 256; //ASCII Range
        final int[] shift = new int[range]; //Int Array mit länge ASCII

        for (int i = 0; i < range; i++) {
            shift[i] = m + 1;
        }

        for (int i = 0; i < m; i++) {
            shift[p.charAt(i)] = m - i;
        }

        int i = 0;
        int j = 0;
        do {
            if (a.charAt(i + j) == p.charAt(j)) {
                j++;
            } else {
                if ((i + m) < n) {
                    i += shift[a.charAt(i + m)];
                    j = 0;
                } else {
                    break;
                }
            }
        } while ((j < m) && ((i + m) <= n));

        if (j == m) {
            return i;
        } else {
            return -1;
        }

    }

}
