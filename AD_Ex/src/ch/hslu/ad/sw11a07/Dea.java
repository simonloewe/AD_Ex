/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw11a07;

import java.util.Random;

/**
 *
 * @author lion
 */
public class Dea {
    //1:0 am anfang und ende
    //1/0 abwechselnd
    //0 immer alleine
    //1 immer in ungraden gruppen

    int size = 11;
    public int[] test = new int[size];
    boolean state;
    //remove abba and place test instead in isCase methode
    int abba[] = {0,1,0,1,1,1,0,1,1,1,0};
    
    public int[] fillTest() {

        for (int i = 0; i < test.length; i++) {
            test[i] = getRandomInt(0, 1);
        }

        return test;
    }

    public static int getRandomInt(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public boolean isCase() {

        for (int i = 0; i < abba.length; i++) {
            //erste und letzte müssen 0 sein
            if (abba[0] != 0 && abba[abba.length - 1] != 0) {
                return false;
            }
            //folge nullen
            if (i < size - 2) {
                if (abba[i] == abba[i + 1] && abba[i + 1] < (size - 1)) {
                    if (abba[i] == 0 && abba[i + 1] == 0) {
                        return false;
                    }
                }
            }

            //ungrade 1er
            if (i < size - 3) {
                int j = i;
                while (abba[j] == 1 && j < (size - 1)) {
                    j++;
                }

                if (j != i) {
                    if ((j % 2) != 0) {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    public void getAnswer() {
        /**if (isCase() == true) {
            for (int i = 0; i < test.length; i++) {
                System.out.println(test[i]);
            }

            System.out.println(isCase());
        }*/
            System.out.println(isCase());
        
    }
}
