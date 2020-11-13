/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan43.gajipegawai;

/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO2
 * NIM       : 10116147
 * Deskripsi : Program untuk menghitung total gaji karyawan.
 */

public class PBO210116147Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    GajiPegawai gajiPegawai = new GajiPegawai();
        
        gajiPegawai.setUangTunjangan(250000);
        int uangTunjangan = gajiPegawai.getUangTunjangan();
        
        gajiPegawai.setUangTransport(300000);
        int uangTransport = gajiPegawai.getUangTransport();
        
        gajiPegawai.setGajiPokok(4500000);
        int gajiPokok = gajiPegawai.getGajiPokok();
        
        int jml = gajiPegawai.totalGaji(uangTunjangan, uangTransport, gajiPokok);
        gajiPegawai.setTotalGaji(jml);
        int totalGaji = gajiPegawai.getTotalGaji();
        
        gajiPegawai.tampilData("Rizki Adam Kurniawan", "Jalan Semar dlm 4 No 77/66", uangTunjangan, uangTransport, gajiPokok, totalGaji);
    }
    
}
