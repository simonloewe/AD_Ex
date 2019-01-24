/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw05a02;

/**
 *
 * @author lion
 */
public class Main {
    
    public static void main(String[] args){
        final Thread[] threads = new Thread[5];
        for(int i = 0; i < 5; i++){
            threads[i] = new Thread(new BankAcc())
        }
    }
    
}
