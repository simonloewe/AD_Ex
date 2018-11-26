/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw04a02;

import static ch.hslu.ad.sw04a01.Array.myArray;
import static java.util.Objects.hash;

/**
 *
 * @author simon.loewe
 */
public class Action implements Array {

    @Override
    public void add(int value) {
        int index = (hash(value) % myArray.length);
        while (myArray[index] != null) {
            if (sameValue(value) == true) {
                System.out.println("Value: " + value + " already exists");
                break;
            } else {
                while (index < myArray.length) {
                    index++;
                }
            }
        }

        if (myArray[index] == null) {
            myArray[index] = value;
        }
    }

    @Override
    public void removeByValue(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeByIndex(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void outArray() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    @Override
    public boolean sameValue(int value) {
        int index = (hash(value) % myArray.length);
        if (myArray[index].equals(value)) {
            return true;
        } else {
            return false;
        }
    }

}
