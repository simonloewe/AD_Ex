/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw05a01;

import java.awt.Color;

/**
 *
 * @author simon.loewe
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Canvas.getCanvas();

        Ball b = new Ball(); 
        
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread(b, "myThread"+i);
            t.start();
            Thread.sleep(500); //so there is distance between the balls
            System.out.println(t.getId() + t.getName());
        }
    }

}
