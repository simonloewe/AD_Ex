/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw13a04;

/**
 *
 * @author lion
 */
public class AdjaMatrix {
    
    private int noOfNodes;
    public String[] nodeName;
    public boolean[][] adjaMx;
    
    AdjaMatrix(final String[] nodeName, final boolean[][] adjaMx){
        this.noOfNodes = nodeName.length;
        this.nodeName = nodeName;
        this.adjaMx = adjaMx;
    }
    
    //name stationen
    public String getNodeName(final int k){
        return nodeName[k];
    }
    
    //anzahl stationen
    public int getNoOfNodes(){
        return noOfNodes;
    }
    
    public boolean isEdge(final int i, final int j){
        return adjaMx[i][j];
    }
    
    
   
}
