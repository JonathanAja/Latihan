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
public abstract class Dosen extends Staff {

    private String Departemen;
    private ArrayList<MatkulAjar> matkulAjar = new ArrayList<>();

    public Dosen(String Departemen, String NIK, String nama, String alamat, String ttl, String noTelp) {
        super(NIK, nama, alamat, ttl, noTelp);
        this.Departemen = Departemen;
    }

    public String getDepartemen() {
        return Departemen;
    }

    public void setDepartemen(String Departemen) {
        this.Departemen = Departemen;
    }

    public ArrayList<MatkulAjar> getMatkulAjar() {
        return matkulAjar;
    }

    public void setMatkulAjar(ArrayList<MatkulAjar> matkulAjar) {
        this.matkulAjar = matkulAjar;
    }



    @Override
    public String toString() {
        return super.toString()+"Dosen{" + "Departemen=" + Departemen + ", matkulAjar=" + matkulAjar + '}';
    }

    
    


}
