/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw01a01;

/**
 *
 * @author lion
 */
public class GGTMain {
    public static void main(String[] args){
        GGT test = new GGT();
        GGT.ggtIterativ1(200, 50);
        GGT.ggtIterativ2(200, 50);
        GGT.ggtRecursive(200, 50);
             
    }
    
}
