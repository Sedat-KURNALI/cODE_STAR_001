package section01;

import java.util.Scanner;

public class S002_ArtikYil3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Artik Yil Hesabi Yapilacak Yili Giriniz : ");
        int yil = scan.nextInt();
        boolean artikYilMi;

        artikYilMi = (yil % 4 == 0);  // 4 e bölünebiliyor mu

        artikYilMi = artikYilMi && (yil % 100 != 0); // 4 e bölünüp 100 e bölünemiyor mu

        artikYilMi = artikYilMi || (yil % 400 == 0); // 4 e bölünüp 100 e bölünemeyen  400 e bölünen

        if(artikYilMi){
            System.out.println("Artik Yil");
        }else{
            System.out.println("Artik Yil Degil");
        }
    }
}
