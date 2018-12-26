/*
 * Copyright 2018 Hochschule Luzern - Informatik.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.ad.sw05a02;

import java.util.ArrayList;

/**
 * Demonstration der Bankgeschäfte - Aufgabe 3 N1_EX_ThreadsSynch.
 */
public final class DemoBankAccount {

    /**
     * Privater Konstruktor.
     */
    private DemoBankAccount() {
    }

    /**
     * Wartet bis alle Threads abgearbeitet sind.
     *
     * @param threads Array mit Threads.
     * @throws InterruptedException Interupted.
     */
    private static void waitForCompletion(final Thread[] threads) throws InterruptedException {
        for (final Thread thread : threads) {
            thread.join();
        }
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     * @throws InterruptedException wenn Warten unterbrochen wird.
     */
    public static void main(String[] args) throws InterruptedException {

        final ArrayList<BankAccount> source = new ArrayList<>();
        final ArrayList<BankAccount> target = new ArrayList<>();

        final int amount = 100000;
        final int number = 1;

        //added die account objects in array
        for (int i = 0; i < number; i++) {
            source.add(new BankAccount(amount));
            target.add(new BankAccount()); //mit startkapital 0
        }
        
        System.err.println("Bank accounts");
        for (int i = 0; i < number; i++) {
            System.err.print("source(" + i + ") = " + source.get(i).getBalance() + "; ");
            System.err.println("target(" + i + ") = " + target.get(i).getBalance());
        }

        final Thread[] threads = new Thread[number * 2]; //doppelt so viele Threads wie number weil (1*number source) + (1*number target)

        for (int i = 0; i < number; i++) {
            threads[i] = new Thread(new AccountTask(source.get(i), target.get(i), amount));
            threads[i + number] = new Thread(new AccountTask(target.get(i), source.get(i), amount));
        }
        //alle threads werden gestartet
        for (final Thread thread : threads) {
            thread.start();
        }
        
        waitForCompletion(threads);
        
        System.err.println("Bank accounts");
        for (int i = 0; i < number; i++) {
            System.err.print("source(" + i + ") = " + source.get(i).getBalance() + "; ");
            System.err.println("target(" + i + ") = " + target.get(i).getBalance());
        }
    }
}
