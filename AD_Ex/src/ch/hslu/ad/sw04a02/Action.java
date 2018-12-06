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
        System.out.println("hash value: " + (hash(value)));
        System.out.println("index value: " + index);

        while (myArray[index] != null) {
            if (checkIfValueAlreadyExists(value, index) == true) {
                System.out.println("Value: " + value + " already exists");
                break;
            } else {
                if (index < myArray.length) {
                    index++;
                    System.out.println(index);
                }
            }
        }

        if (myArray[index] == null) {
            myArray[index] = value;
        }
    }

    @Override
    public void removeByValue(int value) {

        int index = (hash(value) % myArray.length);

        if (myArray[index] == value) { //best and most simple case
            myArray[index] = null; //for best practice you shouldnt use null in arrays. But for now we gonna do that (see input AD)
        } else { //now shit is gon be complicated - check untill end 
            for (int i = 0; (index + i) < myArray.length; i++) { //can start with + 1 cause first already checked
                if (myArray[index + i] == value) {
                    myArray[index + i] = null;
                } else {
                    System.out.println("there ist no such value in this array"); 
                }
            }
        }
    }

    @Override
    public void removeByIndex(int index) {
        removeByValue(myArray[index]); //simple, just give value to the value methode and we can save code
    }

    @Override
    public void outArray() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    @Override
    public boolean checkIfValueAlreadyExists(int value, int index) {

        if (myArray[index] != null) { //check current pos, without this there is no chance of 2 value
            for (int i = 0; (index + i) < myArray.length; i++) { //check until end of array
                if (value == myArray[index + i]) { //check for same value
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public void findByValue(int value) {

    }

    @Override
    public void findByIndex(int index) {

    }

    @Override
    public boolean checkIfFuturValues(int index) {

        //if the the next position is not empty there is a chance that a followed element was rearranged in a future position, we now have to check all of them till the end
        if (myArray[index + 1] != null) {
            while ((myArray[index + 1] != null) && index < myArray.length) {
                index++;
            }
            return true;
        } else {
            return false;
        }

    }

}
