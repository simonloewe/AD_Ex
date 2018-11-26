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
public class InsertNode implements BTree {

    Node root;

    @Override
    public Node insertNewNode(Node current, int value) {
        if (current == null) {
            System.out.println("new node: " + value);
            return new Node(value);
        } 
        
        if (value < current.value) {
            insertNewNode(current.left, value);
            System.out.println("left: " + value);
        } else if (value > current.value) {
            insertNewNode(current.right, value);
            System.out.println("right: " + value);
        }
        System.out.println("return current: " + value);
        return current;
    }

    @Override
    public void add(int value) {
        root = insertNewNode(root, value);
    }
    
    public void show() {
        showTree(root);
    }

    @Override
    public boolean alreadyExists() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void showTree(Node node) {
        if (node != null) {
            showTree(node.left);
            System.out.print(" " + node.value);
            showTree(node.right);
        }
    }

}
