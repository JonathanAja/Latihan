/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.*;

/**
 *
 * @author shyen
 */
public class Controller {

    UserData userData = new UserData();

    public String findUserData(String nama) {
        userData.define();
        for (int i = 0; i < userData.getSarjanaList().size(); i++) {
            if (userData.getSarjanaList().get(i).getNama().equals(nama)) {
                return "Mahasiswa" + userData.getSarjanaList().get(i).toString();
            }
        }
        for (int i = 0; i < userData.getMagisterList().size(); i++) {
            if (userData.getMagisterList().get(i).getNama().equals(nama)) {
                return "Mahasiswa" + userData.getSarjanaList().get(i).toString();
            }
        }
        for (int i = 0; i < userData.getDoktorList().size(); i++) {
            if (userData.getDoktorList().get(i).getNama().equals(nama)) {
                return "Mahasiswa" + userData.getSarjanaList().get(i).toString();
            }
        }
        for (int i = 0; i < userData.getDosenTetapList().size(); i++) {
            if (userData.getDosenTetapList().get(i).getNama().equals(nama)) {
                return "Dosen Tetap" + userData.getSarjanaList().get(i).toString();
            }
        }
        for (int i = 0; i < userData.getHonorerList().size(); i++) {
            if (userData.getHonorerList().get(i).getNama().equals(nama)) {
                return "Honorer" + userData.getSarjanaList().get(i).toString();
            }
        }
        for (int i = 0; i < userData.getKaryawanList().size(); i++) {
            if (userData.getKaryawanList().get(i).getNama().equals(nama)) {
                return "Honorer" + userData.getSarjanaList().get(i).toString();
            }
        }
        return "tidak ada";
    }

    public double hitungNA(String nim, String kodeMK) {
        userData.define();
        double rata = 0;
        for (int i = 0; i < userData.getSarjanaList().size(); i++) {
            MahasiswaSarjana mhs = userData.getSarjanaList().get(i);
            if (mhs.getNIM().equals(nim)) {
                for (int j = 0; j < mhs.getMatkulAmbil().size(); j++) {
                    MatkulAmbil matkul = mhs.getMatkulAmbil().get(j);
                    if (matkul.getKode().equals(kodeMK)) {
                        rata = (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3;

                    }
                }
            }
        }
        for (int i = 0; i < userData.getMagisterList().size(); i++) {
            MahasiswaMagister mhs = userData.getMagisterList().get(i);
            if (mhs.getNIM().equals(nim)) {
                for (int j = 0; j < mhs.getMatkulAmbil().size(); j++) {
                    MatkulAmbil matkul = mhs.getMatkulAmbil().get(j);
                    if (matkul.getKode().equals(kodeMK)) {
                        rata = (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3;

                    }
                }
            }
        }
        for (int i = 0; i < userData.getDoktorList().size(); i++) {
            MahasiswaDoktor mhs = userData.getDoktorList().get(i);
            if (mhs.getNIM().equals(nim)) {
                rata = mhs.getNilai1() + mhs.getNilai2() + mhs.getNilai3() / 3;
            }
        }
        return rata;
    }

    public double hitungNR(String kodeMK) {
        userData.define();
        double rataNA = 0;
        double rataNR = 0;
        int count = 0;
        for (int i = 0; i < userData.getSarjanaList().size(); i++) {
            MahasiswaSarjana mhs = userData.getSarjanaList().get(i);

            for (int j = 0; j < mhs.getMatkulAmbil().size(); j++) {
                MatkulAmbil matkul = mhs.getMatkulAmbil().get(j);
                if (matkul.getKode().equals(kodeMK)) {
                    rataNA = (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3;

                    rataNR += rataNA;
                    count++;
                }

            }

        }
        for (int i = 0; i < userData.getMagisterList().size(); i++) {
            MahasiswaMagister mhs = userData.getMagisterList().get(i);

            for (int j = 0; j < mhs.getMatkulAmbil().size(); j++) {
                MatkulAmbil matkul = mhs.getMatkulAmbil().get(j);
                if (matkul.getKode().equals(kodeMK)) {
                    rataNA = (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3;
                    rataNR += rataNA;
                    count++;
                }
            }

        }
        rataNR /= count;
        return rataNR;
    }

    public String tidakLulusMK(String kodeMK) {
        userData.define();
        int rataNA = 0;
        int count = 0;
        int countMhs = 0;
        for (int i = 0; i < userData.getSarjanaList().size(); i++) {
            MahasiswaSarjana mhs = userData.getSarjanaList().get(i);

            for (int j = 0; j < mhs.getMatkulAmbil().size(); j++) {
                MatkulAmbil matkul = mhs.getMatkulAmbil().get(j);
                if (matkul.getKode().equals(kodeMK)) {
                    rataNA = (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3;
                    if (rataNA < 56) {
                        count++;
                    }
                    countMhs++;
                }

            }

        }
        for (int i = 0; i < userData.getMagisterList().size(); i++) {
            MahasiswaMagister mhs = userData.getMagisterList().get(i);

            for (int j = 0; j < mhs.getMatkulAmbil().size(); j++) {
                MatkulAmbil matkul = mhs.getMatkulAmbil().get(j);
                if (matkul.getKode().equals(kodeMK)) {
                    rataNA = (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3;
                    if (rataNA < 56) {
                        count++;
                    }
                    countMhs++;
                }
            }

        }
        return count + " dari " + countMhs + " tidak lulus mata kuliah " + kodeMK;
    }

    public String printMatkulAmbil(String nim) {
        userData.define();
        int presen = 0;
        String list = "";
        for (int i = 0; i < userData.getSarjanaList().size(); i++) {
            MahasiswaSarjana mhs = userData.getSarjanaList().get(i);
            if (mhs.getNIM().equals(nim)) {

                for (int j = 0; j < mhs.getMatkulAmbil().size(); j++) {
                    presen = 0;
                    MatkulAmbil matkul = mhs.getMatkulAmbil().get(j);
                    for (int k = 0; k < matkul.getPresen().size(); k++) {
                        if(matkul.getPresen().get(k).getStatus()==1){
                            presen++;
                        }
                    }
                    list += matkul.getNama() + " dengan total presensi " +presen+" ,";
                }
                
                return list;
            }

        }
        for (int i = 0; i < userData.getMagisterList().size(); i++) {
            MahasiswaMagister mhs = userData.getMagisterList().get(i);

            for (int j = 0; j < mhs.getMatkulAmbil().size(); j++) {
                MatkulAmbil matkul = mhs.getMatkulAmbil().get(j);
                return "\n" + matkul.getNama();
            }

        }

        return "tidak ada";
    }

}
