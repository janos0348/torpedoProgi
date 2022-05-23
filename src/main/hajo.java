/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author hallgato
 */
public class hajo {
    int[] pozicio;

    public hajo() {
        pozicio = new int[]{2,4,3};
    }
    
public String talalat(int poz){
    for (int i : pozicio) {
        if (i == poz){
            return "talált";
        }
    }
    return "mellé";
}
}
