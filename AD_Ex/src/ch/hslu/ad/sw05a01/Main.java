/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw05a01;

/**
 *
 * @author lion
 */
public class Main {
    public static void main(String[] args){
         
        Canvas.getCanvas();
        Circle ball = new Circle();
        ball.makeVisible();
        ball.slowMoveVertical((400-68));
        
    }
}
