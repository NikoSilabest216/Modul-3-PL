
package basic;

/**
 *
 * @author Niko Silabest
 */
public class perhitungan
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
        volume(panjangV, lebarV, tinggiV);
    }

    public int volume(int panjangV, int lebarV, int tinggiV) {
       return panjangV*lebarV*tinggiV;
    }

    

    public int luas(int panjang, int lebar, int tinggi) {
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
}
