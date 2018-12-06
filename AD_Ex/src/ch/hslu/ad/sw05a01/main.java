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
public class main {

    public static void main(String[] args) {

        Ball test = new Ball();
        Thread thread = new Thread(test, "-------------------------------------");
        thread.start();
        Thread aa = new Thread(test, "-------------------------------------");
        aa.start();
        Thread bbb = new Thread(test, "-------------------------------------");
        bbb.start();
        
        /**Canvas.getCanvas();

        Circle ball = new Circle();
        ball.makeVisible();
        ball.slowMoveVertical((400-68));*/
    }

}
