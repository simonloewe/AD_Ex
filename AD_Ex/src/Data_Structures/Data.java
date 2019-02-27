/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Structures;

import java.util.ArrayList;

/**
 *
 * @author simon.loewe
 */
public class Data {
    
    int[] test = new int[10]; //array
    
    public void outTest(){
        for(int i = 0; i < test.length; i++){ //array
            System.out.println(test[i]);
        }
    }
    
    ArrayList<Integer> test2 = new ArrayList<>();
    
    public void outTest2(){
        for(int i = 0; i < test2.size(); i++){
            System.out.println(test2.get(i));
        }
    }
    
}
