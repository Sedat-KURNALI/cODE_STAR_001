package methodlar001;

import java.util.Scanner;

public class Q002_1 {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 15;

        topla(sayi1, sayi2);
        int s = cikar(sayi1, sayi2);

        System.out.println("Cikartma sonucu =" + s);
        System.out.println("Carpma sonucu =" + carpma());
    }

    public static int carpma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayı :");
        int k = scan.nextInt();
        System.out.println("2.sayı :");
        int l = scan.nextInt();
        return k * l;
    }

    public static void topla(int a, int b) {
        int c = a + b;
        System.out.println("toplam sonucu =" + c);
    }

    public static int cikar(int d, int e) {
        return d - e;
    }
}
