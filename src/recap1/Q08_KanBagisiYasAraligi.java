package recap1;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {
    public static void main(String[] args) {
        /*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu aliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();
        System.out.println("Lutfen agirliginizi giriniz (kg) : ");
        int agirlik = scan.nextInt();

        if (yas > 0 && yas < 18) {
            System.out.println("kan bagisi yapamaz");
        } else if (agirlik >= 50) {
            System.out.println("kan bagisi yapabilir");
        } else {
            System.out.println("kan bagisi yapamaz");
        }
    }
}