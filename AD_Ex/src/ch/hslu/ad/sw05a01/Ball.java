/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw05a01;

/**
 *
 * @author simon.loewe
 */
public class Ball extends Circle implements Runnable{

/** one could add colour changing to the circle class now.
 * because the point of this ex is to understand the threads im leaving that
 * for now... 
*/ 
    @Override
    public void run() {
        Circle c = new Circle(); 
        c.makeVisible();
        c.slowMoveVertical((400-diameter));
    }
}
