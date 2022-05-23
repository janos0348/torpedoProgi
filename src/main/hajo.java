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

    public hajo(int hely) {
        pozicio = new int[]{hely,hely+1,hely+2};
    }
    
public String talalat(int poz){
    int i=0;
    while (i<pozicio.length && poz!=pozicio[i]) {
        i++;
    }
//    for (int i : pozicio) {
//        if (i == poz){
//            return "talált";
//        }
//    }
    return !(i==pozicio.length) ? "talált" :"mellé";
}
}
