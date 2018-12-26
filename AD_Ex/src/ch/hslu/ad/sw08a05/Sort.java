/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw08a05;

import ch.hslu.ad.sw08a04.*;

/**
 *
 * @author simon.loewe
 */
public class Sort {
    
    int aSize = 100000;

    public int[] a = new int[aSize];
    
    public int[] fillingA(){
        for(int i = 0; i < (a.length-1); i++){ //length - 1 damit eines leer belibt als dummy element
            a[(aSize-1)-i] = i; //umgekehrt beschreiben dass es was zu sortieren gibt
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
    
    public static void selectionSort(final int[] a){
        int state; //wo sind wir beim schreiben evtl nicht gebraucht (i)?
        int tmp; //zwischenspeicher  -zwSp
        int tmp3;
        
        for(int i = 0; i < a.length; i++){
            tmp = a[i]; //aktuellen wert in zwSp
            tmp3 = i; //aktuelle pos in zwSp
            
            for(int j = i; j < a.length; j++){//von pos aus hoch bis ende
                if(a[j] < tmp){
                    tmp = a[j];
                    tmp3 = j;
                }
            }
            
            a[tmp3] = a[i];
            a[i] = tmp;
            
        }
        //im ganzen array kleinsten schlüssel suchen
        //diesen dann an unterem ende einfügen
    }
    
    public void outArray(){
        for(int i = 0; i < a.length; i++){
            System.out.println(i + " | " + a[i]);
        }
    }
}
