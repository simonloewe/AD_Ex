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
public class Worker implements Runnable {
    
    private final Counter counter;
    
    Worker(final Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1; i++){
            this.counter.incrementCounter();
        }
    }
}
