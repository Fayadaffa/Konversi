/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Fayyadh;

/**
 *
 * @author Asus
 */

public class ServiceProcess {
    
    public String tampilNama(){
        return "Fayyadh";
    }
    public String tampilNIM(){
        return "20200140049";
    }
    public String tampilAngkatan(){
        return "2020";
    }
    public String cekNama(){
        String nama = tampilNama();
        String validasi = "";
        
        if (nama.equals("Fayyadh")){
            validasi = "Ini laptop saya.";
        }else{
            validasi = "Kamu siapa?";
        }
        return validasi;
    }
    public String cekAngka(int number){
        String jenis = "";
        
        if (number%2==0){
            jenis = " Genap";
        }else{
            jenis = " Ganjil";
        }
        return jenis;
    }
    public String viewUserSedikit(){        
        String nama = tampilNama(); 
        String nim = tampilNIM();
        String angkatan = tampilAngkatan();
        String validasi = cekNama();
        String jenisangka = cekAngka(15);
        
        String tampilkan
                = "Nama: " + nama + "<br>"
                + "NIM: " + nim + "<br>"
                + "Angkatan: " + angkatan + "<br>"
                + "Hasil validasi: " + validasi + "<br>"
                + "Jenis angka 15: " + jenisangka;
        
        return tampilkan;
    }
}