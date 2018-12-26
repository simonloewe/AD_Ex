/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnable_test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon.loewe
 */
class RunnableDemo implements Runnable {
        
    @Override
    public void run() {
        System.out.println("starting");
        
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
  
}


