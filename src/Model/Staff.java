/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shyen
 */
public abstract class Staff extends User {
    private String NIK;

    public Staff(String NIK, String nama, String alamat, String ttl, String noTelp) {
        super(nama, alamat, ttl, noTelp);
        this.NIK = NIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return super.toString()+"\nStaff{" + "NIK=" + NIK + '}';
    }
    
    

}
