/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronize_test;

/**
 *
 * @author lion
 */
public class Main {
    
    public static void main(String[] args) throws InterruptedException{
        
        Add a = new Add();
        
        for(int i = 0; i < 5; i++){
            Thread t = new Thread(a, "testing");
            t.start();
            Thread.sleep(500);
        }
        a.outA();
    }
    
}
