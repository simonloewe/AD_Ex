/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw04a01;

import static java.util.Objects.hash;

/**
 *
 * @author simon.loewe
 */
public class Action implements Array {

    public int value;

    @Override
    public void add(int value) {
        int index = (hash(value) % myArray.length);
        System.out.println("Value: " + value);
        System.out.println("Hash of value: " + hash(value));
        System.out.println("Array length: " + myArray.length);
        System.out.println("Modulo value: " + hash(value) % myArray.length);

        if (myArray[index] == 0) {
            myArray[index] = value;
        } else {
            System.out.println("An dieser Stelle befindet sich bereits ein Element");
            //nothing
        }
        System.out.println("------------------");
    }

    @Override
    public void removeByValue(int value) {
        int index = (hash(value) % myArray.length);
        if (myArray[index] != 0) {
            myArray[index] = 0;
        } else {
        }

    }

    @Override
    public void removeByIndex(int index) {
        if (myArray[index] != 0) {
            myArray[index] = 0;
        } else {
        }
    }

    @Override
    public void outArray() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

}
