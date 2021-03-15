package basic;

/**
 *
 * @author Niko Silabest
 */
public class balok 
{
        private int panjang;
        private int lebar;
        private int tinggi;
    /**
     * @return the panjang
     */
    public int getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    public int getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the tinggi
     */
    public int getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
        
   protected void hasil ()
   {
       perhitungan ph = new perhitungan();
       System.out.println("Hasil Luas Balok: " +ph.luas);
       System.out.println("Hasil Volume Balok: "+ph.volume);
   }
        
    
}
