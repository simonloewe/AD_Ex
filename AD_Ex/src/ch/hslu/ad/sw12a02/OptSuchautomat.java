/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw12a02;

/**
 *
 * @author lion Optimierter Suchautomat welcher nach dem Pattern ANANAS sucht
 */
public class OptSuchautomat {

    public String a = "Ananas";
    public String folge = "aabahdawdwadwdsdawdadadafbbjbwawdananas";

    public int stateSearch() {

        int i = 0;
        String b;
        int state = -1;
        int notFound = -1;

        do {
            switch (state) {
                case -1:
                    if (folge.charAt(i) == 'a') {
                        state = 1;
                    }
                    break;
                case 1:
                    if (folge.charAt(i) == 'n') {
                        state = 2;
                    } else {
                        state = -1;
                    }
                    break;
                case 2:
                    if (folge.charAt(i) == 'a') {
                        state = 3;
                    } else {
                        state = -1;
                    }
                    break;
                case 3:
                    if (folge.charAt(i) == 'n') {
                        state = 4;
                    } else {
                        state = -1;
                    }
                    break;
                case 4:
                    if (folge.charAt(i) == 'a') {
                        state = 5;
                    } else {
                        state = -1;
                    }
                    break;
                case 5:
                    if (folge.charAt(i) == 's') {
                        state = 6;
                    } else {
                        if (folge.charAt(i) == 'n') {
                            state = 4;
                        }else{state = -1;}
                    }
                    break;
            }
            i++;

        } while ((state != 6) && i < folge.length());
        
        if (state == 6) {
            return (i - 6);
        }
        return notFound;
    }
}
