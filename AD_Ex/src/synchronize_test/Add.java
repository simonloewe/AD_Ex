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
public class Add implements Runnable{

    int a;
    int goTo = 200;

    
    
    public int addUp() {
        
        for (int i = 0; i < goTo; i++) {
            a = i; 
        }
        return a;
    }
    
    public void outA(){
        System.out.println(a);
    }
    
    @Override
    public void run(){
        this.addUp();
    }

}
