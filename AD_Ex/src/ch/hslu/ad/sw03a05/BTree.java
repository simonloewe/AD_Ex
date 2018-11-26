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
public interface BTree {
    
    public Node insertNewNode(Node current, int value);
    public boolean alreadyExists(); 
    public void add(int value);
}
