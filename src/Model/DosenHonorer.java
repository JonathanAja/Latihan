/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shyen
 */
public class DosenHonorer extends Dosen {
    private int honorPerSKS;

    public DosenHonorer(int honorPerSKS, String Departemen, String NIK, String nama, String alamat, String ttl, String noTelp) {
        super(Departemen, NIK, nama, alamat, ttl, noTelp);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDosenHonorer{" + "honorPerSKS=" + honorPerSKS + '}';
    }

    


    
}
