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
public class MatkulAmbil extends MataKuliah {

    private int n1, n2, n3;
    private ArrayList<Presensi> presen = new ArrayList<>();

    public MatkulAmbil(int n1, int n2, int n3, String kode, String nama, int jumlahSKS) {
        super(kode, nama, jumlahSKS);
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public ArrayList<Presensi> getPresen() {
        return presen;
    }

    public void setPresen(ArrayList<Presensi> presen) {
        this.presen = presen;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMatkulAmbil{" + "n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", presen=" + presen + '}';
    }
    
    

}
