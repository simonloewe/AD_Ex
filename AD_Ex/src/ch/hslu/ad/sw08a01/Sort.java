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
public class Sort {

    public int[] a = new int[10];
    
    public int[] fillingA(){
        for(int i = 0; i < a.length; i++){
            a[9-i] = i; 
        }
        
        return a;
    }
    
    public static void insertionSort2(final int[] a) { 
        int elt;
        int j;

        for (int i = 2; i < a.length; i++) {
            elt = a[i]; //elt den momentanen wert übergeben
            a[0] = elt; //einen dummy element? 
            j = i; //j den momentane fortschritt übergeben

            while (a[j - 1] > elt) { //wenn el 1 weiter unten grösser als das momentane dann: 
                a[j] = a[j - 1]; //j mit dem grösseren unteren tauschen
                j--; //im nächsten Rundgang der schleifer weiter nach unten
            } //schleife solange, bis entweder nicht mehr zutrifft oder ganz unten ist
            a[j] = elt; //an stelle j das el welches ursprüunglich an i gefunden wurde
        }
    }
       
    public void outArray(){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
