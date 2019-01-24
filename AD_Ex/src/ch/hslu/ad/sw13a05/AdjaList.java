/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw13a05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author lion
 */
public class AdjaList {
    private final Map<Node, Set<Node>> map; 
    
    AdjaList(){
        map = new HashMap<>();
    }
    
    public boolean isNodeInAdjaList(final Node node){
        return map.containsKey(node);
    }
    
    public boolean addNode(final Node node){
        if(!isNodeInAdjaList(node)){
            map.put(node, new HashSet<>());
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isEdgeInAdjaList(final Node from, final Node to){
        if(isNodeInAdjaList(from)){
            return map.get(from).contains(to);
        }else{
            return false;
        }
    }
    
    public boolean addEdge(final Node from, final Node to){
        if(isNodeInAdjaList(from) && isNodeInAdjaList(to)){
            if(!isEdgeInAdjaList(from, to)){
                map.get(from).add(to);
                return true;
            }else{return false;}
        }else{return false;}
    }
}
