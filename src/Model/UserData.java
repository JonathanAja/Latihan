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
public class UserData {
    ArrayList<MahasiswaSarjana> listSarjana = new ArrayList<>();
    ArrayList<MahasiswaMagister> listMagister = new ArrayList<>();
    ArrayList<MahasiswaDoktor> listDoktor = new ArrayList<>();
    ArrayList<Karyawan> listKaryawan = new ArrayList<>();
    ArrayList<DosenTetap> listDosenTetap = new ArrayList<>();
    ArrayList<DosenHonorer> listDosenHonorer = new ArrayList<>();
    public void define(){
        ArrayList<Presensi> presensi = new ArrayList<>();
        ArrayList<Presensi> presensi1 = new ArrayList<>();
        ArrayList<MatkulAmbil> mataKul = new ArrayList<>();
        ArrayList<MatkulAmbil> mataKul1 = new ArrayList<>();
        ArrayList<MatkulAjar> mataKulDosen = new ArrayList<>();
        ArrayList<PresensiStaff> present = new ArrayList<>();
        
        //-----------mahasiswa-----------------//

        Presensi presenn1 = new Presensi(1, "17 Januari 2004");
        Presensi presenn2 = new Presensi(0, "18 Januari 2004");
        presensi.add(presenn1);
        presensi.add(presenn2);

        MatkulAmbil matkul1 = new MatkulAmbil(90, 95, 85, "IF-103", "PBO", 3);
        mataKul.add(matkul1);
        matkul1.setPresen(presensi);
        MahasiswaSarjana Jona = new MahasiswaSarjana("1121050", "Informatika", "Jonathan", "Cihanjuang", "Bandung, 09 November 2002", "0898484848");
        Jona.setMatkulAmbil(mataKul);
        listSarjana.add(Jona);
        
        Presensi presennn1 = new Presensi(1, "17 Mei 2003");
        Presensi presennn2 = new Presensi(0, "18 April 2003");
        presensi1.add(presennn1);
        presensi1.add(presennn2);

        MatkulAmbil matkul11 = new MatkulAmbil(20, 45, 35, "IF-103", "PBO", 3);
        mataKul1.add(matkul11);
        matkul1.setPresen(presensi1);
        MahasiswaSarjana Ana = new MahasiswaSarjana("1121051", "Informatika", "Ana", "Cihanjuang", "Bandung, 09 November 2022", "0891284848");
        Ana.setMatkulAmbil(mataKul1);
        listSarjana.add(Ana);


        //-------------------dosen----------------//
        
        MatkulAjar matkulAjar = new MatkulAjar ("IF-104","Kalku",4);
        
        PresensiStaff presen1=new PresensiStaff("07.10",1,"07 November 2021");
        PresensiStaff presen2=new PresensiStaff("08.10",1,"08 November 2021");
        present.add(presen1);
        present.add(presen2);
        mataKulDosen.add(matkulAjar);
        matkulAjar.setPresensi (present);
        DosenTetap Hary = new DosenTetap(10000000, "IF", "1324567", "Hary Tanu", "Cikutra", "Jakarta, 11 Oktober 2000", "123321123");
        Hary.setMatkulAjar(mataKulDosen);
        listDosenTetap.add(Hary);
        

    }
    public ArrayList<MahasiswaSarjana> getSarjanaList() {
        return listSarjana;
    }
    

    public ArrayList<MahasiswaMagister> getMagisterList() {
        return listMagister;
    }

    public ArrayList<MahasiswaDoktor> getDoktorList() {
        return listDoktor;
    }

    public ArrayList<Karyawan> getKaryawanList() {
        return listKaryawan;
    }

    public ArrayList<DosenTetap> getDosenTetapList() {
        return listDosenTetap;
    }

    public ArrayList<DosenHonorer> getHonorerList() {
        return listDosenHonorer;
    }
}
