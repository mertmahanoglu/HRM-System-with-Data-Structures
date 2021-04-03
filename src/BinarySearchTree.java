
import java.util.Scanner;


public class BinarySearchTree {
    
    Scanner scanner = new Scanner(System.in);
    
     //----------------- KİŞİ BİLGİLERİ --------------
    public  Node root; //KÖK
    public  Node head; //BAŞ
    public static Node oncekiNode = null;
    
    int dugumSay = 1;
    int dugumIndex = 0;
    
    Node currentNode;
    
    String BSTad;
    String BSTadres;
    String BSTtelefonNo;
    String BSTemail;
    String BSTdogumTarihi;
    String BSTyabanciDil;
    int BSTyabanciDilSay;
    String BSTehliyet;
    
    //-----------------ÖNCEKİ İŞ YERİ BİLGİLERİ------------------
    
    String BSTisYeriAd;
    String BSTisYeriAdres;
    String BSTisYeriTelefon;
    String BSTpozisyon;
    int BSTcalismaSuresi;
    
    
    
    //---------------------- EĞİTİM BİLGİLERİ-----------------------
    
    String BSTokulAd;
    String BSTbolum;
    String BSTbaslangicTarih;
    String BSTbitisTarih;
    double BSTnotOrt;

   /* public BinarySearchTree(String ad, String adres, String telefonNo, String email, String dogumTarihi, String yabanciDil, int yabanciDilSay, String ehliyet, String isYeriAd, String isYeriAdres, String isYeriTelefon, String pozisyon, int calismaSuresi, String okulAd, String bolum, String baslangicTarih, String bitisTarih, double notOrt) {
       
       
        currentNode = new Node(null, null, ad, adres, telefonNo, email, dogumTarihi, yabanciDil, yabanciDilSay, ehliyet, isYeriAd, isYeriAdres, isYeriTelefon, pozisyon, calismaSuresi, okulAd, bolum, baslangicTarih, bitisTarih, notOrt);
        currentNode.sag = null;
        currentNode.sol = null;
        
    }
    */
    
    
     void BstToLinked(Node root) 
    { 
        // Base cases 
        if (root == null) 
            return; 
  
        // Recursively convert right subtree 
        BstToLinked(root.sol); 
  
        // insert root into DLL 
        
        if (oncekiNode==null) {
            head=root;
        }
        else
        {
        root.sol = oncekiNode;
        oncekiNode.sag = root;
        }
        oncekiNode = root;
        
        BstToLinked(root.sag);
    } 
    

    //ADDED BY BORAN 
    
  /*  void DugumuSil 
    (int konum ) { 

// sistemdeki bilgilerini kaldırma 

// liste null mu ? 
if (head == null)
{
  return;
}

// store head node 
Node gecicidugum = head;

// kaldırılacak header
if (konum == 0) {

head = gecicidugum.sag;  //Change head
return; }

// Silinen dugumun yerine gececek oncekı dugumu bul

for ( int i = 0 ; temp! = null && i< konum -1, i++)
gecicidugum = gecicidugum.sag;

// konum dugum sayisindan fazla ise
if (gecicidugum == null) || gecicidugum.next == null) 
return;

// Gecici dugum -> sonraki silinecek dugum
// silinecek sonraki dugumde sakla 
Node sag = gecicidugum.sag.sag;
gecicidugum.sag = sag; // Bagi listeden kes 
    }
    
    //END POINT
*/
      void listeyiYazdir(Node node) 
    { 
        //reachNode(0);
        System.out.println("Extracted Double Linked List is : "); 
        while (node !=null) { 
           System.out.print(head.ad + " ");
             System.out.print(head.adres + " "); 
              System.out.print(head.baslangicTarih + " "); 
               System.out.print(head.bitisTarih + " "); 
                System.out.print(head.bolum + " "); 
                 System.out.print(head.calismaSuresi + " "); 
                  System.out.print(head.dogumTarihi+ " "); 
                   System.out.print(head.ehliyet + " "); 
                    System.out.print(head.email + " "); 
                     System.out.print(head.isYeriAd + " "); 
                      System.out.print(head.isYeriAdres + " "); 
                       System.out.print(head.isYeriTelefon + " "); 
                        System.out.print(head.notOrt + " "); 
                         System.out.print(head.okulAd + " "); 
                          System.out.print(head.pozisyon + " "); 
                           System.out.print(head.telefonNo + " "); 
                           System.out.print(head.yabanciDil + " ");
                           System.out.print(head.yabanciDilSay + " \n");
                          node = node.sag;
                          
                
          //  nextNode();
        } 
    } 

    public int getDugumSay() {
        return dugumSay;
    }

    public void setDugumSay(int dugumSay) {
        this.dugumSay = dugumSay;
    }
      
      
      //WRITTEN BY MERT MAHANOĞLU
      public void nextNode()
      {
          if (currentNode.sag==null) {
              System.out.println("Dugum bulunamadi");
          }
          else
          {
          currentNode = currentNode.sag;
          dugumIndex++;
          }
      }
      
      public void previousNode()
      {
      
          if (currentNode.sol==null) {
              System.out.println("Dugum bulunamadi");
          }
          else
          {
          currentNode = currentNode.sol;
          dugumIndex--;
          }
      
      }
      
      
    /*  public void dugumEkle(String ad, String adres, String telefonNo, String email, String dogumTarihi, String yabanciDil, int yabanciDilSay, String ehliyet, String isYeriAd, String isYeriAdres, String isYeriTelefon, String pozisyon, int calismaSuresi, String okulAd, String bolum, String baslangicTarih, String bitisTarih, double notOrt)
      {
          if (currentNode.sag==null) {
              currentNode=currentNode.sag=new Node(currentNode,null,ad, adres, telefonNo, email, dogumTarihi, yabanciDil, yabanciDilSay, ehliyet, isYeriAd, isYeriAdres, isYeriTelefon, pozisyon, calismaSuresi, okulAd, bolum, baslangicTarih, bitisTarih, notOrt);
              
          }
          else
          {
          currentNode = currentNode.sag= new Node(currentNode, currentNode.sag, ad, adres, telefonNo, email, dogumTarihi, yabanciDil, yabanciDilSay, ehliyet, isYeriAd, isYeriAdres, isYeriTelefon, pozisyon, calismaSuresi, okulAd, bolum, baslangicTarih, bitisTarih, notOrt);
          }      
          dugumSay++;
          dugumIndex++;
          
      }*/
      
      public void reachNode(int index)
      {
          while (dugumIndex!=index) {   
              
              if (dugumIndex<index) {
                  
                  nextNode();
                  
              }
              else if (dugumIndex>index) {
                  
                  previousNode();
                  
              }
              
              
          }
      
      }
      
      
      public void bilgiInput(BinarySearchTree tree)
      {
       
         
          System.out.println("Bilgi girmek ister misiniz?");
          int bilgi = scanner.nextInt();
          
          while (bilgi!=0) {              
                 //----------------- KİŞİ BİLGİLERİ INPUT-------------- 
    System.out.println("Adınızı giriniz :");
    String ad = scanner.next();
    
     System.out.println("Adresinizi giriniz :");
    String adres =scanner.next();
    
     System.out.println("Telefon numaranızı giriniz :");
    String telNo = scanner.next();
    
     System.out.println("E-mailinizi giriniz :");
    String mail = scanner.next();
    
     System.out.println("Doğum tarihinizi giriniz :");
   String dogTar =  scanner.next();
    
     System.out.println("Bildiğiniz yabancı dilleri  giriniz :");
    String dil = scanner.next();
    
     System.out.println("Ehliyetiniz var mı? (VAR/YOK)");
    String ehliyet = scanner.next();
    
 //----------------- KİŞİ BİLGİLERİ INPUT BİTİŞ-------------- 
     
 //-----------------ÖNCEKİ İŞ YERİ BİLGİLERİ INPUT ------------------
    
     System.out.println("İş yeri adınız giriniz :");
    String isAd = scanner.next();
    
     System.out.println("İş yeri adresiniz giriniz :");
    String adresIs = scanner.next();
    
     System.out.println("Pozisyon/göreviniz giriniz :");
    String gorev = scanner.next();
    
     System.out.println("Çalışma süreniz giriniz :");
    int sure = scanner.nextInt();
    
//-----------------ÖNCEKİ İŞ YERİ BİLGİLERİ BİTİŞ------------------
    
        
//---------------------- EĞİTİM BİLGİLERİ INPUT-----------------------
    
        
        System.out.println("Okul adınızı giriniz :");
   String adOkul =scanner.next();
    
     System.out.println("Bölümünüzü giriniz :");
    String bolum =scanner.next();
    
     System.out.println("Okula giriş tarihiniz giriniz :");
   String basTar =   scanner.next();
    
     System.out.println("Mezuniyet tarihiniz giriniz :");
    String bitTar =  scanner.next();
    
    System.out.println("Not ortalamanız giriniz :");
     double notOrt = scanner.nextDouble();
     
              if (head==null) {
                  Node ilk = new Node(ad, adres, BSTtelefonNo, mail, BSTdogumTarihi, BSTyabanciDil, BSTyabanciDilSay, ehliyet, BSTisYeriAd, BSTisYeriAdres, BSTisYeriTelefon, BSTpozisyon, BSTcalismaSuresi, BSTokulAd, bolum, BSTbaslangicTarih, BSTbitisTarih, notOrt);
                  head = ilk;
              }
              else
              {
                   Node aktif = head;
                   Node eklenecek = new Node(ad, adres, BSTtelefonNo, mail, BSTdogumTarihi, BSTyabanciDil, BSTyabanciDilSay, ehliyet, BSTisYeriAd, BSTisYeriAdres, BSTisYeriTelefon, BSTpozisyon, BSTcalismaSuresi, BSTokulAd, bolum, BSTbaslangicTarih, BSTbitisTarih, notOrt);
      
                       while (aktif.sag!=null) {                  
                              aktif = aktif.sag;
                                          }
                              aktif.sag = eklenecek;
              }
     
 
       
        
        
     //tree.root = new Node(ad, adres, telNo, mail, dogTar, dil, sure, ehliyet, isAd, adres, telNo, isAd, sure, adOkul, bolum, basTar, bitTar, notOrt);
     
    
     
     System.out.println("Liste1 : ");
     tree.BstToLinked(tree.root);
     tree.listeyiYazdir(head);
     
      System.out.println("Bilgi girmek ister misiniz?");
        bilgi = scanner.nextInt();
    
          }
          
   
     
  
     
      }
      
      //--WRITTEN BY MERT MAHANOĞLU
      
      
    public static void main(String[] args) {
        
      BinarySearchTree tree = new BinarySearchTree();
      tree.bilgiInput(tree);
      
    
     
     
        }
           
     
     
     
     
     
     
     
    /* bstTree.root = new Node( ad, adres, telNo, mail, dogTar, dil, sure, ehliyet, isAd, adres, telNo, isAd, sure, adOkul, bolum, basTar, bitTar, notOrt);
     
        if (ad.compareTo(bstTree.BSTad)==0) {
              bstTree.root.sol = new Node( ad, adres, telNo, mail, dogTar, dil, sure, ehliyet, isAd, adres, telNo, isAd, sure, adOkul, bolum, basTar, bitTar, notOrt);
              System.out.println("Çalıştı");
        }
        else
        {
         bstTree.root.sag = new Node( ad, adres, telNo, mail, dogTar, dil, sure, ehliyet, isAd, adres, telNo, isAd, sure, adOkul, bolum, basTar, bitTar, notOrt);*/
        }   
             
    
 /*bstTree.BstToLinked(bstTree.root);
 bstTree.listeyiYazdir(bstTree.head);
 System.out.println("Çalışıyor mu");*/
    
    
    
 
 
    
    
    
    
    
