/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw08a01;

/**
 *
 * @author simon.loewe
 */
public class MainSort {
    
    public static void main(String[] args){
        Sort sorting = new Sort();
        sorting.fillingA();
        sorting.outArray();
        System.out.println("----------------");
        sorting.insertionSort2(sorting.fillingA());
        sorting.outArray();
        
    }
    
}
