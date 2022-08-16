package replit;

public class TR_SYSO_7 {
    public static void main(String[] args) {
        /*
           Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)
           int a= 3;
           int b= 5;
           Ornek Cikti:
                a=5
                b=3
        */
        int a = 3;
        int b = 5;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
