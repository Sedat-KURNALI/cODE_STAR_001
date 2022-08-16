package for_while_repeat;

public class R009 {
    public static void main(String[] args) {
        /*
            Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
                Input :1238
                Output :Girilen Numananin Tersi: 8321
       */
        int input = 1238;
        int gec = input;
        int tersSayi = 0;
        for (int i = 1; i <= 15; i++) {
            tersSayi = tersSayi * 10;
            tersSayi = tersSayi + gec % 10;
            gec = gec / 10;
            if (gec == 0) {
                i = 20;
            }
        }
        System.out.println("Girilen Numananin Tersi: " + tersSayi);


    }
}
