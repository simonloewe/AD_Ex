/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw04a01;

import java.util.ArrayList;

/**
 *
 * @author simon.loewe
 */
public interface Array {

    public int[] myArray = new int[10];

    public void add(int value);

    public void removeByValue(int value);

    public void removeByIndex(int index);

    public void outArray();
}
