/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw09a04;

/**
 *
 * @author simon.loewe
 */
public class MergeSort {

    public int size = 100;
    private int index = 0;
    private String OutOfSpace = "Array full";
    
    public int[] a = new int[size];

    public void outA() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " | " + a[i]);
        }
        System.out.println("Index = " + getIndex()); 
    }

    private int getIndex() {
        int i = 0;
        while((a[i] != 0)&&(i < 99)){
            i++;
            index = i; 
        }
        return index; 
    }

    public void insert(int insert) {
        index = getIndex();
        a[index] = insert; 
    }
    
    public void rebase(){
    }
    
    public void reOrgan(int upper, int lower){
        int tmp = a[upper]; 
        a[upper] = a[lower];
        a[lower] = tmp;
    }
    
    public void fillArray(){
        for(int i = 1; i <= a.length; i++){
            insert(i);
        }
    }
}
