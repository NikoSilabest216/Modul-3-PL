/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author Niko Silabest
 */
public class perhitungan extends drive
{
    balok sisi = new balok();
    int luas;
    int volume;
    
     void Perhitungan()
    {
        int panjang = sisi.getPanjang();
        int lebar   = sisi.getLebar();
        int tinggi  = sisi.getTinggi();
        luas(panjang, lebar, tinggi);
        
        int panjangV=sisi.getPanjang();
        int lebarV=sisi.getLebar();
        int tinggiV=sisi.getTinggi();
        volume= panjangV*lebarV*tinggiV;
    }

    

    public void luas(int panjang, int lebar, int tinggi) {
        luas=2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
}
