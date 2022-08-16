package sorular;

import java.util.Scanner;

public class S_001_12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen şifrenizi giriniz : ");
        String password = scan.nextLine();

        int kontrol = 0;

        char ilkHarf = password.charAt(0);
        char sonHarf = password.charAt(password.length() - 1);

        if (!(ilkHarf >= 'A' && ilkHarf <= 'Z')) {
            System.out.println("ilk harf büyük değil"); // daha sonra bu satır silinebilir
            kontrol = 1;
        }
        if (!(sonHarf >= 'a' && sonHarf <= 'z')) {
            System.out.println("son harf küçük değil"); // daha sonra bu satır silinebilir
            kontrol = 1;
        }
        if (!password.equals(password.replace(" ", ""))) {  // if (password.contains(" ")) {    diye yapılabilirdi
            System.out.println("Şifrede boşluk var"); // daha sonra bu satır silinebilir
            kontrol = 1;
        }
        if (password.length() < 8) {
            System.out.println("Sifre çok kısa"); // daha sonra bu satır silinebilir
            kontrol = 1;
        }
        if (kontrol == 0) {
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            System.out.println("Islem basarisiz, Lutfen yeni bir sifre girin");
        }
    }
}


