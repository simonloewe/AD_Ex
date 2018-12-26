/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnable_test;

/**
 *
 * @author simon.loewe
 */
public class TestThread {

    public static void main(String args[]) {
        final RunnableDemo myTask = new RunnableDemo();
        final Thread thread = new Thread(myTask, "MyTask Thread");
        final Thread thread2 = new Thread(myTask, "MyTask2 Thread");

        thread.start();
        thread2.start(); 
    }
}
