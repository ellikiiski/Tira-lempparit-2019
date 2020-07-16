/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiisk
 */
public class Yhteys implements Comparable<Yhteys>{
    private int minne;
    private int nopeus;
    
    public Yhteys(int minne, int nopeus) {
        this.minne = minne;
        this.nopeus = nopeus;
    }

    public int getMinne() {
        return minne;
    }

    public int getNopeus() {
        return nopeus;
    }

    @Override
    public int compareTo(Yhteys y) {
        return Math.max(this.nopeus, y.nopeus); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
