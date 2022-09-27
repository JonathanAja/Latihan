/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shyen
 */
public class DosenTetap extends Dosen {
    private int gaji;

    public DosenTetap(int gaji, String Departemen, String NIK, String nama, String alamat, String ttl, String noTelp) {
        super(Departemen, NIK, nama, alamat, ttl, noTelp);
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDosenTetap{" + "gaji=" + gaji + '}';
    }

    


    
}
