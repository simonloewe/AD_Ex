/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw04a02;

/**
 *
 * @author simon.loewe
 */
public class Main {

    public static void main(String[] args) {
        Action test = new Action();
        test.add(3);
        test.add(124212);
        test.add(3);
        test.add(123);
        test.add(31);
        test.outArray();
    }
}
