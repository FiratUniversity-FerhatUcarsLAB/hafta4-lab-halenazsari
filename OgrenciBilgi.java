/*
 * Ad Soyad: [HALENAZ SARI]
 * Ogrenci No: [240541008]
 * Tarih: [06.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
         Scanner input = new scanner(System.in);
        
        
        String ad;
        String soyad;
        int ogrenciNo;
        int yas;
        double gpa;
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        System.out.print("Adinizi girin: ");
        ad = input.nextLine();
        
        
        // Soyad
        System.out.print("Soyadinizi girin: ")
        soyad = input.nextLine();
        
        // Ogrenci No
        System.out.print("Ogrenci numaraninizi girin: ");
        ogrenciNo = input.nextInt();
        
        
        // Yas
        System.out.print("Yaşınızı girin: ");
        yas = input.nextInt
        
        
        // GPA
        System.out.print("GPA (Not Ortalaması) girin: ")
        gpa = intput.nextDouble
        
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
        System.out.println("Ad: " + ad);
        System.out.println("Soyad:" + ad);
        System.out.println("Ogrenci No: + ogrenciNo);
        System.out.println("Yas: " + yas);
        System.out.println("GPA: " + gpa);
        
        
        
        
        

        
        
        // Scanner'i kapatin (önemli pratik)
        input.close();
        
    }
}
