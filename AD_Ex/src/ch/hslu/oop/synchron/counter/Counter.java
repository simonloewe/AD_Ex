/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.synchron.counter;

/**
 *
 * @author lion
 */
public class Counter {
    int x;
    int anzahl = 10;
    
    
    //moeglichkeit 1 ganze methode
    public synchronized void incrementCounter(){
        for(int i = 0; i < anzahl; i++){
            x++;
        }
        System.out.println();
    }
    
    //moeglichkeit 2 nur einzelnen block
    public void incrementCounter2(){
        synchronized(this){
        for(int i = 0; i < anzahl; i++){
            x++;
        }}
        System.out.println();
    }
}
