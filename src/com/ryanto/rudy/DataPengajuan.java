package com.ryanto.rudy;

import com.ryanto.rudy.DataNasabah;
/**
 *
 * @author Rudy Ryanto
 */
public class DataPengajuan {

    private double hargaBarang;
    private double sukuBunga;
    private int Durasi;
    private double uangMuka;
    private String Status;
    private double totalKredit;
    private double pokokCicilan;
    private double bungaCicilan;
    private double cicilanPerbulan;

    public double calculatePokokCicilan() {

        return getHargaBarang() - getUangMuka();
    }

    public double calculateBungaCicilan() {
        return calculatePokokCicilan() * (getSukuBunga()/100) * getDurasi() / 12;
    }

    public double calculatetotalKredit() {
        return calculatePokokCicilan() + getBungaCicilan();
    }

    public double calculateCicilanPerBulan() {
        return calculatetotalKredit() / getDurasi();
    }

    public double calculatelimitPinjaman(double penghasilan, int jumlahTanggungan) {
        return penghasilan / (jumlahTanggungan + 1);
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the sukuBunga
     */
    public double getSukuBunga() {
        return sukuBunga;
    }

    /**
     * @param sukuBunga the sukuBunga to set
     */
    public void setSukuBunga(double sukuBunga) {
        this.sukuBunga = sukuBunga;
    }

    /**
     * @return the Durasi
     */
    public int getDurasi() {
        return Durasi;
    }

    /**
     * @param Durasi the Durasi to set
     */
    public void setDurasi(int Durasi) {
        this.Durasi = Durasi;
    }

    /**
     * @return the uangMuka
     */
    public double getUangMuka() {
        return uangMuka;
    }

    /**
     * @param uangMuka the uangMuka to set
     */
    public void setUangMuka(double uangMuka) {
        this.uangMuka = uangMuka;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the cicilan
     */
    public double getCicilan() {
        return getTotalKredit();
    }

    /**
     * @param cicilan the cicilan to set
     */
    public void setCicilan(double cicilan) {
        this.setTotalKredit(cicilan);
    }

    /**
     * @return the pokokCicilan
     */
    public double getPokokCicilan() {
        return pokokCicilan;
    }

    /**
     * @param pokokCicilan the pokokCicilan to set
     */
    public void setPokokCicilan(double pokokCicilan) {
        this.pokokCicilan = pokokCicilan;
    }

    /**
     * @return the bungaCicilan
     */
    public double getBungaCicilan() {
        return bungaCicilan;
    }

    /**
     * @param bungaCicilan the bungaCicilan to set
     */
    public void setBungaCicilan(double bungaCicilan) {
        this.bungaCicilan = bungaCicilan;
    }

    /**
     * @return the totalKredit
     */
    public double getTotalKredit() {
        return totalKredit;
    }

    /**
     * @param totalKredit the totalKredit to set
     */
    public void setTotalKredit(double totalKredit) {
        this.totalKredit = totalKredit;
    }

    /**
     * @return the cicilanPerbulan
     */
    public double getCicilanPerbulan() {
        return cicilanPerbulan;
    }

    /**
     * @param cicilanPerbulan the cicilanPerbulan to set
     */
    public void setCicilanPerbulan(double cicilanPerbulan) {
        this.cicilanPerbulan = cicilanPerbulan;
    }

}
