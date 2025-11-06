* Ad Soyad: [HALENAZ SARI]
 * Ogrenci No: [240541008]
 * Tarih: 06.11.2025
 * Aciklama: GÖREV3 Daire ve küre geometrik hesaplamaları programı
 */

import java.util.Scanner;

public class GeometrikHesaplayici {
    
  
    private static final double PI = 3.14159;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        double yaricap = scanner.nextDouble();
        
      
        
        
        double daireAlani = PI * Math.pow(yaricap, 2);
        
        
        double daireCevresi = 2 * PI * yaricap;
        
        
        double daireCapi = 2 * yaricap;
        
        
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(yaricap, 3);
        
        
        double kureYuzeyAlani = 4 * PI * Math.pow(yaricap, 2);
        
        
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani        : %.2f cm²\n", daireAlani);
        System.out.printf("Daire Cevresi      : %.2f cm\n", daireCevresi);
        System.out.printf("Daire Capi         : %.2f cm\n", daireCapi);
        System.out.printf("Kure Hacmi         : %.2f cm³\n", kureHacmi);
        System.out.printf("Kure Yuzey Alani   : %.2f cm²\n", kureYuzeyAlani);
        
        scanner.close();
    }
}



=== GEOMETRIK HESAPLAYICI ===
Dairenin yaricapini girin (cm): 5.0

SONUCLAR:
----------
Daire Alani        : 78.54 cm²
Daire Cevresi      : 31.42 cm
Daire Capi         : 10.00 cm
Kure Hacmi         : 523.60 cm³
Kure Yuzey Alani   : 314.16 cm²



    === GEOMETRIK HESAPLAYICI ===
Dairenin yaricapini girin (cm): 7.5

SONUCLAR:
----------
Daire Alani        : 176.71 cm²
Daire Cevresi      : 47.12 cm
Daire Capi         : 15.00 cm
Kure Hacmi         : 1767.15 cm³
Kure Yuzey Alani   : 706.86 cm²
