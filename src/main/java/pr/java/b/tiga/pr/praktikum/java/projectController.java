/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr.java.b.tiga.pr.praktikum.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.Fayyadh.ServiceProcess;

/**
 *
 * @author Asus
 */

@Controller
@ResponseBody
public class projectController {
    
    logicalProcess hitung = new logicalProcess(); 
    
    @RequestMapping("/konversieurtoidr") 
    public String tampileurtoidr(){ 
        
        double idr = hitung.getEURIDR(5); 
        
        String view = "Hasil konversi 5 EUR ke IDR = " + idr + " Rupiah."; 
        
        return view; 
    }
        
    @RequestMapping("/konversigbptoidr") 
    public String tampilgbptoidr(){ 
        
        double idr = hitung.getGBPIDR(5); 
        
        String view = "Hasil konversi 5 GBP ke IDR = " + idr + " Rupiah."; 
        
        return view; 
    }
    
    @RequestMapping("/konversiusdtoidr") 
    public String tampilusdtoidr(){ 
        
        double idr = hitung.getUSDIDR(5); 
        
        String view = "Hasil konversi 5 USD ke MYR = " + idr + " Rupiah"; 
        
        return view; 
    }
    
    @RequestMapping("/konversicnytoidr")
    public String tampilcnytoidr(){ 
        
        double idr = hitung.getCNYIDR(5); 
        String view = "Hasil konversi 5 CNY ke IDR = " + idr + " Rupiah."; 
        
        return view; 
    }
    @RequestMapping("/konversisemuakurs") 
    public String konversisemuakurs(){ 
        String tampilkan;
        tampilkan = hitung.tampilsemuakonversi();
        
        return tampilkan;
    }
    
    ServiceProcess fayyadh = new ServiceProcess();
    
    @RequestMapping("/tampiluser")
    public String viewUser(){
        String nama, nim, angkatan, validasi, jenisangka, tampilkan;
        
        nama = fayyadh.tampilNama(); 
        nim = fayyadh.tampilNIM();
        angkatan = fayyadh.tampilAngkatan();
        validasi = fayyadh.cekNama();
        
        jenisangka = fayyadh.cekAngka(20);
        
        tampilkan = nama + " " + nim + " " + angkatan + ", " + validasi + jenisangka;
        
        return tampilkan;
    }
    
    @RequestMapping("/tampilusersimpel")
    public String viewUserSimpel(){
        String tampilkan;
        tampilkan = fayyadh.viewUserSedikit();
        
        return tampilkan;
    }
}