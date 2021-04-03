
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BST2 {

    boolean control = true;
    /*char virgul = ',';
    int virgulsay;
    
    BİRDEN FAZLA DİL İÇİN ALGORİTMA----- Virgül sayısı n-1 olarak belirlenecek. 
     */
    Node2 head, tail = null;

    Node2 root; //BST için

    static Node2 prev;

    public void BST2Doubly(Node2 root) {
        if (root == null) {
            return;
        }
        BST2Doubly(root.sol);

        if (prev == null) {
            head = root;
        } else {
            root.sol = prev;
            prev.sag = root;

        }
        prev = root;

        BST2Doubly(root.sag);

    }

    public void NodeAdd(String ad, String adres, String telefonNo, String email, String dogumTarihi, String yabanciDil, int yabanciDilSay, String ehliyet, String isYeriAd, String isYeriAdres, String isYeriTelefon, String pozisyon, int calismaSuresi, String okulAd, String bolum, String baslangicTarih, String bitisTarih, double notOrt) {
        Node2 newNode = new Node2(ad, adres, telefonNo, email, dogumTarihi, yabanciDil, yabanciDilSay, ehliyet, isYeriAd, isYeriAdres, isYeriTelefon, pozisyon, calismaSuresi, okulAd, bolum, baslangicTarih, bitisTarih, notOrt); //eklenecek düğüm
        if (head == null) {
            //Liste boş demektir head ve tail listenin başı olup yeni bir düğüm içerir
            head = tail = newNode;
            head.sol = null; //Headden önceki null olur
            tail.sag = null; // Taildan sonraki null olur
        } else {
            //Liste doluysa sonuna bir düğüm eklenir.
            tail.sag = newNode; // sonuna eklemek için
            newNode.sol = null;
            tail = newNode;
            tail.sag = null;

        }
    }

    public void ListeyiYazdır() {

        Node2 aktif = head; // current düğüm
        if (head == null) {
            System.out.println("Liste boş");
        } else {
            while (aktif != null) {

                System.out.print(aktif.ad + " ");
                System.out.print(aktif.adres + " ");
                System.out.print(aktif.baslangicTarih + " ");
                System.out.print(aktif.bitisTarih + " ");
                System.out.print(aktif.bolum + " ");
                System.out.print(aktif.calismaSuresi + " ");
                System.out.print(aktif.dogumTarihi + " ");
                System.out.print(aktif.ehliyet + " ");
                System.out.print(aktif.email + " ");
                System.out.print(aktif.isYeriAd + " ");
                System.out.print(aktif.isYeriAdres + " ");
                System.out.print(aktif.isYeriTelefon + " ");
                System.out.print(aktif.notOrt + " ");
                System.out.print(aktif.okulAd + " ");
                System.out.print(aktif.pozisyon + " ");
                System.out.print(aktif.telefonNo + " ");
                System.out.print(aktif.yabanciDil + " ");
                System.out.print(aktif.yabanciDilSay + " \n");

                aktif = aktif.sag;

            }

        }
    }

    public void kisileriGoster() {
        try {

            String okunanBilgi;
            BufferedReader br = new BufferedReader(new FileReader("deneme.txt"));

            try {

                while ((okunanBilgi = br.readLine()) != null) {
                    System.out.println(okunanBilgi + " ");
                    /* if (okunanBilgi.equals(deneme)) {
                        System.out.println("Aradığınız satır şurasıdır : " +okunanBilgi);
                    }*/

                }
            } catch (IOException ex) {
                Logger.getLogger(BST2.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BST2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void bilgiSil() {

        File inputFile = new File("deneme.txt");
File tempFile = new File("myTempFile.txt");

Scanner fileScanner = new Scanner("deneme.txt");
Scanner input = new Scanner(System.in);
 String lineToRemove="";
BufferedReader reader;
BufferedWriter writer;
        try {
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(tempFile));
            
            System.out.println("Girdi");
            String kullanici = input.nextLine();
                while (fileScanner.hasNext()) {
                String next = fileScanner.next();

                 if (next.equals(kullanici)) {
                    lineToRemove = fileScanner.nextLine();
                }
            
            
            
           
            String currentLine;

while((currentLine = reader.readLine()) != null) {
    // trim newline when comparing with lineToRemove
    
    if(currentLine.equals(lineToRemove)) continue;
    writer.write(currentLine + System.getProperty("line.separator"));
}
writer.close(); 
reader.close();
            
            
            
            
      


 
boolean successful = tempFile.renameTo(inputFile);

    }
                  } catch (FileNotFoundException ex) {
            Logger.getLogger(BST2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BST2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
        

    public void bilgileriGuncelle(String oncekiString, String newString) {
        BufferedReader br = null;
        File degisiklikDosyasi = new File("deneme.txt");
        FileWriter writer = null;
        try {
            br = new BufferedReader(new FileReader("deneme.txt"));
            String oncekiBilgi = "";
            String okunacakSatir;
            try {
                okunacakSatir = br.readLine();
                while (okunacakSatir != null) {
                    oncekiBilgi = oncekiBilgi + okunacakSatir + System.lineSeparator() + "\n";
                    okunacakSatir = br.readLine();
                }

                String yeniBilgi = oncekiBilgi.replace(oncekiString, newString);
                writer = new FileWriter(degisiklikDosyasi);
                writer.write(yeniBilgi);

                br.close();
                writer.close();

            } catch (IOException ex) {
                Logger.getLogger(BST2.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BST2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        BST2 list = new BST2();
        FileWriter writer = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kişi Listesini Görmek İçin 5'e basın");
        System.out.println("Bilgi girmek ister misiniz?");

        System.out.println("Bilgi güncellemek için 6ya basın");
        int bilgi = scanner.nextInt();
        scanner.nextLine();

        if (bilgi == 6) {
            System.out.println("Güncellemek istediğiniz bilgiyi girin : ");
            String oldString = scanner.nextLine();
            System.out.println("Yerine girilecek olan  bilgiyi girin : ");
            String newString = scanner.nextLine();

            list.bilgileriGuncelle(oldString, newString);

        }
        if (bilgi == 5) {
            list.bilgiSil();
            System.exit(0);

        }

        while (bilgi != 0) {
            //----------------- KİŞİ BİLGİLERİ INPUT-------------- 
            System.out.print("Adınızı giriniz :");
            String ad = scanner.nextLine();

            System.out.print("Adresinizi giriniz :");
            String adres = scanner.nextLine();

            System.out.print("Telefon numaranızı giriniz :");
            String telNo = scanner.nextLine();

            System.out.print("E-mailinizi giriniz :");
            String mail = scanner.nextLine();

            System.out.print("Doğum tarihinizi giriniz :");
            String dogTar = scanner.nextLine();

            System.out.print("Bildiğiniz yabancı dilleri  giriniz :");
            String dil = scanner.nextLine();

            System.out.print("Ehliyetiniz var mı? (VAR/YOK)");
            String ehliyet = scanner.nextLine();

            //----------------- KİŞİ BİLGİLERİ INPUT BİTİŞ-------------- 
            //-----------------ÖNCEKİ İŞ YERİ BİLGİLERİ INPUT ------------------
            System.out.print("İş yeri adınız giriniz :");
            String isAd = scanner.nextLine();

            System.out.print("İş yeri adresiniz giriniz :");
            String adresIs = scanner.nextLine();

            System.out.print("Pozisyon/göreviniz giriniz :");
            String gorev = scanner.nextLine();

            System.out.print("Çalışma süreniz giriniz :");
            int sure = scanner.nextInt();
            scanner.nextLine();
//-----------------ÖNCEKİ İŞ YERİ BİLGİLERİ BİTİŞ------------------

//---------------------- EĞİTİM BİLGİLERİ INPUT-----------------------
            System.out.print("Okul adınızı giriniz :");
            String adOkul = scanner.nextLine();

            System.out.print("Bölümünüzü giriniz :");
            String bolum = scanner.nextLine();

            System.out.print("Okula giriş tarihiniz giriniz :");
            String basTar = scanner.nextLine();

            System.out.print("Mezuniyet tarihiniz giriniz :");
            String bitTar = scanner.nextLine();

            System.out.print("Not ortalamanız giriniz :");
            double notOrt = scanner.nextDouble();

            System.out.print("Bilgi girmek ister misiniz?");
            bilgi = scanner.nextInt();
            scanner.nextLine();

//----------------------------------------------------------------
            list.root = new Node2(ad, adres, telNo, mail, dogTar, dil, bilgi, ehliyet, isAd, adresIs, telNo, gorev, sure, adOkul, bolum, basTar, bitTar, notOrt);
            boolean control = true;
            while (control) {
                try {
                    writer = new FileWriter("deneme.txt", true);
                    writer.write(ad + " " + adres + " " + telNo + " " + mail + " " + dogTar + " " + dil + " " + bilgi + " " + ehliyet + " " + isAd + " " + adresIs + " " + telNo + " " + gorev + " " + sure + " " + adOkul + " " + bolum + " " + basTar + " " + bitTar + " " + notOrt + " \n");
                    if (writer != null) {
                        writer.close();
                        control = false;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(BST2.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            // list.NodeAdd(ad, adres, telNo, mail, dogTar, dil, bilgi, ehliyet, isAd, adres, telNo, isAd, sure, adOkul, bolum, basTar, bitTar, notOrt);
            list.BST2Doubly(list.root);
            System.out.print("Kayıt Edildi : ");
            list.ListeyiYazdır();

        }
    }
}
