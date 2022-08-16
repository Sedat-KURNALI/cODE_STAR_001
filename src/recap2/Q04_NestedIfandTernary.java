package recap2;

public class Q04_NestedIfandTernary {
    public static void main(String[] args) {
         /*
                0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
               kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
               cikis "Gecersiz" olmalidir
               NestedIf ve Ternary kullanarak 2 yolla da cozunuz
        */
        int sayi = 7;
        String sonuc = "";
        sonuc=(!(sayi >= 0 && sayi <= 9))?"Geçersiz giriş": sayi == 0 ?"Sifir": sayi == 1?"Bir":(sayi == 2)?"Iki":
                sayi == 3?"üç":sayi == 4?"Dort":sayi == 5?"Bes":sayi == 6?"Alti":sayi == 7?"Yedi":sayi == 8?"Sekiz":"Dokuz";

        System.out.println("sonuc = " + sonuc);

        if (sayi >= 0 && sayi <= 9) {
            if (sayi == 0) {
                sonuc = ("Sifir");
            } else if (sayi == 1) {
                sonuc = ("Bir");
            } else if (sayi == 2) {
                sonuc = ("Iki");
            } else if (sayi == 3) {
                sonuc = ("Uc");
            } else if (sayi == 4) {
                sonuc = ("Dort");
            } else if (sayi == 5) {
                sonuc = ("Bes");
            } else if (sayi == 6) {
                sonuc = ("Alti");
            } else if (sayi == 7) {
                sonuc = ("Yedi");
            } else if (sayi == 8) {
                sonuc = ("Sekiz");
            } else if (sayi == 9) {
                sonuc = ("Dokuz");
            }
        } else {
            sonuc = ("Geçersiz giriş");
        }
        System.out.println("sonuc = " + sonuc);
    }
}
