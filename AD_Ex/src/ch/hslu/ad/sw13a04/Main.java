/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw13a04;

/**
 *
 * @author lion
 */
public class Main {
    public static void main(String[] args){
        String[] nodeName = {"a", "b", "c", "d", "e"};
        boolean[][] adjaMx = {
            {false, true, true, true, false},//0
            {true, false, true, false, false},//1
            {false, false, true, true, false},//2
            {false, false, false, false, false},//3
            {false, false, false, false, false}};//4
        AdjaMatrix g = new AdjaMatrix(nodeName, adjaMx);
        System.out.println(g.isEdge(2, 1));
    }
}
