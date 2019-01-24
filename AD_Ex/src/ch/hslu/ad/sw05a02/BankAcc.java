/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw05a02;

/**
 *
 * @author lion
 * 
 * !! Achtung diese klasse entspricht nicht 1:1 der des inputs. dies aus dem grund, 
 * dass auf dem provided code ein copyright der hslu ist. ich schreibe daher eine eigene
 * aehnliche (gleichheit gibt es ja nicht) klasse
 */
public class BankAcc {
    private int kontoStand; 
    
    public BankAcc[] zielAcc = {new BankAcc(0), new BankAcc(0)};
    public BankAcc[] herkAcc = {new BankAcc(1000), new BankAcc(1000)};
    
    
    
    public BankAcc(final int kontoStand){
        this.kontoStand = kontoStand;
    }
    
    public int getGuthaben(){
        return this.kontoStand;
    }
    
    public void aufladen(int summe){
        this.kontoStand += summe;
    }
    
    public void ueberweisen(final BankAcc ziel, final int summe){
        this.kontoStand -= summe;
        ziel.aufladen(summe);
    }
    
    public void aufgabe(final BankAcc ziel, final BankAcc herkunft, final int summe){
        herkunft.getGuthaben();
        
        herkunft.ueberweisen(ziel, summe);
    }
}
