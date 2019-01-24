/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw12a05;

import static ch.hslu.ad.sw12a05.QuickSearch.readFileAsString;

/**
 *
 * @author lion
 */
public class Main {
    
    public static void main(String[] args)throws Exception{
        QuickSearch test = new QuickSearch();
        String a = readFileAsString("/Users/lion/Desktop/Book.rtf");
        //QuickSearch.quickSearch(a, "testing");
        System.out.println(QuickSearch.quickSearch(a, "sddawdawD"));
        
    }
    
}
