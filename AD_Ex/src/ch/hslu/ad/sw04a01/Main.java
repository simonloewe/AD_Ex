/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw04a01;

/**
 *
 * @author simon.loewe
 */
public class Main {

    public static void main(String[] args) {
        Action test = new Action();
        test.add(1120);
        test.add(141412);
        test.add(23123);
        test.add(140);
        test.outArray();
        System.out.println("------------------");

        test.removeByIndex(1);
        test.removeByValue(141412);
        test.outArray();
        System.out.println("------------------");

    }
}
