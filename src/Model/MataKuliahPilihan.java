/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shyen
 */
public class MataKuliahPilihan extends MataKuliah {
    private int minMhs;

    public MataKuliahPilihan(int minMhs, String kode, String nama, int jumlahSKS) {
        super(kode, nama, jumlahSKS);
        this.minMhs = minMhs;
    }

    public int getMinMhs() {
        return minMhs;
    }

    public void setMinMhs(int minMhs) {
        this.minMhs = minMhs;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMataKuliahPilihan{" + "minMhs=" + minMhs + '}';
    }
    
}
