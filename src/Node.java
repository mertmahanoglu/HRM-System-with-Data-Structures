import java.util.Date; 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class Node {
    
    
    //----------------- KİŞİ BİLGİLERİ --------------
    Node sol;
    Node sag;
    
    
    String ad;
    String adres;
    String telefonNo;
    String email;
    String dogumTarihi;
    String yabanciDil;
    int yabanciDilSay;
    String ehliyet;
    
    //-----------------ÖNCEKİ İŞ YERİ BİLGİLERİ------------------
    
    String isYeriAd;
    String isYeriAdres;
    String isYeriTelefon;
    String pozisyon;
    int calismaSuresi;
    
    
    
    //---------------------- EĞİTİM BİLGİLERİ-----------------------
    
    String okulAd;
    String bolum;
    String baslangicTarih;
    String bitisTarih;
    double notOrt;

    public Node(String ad, String adres, String telefonNo, String email, String dogumTarihi, String yabanciDil, int yabanciDilSay, String ehliyet, String isYeriAd, String isYeriAdres, String isYeriTelefon, String pozisyon, int calismaSuresi, String okulAd, String bolum, String baslangicTarih, String bitisTarih, double notOrt) {
       
        sol=sag=null;
        
        this.ad = ad;
        this.adres = adres;
        this.telefonNo = telefonNo;
        this.email = email;
        this.dogumTarihi = dogumTarihi;
        this.yabanciDil = yabanciDil;
        this.yabanciDilSay = yabanciDilSay;
        this.ehliyet = ehliyet;
        this.isYeriAd = isYeriAd;
        this.isYeriAdres = isYeriAdres;
        this.isYeriTelefon = isYeriTelefon;
        this.pozisyon = pozisyon;
        this.calismaSuresi = calismaSuresi;
        this.okulAd = okulAd;
        this.bolum = bolum;
        this.baslangicTarih = baslangicTarih;
        this.bitisTarih = bitisTarih;
        this.notOrt = notOrt;
        
        sol=sag=null;
    }

    public Node getSol() {
        return sol;
    }

    public void setSol(Node sol) {
        this.sol = sol;
    }

    public Node getSag() {
        return sag;
    }

    public void setSag(Node sag) {
        this.sag = sag;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getYabanciDil() {
        return yabanciDil;
    }

    public void setYabanciDil(String yabanciDil) {
        this.yabanciDil = yabanciDil;
    }

    public int getYabanciDilSay() {
        return yabanciDilSay;
    }

    public void setYabanciDilSay(int yabanciDilSay) {
        this.yabanciDilSay = yabanciDilSay;
    }

    public String getEhliyet() {
        return ehliyet;
    }

    public void setEhliyet(String ehliyet) {
        this.ehliyet = ehliyet;
    }

    public String getIsYeriAd() {
        return isYeriAd;
    }

    public void setIsYeriAd(String isYeriAd) {
        this.isYeriAd = isYeriAd;
    }

    public String getIsYeriAdres() {
        return isYeriAdres;
    }

    public void setIsYeriAdres(String isYeriAdres) {
        this.isYeriAdres = isYeriAdres;
    }

    public String getIsYeriTelefon() {
        return isYeriTelefon;
    }

    public void setIsYeriTelefon(String isYeriTelefon) {
        this.isYeriTelefon = isYeriTelefon;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    public int getCalismaSuresi() {
        return calismaSuresi;
    }

    public void setCalismaSuresi(int calismaSuresi) {
        this.calismaSuresi = calismaSuresi;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getBaslangicTarih() {
        return baslangicTarih;
    }

    public void setBaslangicTarih(String baslangicTarih) {
        this.baslangicTarih = baslangicTarih;
    }

    public String getBitisTarih() {
        return bitisTarih;
    }

    public void setBitisTarih(String bitisTarih) {
        this.bitisTarih = bitisTarih;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }
     
    
    
    
    
    
    
}
