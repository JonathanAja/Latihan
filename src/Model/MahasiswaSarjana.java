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
public class MahasiswaSarjana extends Mahasiswa{
    private ArrayList<MatkulAmbil> matkulAmbil = new ArrayList<>();

    public MahasiswaSarjana(String NIM, String Jurusan, String nama, String alamat, String ttl, String noTelp) {
        super(NIM, Jurusan, nama, alamat, ttl, noTelp);
    }

    public ArrayList<MatkulAmbil> getMatkulAmbil() {
        return matkulAmbil;
    }

    public void setMatkulAmbil(ArrayList<MatkulAmbil> matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMahasiswaSarjana{" + "matkulAmbil=" + matkulAmbil + '}';
    }
    
    
}
