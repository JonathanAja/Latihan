/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shyen
 */
public class Presensi implements StatusInterface {
    private int status;
    private String tanggal;

    public Presensi(int status, String tanggal) {
        this.status = status;
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    String isPresent(){
        switch (status){
            case ALPHA :
                return "alpha";
            default :
                return "hadir";
        }
    }

    @Override
    public String toString() {
        return "\nPresensi{" + "status=" + isPresent() + ", tanggal=" + tanggal + '}';
    }
    
    
    
    
    
    
}
