/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw08a06;

import ch.hslu.ad.sw08a05.*;
import ch.hslu.ad.sw08a04.*;

/**
 *
 * @author simon.loewe
 */
public class MainSort {
    
    public static void main(String[] args){
        
        double start;
        double end;
        double time; 
        
        Sort sorting = new Sort();
        sorting.fillingA();
        
       /** System.out.println("insert----------------");
        start = System.currentTimeMillis();
        sorting.in sertionSort2(sorting.fillingA());
        end = System.currentTimeMillis();
        time = (end - start)/1000; //so we have seconds
        System.out.println(time + " sec");

        System.out.println("selection----------------");
        start = System.currentTimeMillis();
        sorting.selectionSort(sorting.fillingA());
        end = System.currentTimeMillis();
        time = (end-start)/1000;
        System.out.println(time + " sec");*/
        
        System.out.println("bubble----------------");
        sorting.outArray();
        start = System.currentTimeMillis();
        sorting.bubbleSort(sorting.fillingA());
        end = System.currentTimeMillis();
        time = (end-start)/1000;
        System.out.println(time + " sec");
        sorting.outArray();
    }
    
}
