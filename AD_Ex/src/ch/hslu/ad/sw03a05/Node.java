/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw03a05;

/**
 *
 * @author simon.loewe
 */
public class Node {
    
    public int value; 
    
    public Node(int value){
        this.value = value;
        right = null;
        left = null;
    }
    
    Node left;
    Node right;
    
}
