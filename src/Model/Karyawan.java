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
public class Karyawan extends Staff {

    private int gaji;
    private ArrayList<PresensiStaff> daftarHadir = new ArrayList<>();

    public Karyawan(int gaji, String NIK, String nama, String alamat, String ttl, String noTelp) {
        super(NIK, nama, alamat, ttl, noTelp);
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public ArrayList<PresensiStaff> getDaftarHadir() {
        return daftarHadir;
    }

    public void setDaftarHadir(ArrayList<PresensiStaff> daftarHadir) {
        this.daftarHadir = daftarHadir;
    }

    @Override
    public String toString() {
        return super.toString()+"\nKaryawan{" + "gaji=" + gaji + ", daftarHadir=" + daftarHadir + '}';
    }
    
}
