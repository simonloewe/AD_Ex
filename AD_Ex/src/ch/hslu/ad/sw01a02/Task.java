/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw01a02;

import java.util.ArrayList;

/**
 *
 * @author lion
 */
public class Task {

    /**
     * mit logger.info(""); kann nachher ausgegeben werden
     */

    public static int countTask1 = 0;
    public static int countTask2 = 0;
    public static int countTask3 = 0;
    
    public static ArrayList<Integer> Zahlen = new ArrayList<>();

    public static void task1() {
        countTask1++;
    }
    public static void task2() {
        countTask2++;
    }
    public static void task3() {
        countTask3++;
    }
    
    public static void task(int n) {
        task1();
        task1();
        task1();
        task1();
        for (int i = 0; i < n; i++) { // n* 3
            task2();
            task2();
            task2();
            for (int j = 0; j < n; j++) { //n*n * 2
                task3();
                task3();
            }
        }
        Zahlen.add(n);
        Zahlen.add(countTask1);
        Zahlen.add(countTask2);
        Zahlen.add(countTask3);
        countTask1 = 0;
        countTask2 = 0;
        countTask3 = 0;
    }
    
    public static void outZahlenArrayList(){
        for(int i = 0; i < Zahlen.size(); i++){
            System.out.println(Zahlen.get(i));
        }
    }
}
