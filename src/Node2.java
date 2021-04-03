
public class Node2 {
    
    Node2 sol;
    Node2 sag;
    
      //----------------- KİŞİ BİLGİLERİ --------------
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

    public Node2(String ad, String adres, String telefonNo, String email, String dogumTarihi, String yabanciDil, int yabanciDilSay, String ehliyet, String isYeriAd, String isYeriAdres, String isYeriTelefon, String pozisyon, int calismaSuresi, String okulAd, String bolum, String baslangicTarih, String bitisTarih, double notOrt) {
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
    }
    
    
    
    
}
