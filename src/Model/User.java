/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author shyen
 */
public abstract class User {
    private String nama;
    private String alamat;
    private String ttl;
    private String noTelp;
    
    public User(String nama, String alamat, String ttl, String noTelp){
        this.nama=nama;
        this.alamat=alamat;
        this.ttl=ttl;
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    @Override
    public String toString() {
        return "User{" + "nama=" + nama + ", alamat=" + alamat + ", ttl=" + ttl + ", noTelp=" + noTelp + '}';
    }
    
    
    
    
}
