
package main;

public class TorpedoTest {
    static hajo h1 = new hajo(((int)(Math.random() * ((7-2 - 0) + 1))));
    public static void main(String[] args) {
        new TorpedoTest().tesztLoves(4);
        System.out.println("Teszt");
        
        
    }
    public String tesztLoves (int poz){
        String t = h1.talalat(poz);
        assert t.equals("talált") : "nem jó a talalat";
        return "";
    }
}
