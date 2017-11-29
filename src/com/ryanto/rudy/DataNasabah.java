
package com.ryanto.rudy;
/**
 *
 * @author Rudy Ryanto
 */
public class DataNasabah {
    private String namaNasabah;
    private String phone;
    private String home;
    private String alamat;
    private String status;
    private int jumlahTanggungan;
    private double penghasilan;
    private double penghasilanTambahan;
    private double bonus;
    private double penghasilanTotal;

    
    public double calculateTotalPenghasilan(double penghasilanTmbh,double penghasilan,double bonus)
    {
        return penghasilanTmbh+penghasilan+bonus;
    }
    
    /**
     * @return the namaNasabah
     */
    public String getNamaNasabah() {
        return namaNasabah;
    }

    /**
     * @param namaNasabah the namaNasabah to set
     */
    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the home
     */
    public String getHome() {
        return home;
    }

    /**
     * @param home the home to set
     */
    public void setHome(String home) {
        this.home = home;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the jumlahTanggungan
     */
    public int getJumlahTanggungan() {
        return jumlahTanggungan;
    }

    /**
     * @param jumlahTanggungan the jumlahTanggungan to set
     */
    public void setJumlahTanggungan(int jumlahTanggungan) {
        this.jumlahTanggungan = jumlahTanggungan;
    }

    /**
     * @return the penghasilan
     */
    public double getPenghasilan() {
        return penghasilan;
    }

    /**
     * @param penghasilan the penghasilan to set
     */
    public void setPenghasilan(double penghasilan) {
        this.penghasilan = penghasilan;
    }

    /**
     * @return the penghasilanTambahan
     */
    public double getPenghasilanTambahan() {
        return penghasilanTambahan;
    }

    /**
     * @param penghasilanTambahan the penghasilanTambahan to set
     */
    public void setPenghasilanTambahan(double penghasilanTambahan) {
        this.penghasilanTambahan = penghasilanTambahan;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the penghasilanTotal
     */
    public double getPenghasilanTotal() {
        return penghasilanTotal;
    }

    /**
     * @param penghasilanTotal the penghasilanTotal to set
     */
    public void setPenghasilanTotal(double penghasilanTotal) {
        this.penghasilanTotal = penghasilanTotal;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
