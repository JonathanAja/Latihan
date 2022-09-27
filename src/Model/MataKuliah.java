/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shyen
 */
public class MataKuliah {
    private String kode,nama;
    private int jumlahSKS;
    
    public MataKuliah (String kode, String nama,int jumlahSKS){
        this.kode=kode;
        this.nama=nama;
        this.jumlahSKS= jumlahSKS;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahSKS() {
        return jumlahSKS;
    }

    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public String toString() {
        return "\nMataKuliah{" + "kode=" + kode + ", nama=" + nama + ", jumlahSKS=" + jumlahSKS + '}';
    }
    
}
