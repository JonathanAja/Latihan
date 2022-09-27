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
public class MahasiswaMagister extends Mahasiswa {

    private ArrayList<MatkulAmbil> matkulAmbil = new ArrayList<>();
    private String judulPenelitian;

    public MahasiswaMagister(String judul, String NIM, String Jurusan, String nama, String alamat, String ttl, String noTelp) {
        super(NIM, Jurusan, nama, alamat, ttl, noTelp);
        this.judulPenelitian = judul;
    }

    public ArrayList<MatkulAmbil> getMatkulAmbil() {
        return matkulAmbil;
    }

    public void setMatkulAmbil(ArrayList<MatkulAmbil> matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMahasiswaMagister{" + "matkulAmbil=" + matkulAmbil + ", judulPenelitian=" + judulPenelitian + '}';
    }
    
}
