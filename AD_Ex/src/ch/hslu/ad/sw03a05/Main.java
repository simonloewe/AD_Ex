/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw03a05;

/**
 *
 * @author simon.loewe
 */
public class Main {
    public static void main(String[] args){
        InsertNode test = new InsertNode(); 
        test.add(5);
        test.add(1);
        test.add(10);
        test.add(4);
        test.add(12);
        test.add(7);
        test.show();
    } 
}
