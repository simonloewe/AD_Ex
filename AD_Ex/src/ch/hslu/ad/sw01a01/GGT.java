/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw01a01;

/**
 *
 * @author lion
 */
public class GGT {

    public static int ggtIterativ1(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
        return a;
    }

    public static int ggtIterativ2(int a, int b) {
        while ((a != 0) && (b != 0)) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        System.out.println(a+b);
        return (a + b);
    }

    public static int ggtRecursive(int a, int b) {
        if (a > b) {
            return ggtRecursive(a - b, b);
        } else {
            if (a < b) {
                return ggtRecursive(a, b - a);
            } else {
                System.out.println(a);
                return a;
            }
        }

    }
}
