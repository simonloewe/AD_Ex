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
        test.add(22);
        test.add(22);
        test.outArray();
        test.checkIfFuturValues(3);
        test.removeByValue(123);
        System.out.println("---------");
        test.outArray();
    }
}
