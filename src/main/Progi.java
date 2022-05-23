package main;

import java.util.Scanner;

public class Progi {

    static int talalat;
    static int lovesek;
    static int palya = 7;
    static hajo h1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        hajoGeneral(palya);
        loves(palya);
    }

    private static void hajoGeneral(int hossz) {
        h1 = new hajo((int) (Math.random() * ((palya - 2 - 0) + 1)));
    }

    private static int loves(int hossz) {
        int loves = 0;
        while (!sulyedt(h1.pozicio.length)) {
            if (loves>6 || loves<0){
                System.out.println("A pálya 0 és 6 között lőhető:");
            }
            System.out.println("Lőjj:");
            loves = sc.nextInt();
            System.out.println(h1.talalat(hossz)); 
           if (h1.talalat(loves).equals("talált")) {
                talalat++;
            }
            lovesek++;
        }
        System.out.println("Sülyedt "+lovesek+" lövésből.");
        return loves;
    }   
    private static boolean sulyedt(int hajohossz) {
            boolean sulyedt = talalat == hajohossz;
        return sulyedt;
    }   

}
