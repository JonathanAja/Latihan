/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shyen
 */
public abstract class Mahasiswa extends User {
    private String NIM;
    private String Jurusan;

    public Mahasiswa(String NIM, String Jurusan, String nama, String alamat, String ttl, String noTelp) {
        super(nama, alamat, ttl, noTelp);
        this.NIM = NIM;
        this.Jurusan = Jurusan;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMahasiswa{" + "NIM=" + NIM + ", Jurusan=" + Jurusan + '}';
    }
    
    
}
