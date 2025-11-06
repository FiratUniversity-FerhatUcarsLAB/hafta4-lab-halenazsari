Ad Soyad: [HALENAZ SARI]
 * Ogrenci No: [240541008]
 * Tarih: [06.11.2025]
  Aciklama: [GOREV2-MAAŞ HESAPLAMA]  Çalışan maaş bordrosu hesaplama programı

  import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MaasHesaplama {
    
    
    private static final double SGK_ORANI = 0.14;      
    private static final double GELIR_VERGISI_ORANI = 0.15;  
    private static final double DAMGA_VERGISI_ORANI = 0.00759; 
    
    
    private static final int AYLIK_CALISMA_SAATI = 160;
    private static final double MESAI_KATSAYISI = 1.5;
    private static final int AYLIK_IS_GUNU = 22;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        LocalDate bugun = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String tarih = bugun.format(formatter);
        
        
        System.out.println("=== MAAS HESAPLAMA SISTEMI ===\n");
        
        System.out.print("Calisan adi soyadi: ");
        String adSoyad = scanner.nextLine();
        
        System.out.print("Brut maas (TL): ");
        double brutMaas = scanner.nextDouble();
        
        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = scanner.nextInt();
        
        System.out.print("Mesai saati sayisi: ");
        int mesaiSaati = scanner.nextInt();
        
      
        
  
        double saatlikUcret = brutMaas / AYLIK_CALISMA_SAATI;
        double mesaiUcreti = saatlikUcret * mesaiSaati * MESAI_KATSAYISI;
        
        
        double toplamGelir = brutMaas + mesaiUcreti;
        
        
        double sgkKesintisi = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;
        
      
        double netMaas = toplamGelir - toplamKesinti;
        
      
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double toplamAylikSaat = (haftalikSaat * 4) + mesaiSaati; 
        double saatlikNetKazanc = netMaas / toplamAylikSaat;
        double gunlukNetKazanc = netMaas / AYLIK_IS_GUNU;
        
        
        System.out.println("\n====================================");
        System.out.println("         MAAS BORDROSI");
        System.out.println("====================================");
        System.out.printf("Calisan: %s\n", adSoyad);
        System.out.printf("Tarih: %s\n", tarih);
        
        System.out.println("\nGELIRLER:");
        System.out.printf("  Brut Maas              : %,.2f TL\n", brutMaas);
        System.out.printf("  Mesai Ucreti (%d saat) : %,.2f TL\n", mesaiSaati, mesaiUcreti);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM GELIR           : %,.2f TL\n", toplamGelir);
        
        System.out.println("\nKESINTILER:");
        System.out.printf("  SGK Kesintisi (%.1f%%)  : %,.2f TL\n", SGK_ORANI * 100, sgkKesintisi);
        System.out.printf("  Gelir Vergisi (%.1f%%)  : %,.2f TL\n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("  Damga Vergisi (%.1f%%)   : %,.2f TL\n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM KESINTI         : %,.2f TL\n", toplamKesinti);
        
        System.out.printf("\nNET MAAS                 : %,.2f TL\n", netMaas);
        
        System.out.println("\nISTATISTIKLER:");
        System.out.printf("  Kesinti Orani          : %.1f%%\n", kesintiOrani);
        System.out.printf("  Saatlik Net Kazanc     : %.2f TL/saat\n", saatlikNetKazanc);
        System.out.printf("  Gunluk Net Kazanc      : %.2f TL/gun\n", gunlukNetKazanc);
        System.out.println("====================================");
        
        scanner.close();
    }
}

Brüt Maaş: 15.000 TL
Mesai: 10 saat
Net Maaş: 11.523,91 TL
Kesinti: %29,8
