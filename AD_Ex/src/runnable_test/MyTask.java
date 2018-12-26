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
public final class MyTask implements Runnable {

    @Override
    public void run() {

    }

    public static void main(final String[] args) {
        final MyTask myTask = new MyTask();
        final Thread thread = new Thread(myTask, "MyTask - Thread");
        thread.start(); //Achtung dies funktioniert nur weil oben ein neuer Thread erzeugt wird namens thread!!!
    }
}
