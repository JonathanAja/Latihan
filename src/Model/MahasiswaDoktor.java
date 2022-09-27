/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shyen
 */
public class MahasiswaDoktor extends Mahasiswa {
    private String judulPenelitian;
    private int nilai1,nilai2,nilai3;

    public MahasiswaDoktor(String judulPenelitian, int nilai1, int nilai2, int nilai3, String NIM, String Jurusan, String nama, String alamat, String ttl, String noTelp) {
        super(NIM, Jurusan, nama, alamat, ttl, noTelp);
        this.judulPenelitian = judulPenelitian;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
    }

    public int getNilai1() {
        return nilai1;
    }

    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }

    public int getNilai2() {
        return nilai2;
    }

    public void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }

    public int getNilai3() {
        return nilai3;
    }

    public void setNilai3(int nilai3) {
        this.nilai3 = nilai3;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMahasiswaDoktor{" + "judulPenelitian=" + judulPenelitian + ", nilai1=" + nilai1 + ", nilai2=" + nilai2 + ", nilai3=" + nilai3 + '}';
    }
    
    
}
