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
public class Main {
    public static void main(String[] args){
        Counter test = new Counter(); 
        final Thread[] threads = new Thread[10];
        
        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(new Worker(test));
        }
        
        for(final Thread thread : threads){
            thread.start();
        }
        
    }
}
