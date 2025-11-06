* Ad Soyad: [HALENAZ SARI]
 * Ogrenci No: [240541008]
 * Tarih: 06.11.2025
 * Aciklama: GÖREV3 Daire ve küre geometrik hesaplamaları programı
 */

import java.util.Scanner;

public class GeometrikHesaplayici {
    
  
    private static final double PI = 3.14159;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
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
