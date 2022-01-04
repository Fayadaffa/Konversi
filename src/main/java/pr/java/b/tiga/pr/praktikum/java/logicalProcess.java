/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr.java.b.tiga.pr.praktikum.java;

/**
 *
 * @author Asus
 */

public class logicalProcess { 
    
    public double getEURIDR(double eur){ 
        
        
        double idr = eur*16177; 
        
        return idr; 
    }
    
    public double getGBPIDR(double gbp){
        
        double idr = gbp*19370;
        
        return idr;
    }
    
    public double getUSDIDR(double usd){ 
        
        double idr = usd*14337;
        
        return idr;
    }
    
    public double getCNYIDR(double cny){
        
        double idr = cny*2255;
        
        return idr;
    }
    public String tampilsemuakonversi(){
        double euridr = getEURIDR(8);
        double gbpidr = getGBPIDR(8);
        double usdidr = getUSDIDR(8);
        double cnyidr = getCNYIDR(8);
        
        double tampilkaneuridr = euridr;
        String tampileuridr = Double.toString(tampilkaneuridr);
        double tampilkangbpidr = gbpidr;
        String tampilgbpidr = Double.toString(tampilkangbpidr);
        double tampilkanusdidr = usdidr;
        String tampilusdidr = Double.toString(tampilkanusdidr);
        double tampilkancnyidr = cnyidr;
        String tampilcnyidr = Double.toString(tampilkancnyidr);
        
        String tampil;
        tampil = "Hasil konversi dari Euro ke Rupiah = Rp" + tampileuridr + "<br>"
                + "Hasil konversi dari Pounds ke Rupiah = Rp" + tampilgbpidr + "<br>"
                + "Hasil konversi dari Dollar Amerika ke Rupiah = Rm" + tampilusdidr + "<br>"
                + "Hasil konversi dari Dollar Yuan ke Rupiah = Rp" + tampilcnyidr;
        return tampil;
    }
}