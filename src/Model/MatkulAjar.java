/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author shyen
 */
public class MatkulAjar extends MataKuliah {

    private ArrayList<PresensiStaff> presensi = new ArrayList<>();

    public MatkulAjar(String kode, String nama, int jumlahSKS) {
        super(kode, nama, jumlahSKS);
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMatkulAjar{" + "presensi=" + presensi + '}';
    }
    
}
