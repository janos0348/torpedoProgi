
package main;

public class TorpedoTest {
    static hajo h1 = new hajo();
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
