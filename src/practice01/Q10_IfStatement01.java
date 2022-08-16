package practice01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Javayı seviyormusun Y / N ");
        char soru = scan.next().charAt(0);

        if (soru == 'y' || soru == 'Y') {
            System.out.println("YES");
        } else if (soru == 'n' || soru == 'N') {
            System.out.println("NO");
        } else {
            System.out.println("Hatalı Cevap");
        }
    }
}
