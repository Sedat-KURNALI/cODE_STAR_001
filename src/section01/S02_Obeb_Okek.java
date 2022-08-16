package section01;

public class S02_Obeb_Okek {
    public static void main(String[] args) {
        /*
                obeb ve okek bulma
        */
        int s1 = 10;
        int s2 = 2;
        int obeb = 0;
        int okek;
        if (s1 < s2) {
            for (int i = 1; i <= s1; i++) {
                if (s1 % i == 0 && s2 % i == 0) {
                    obeb = i;
                }
            }
        } else {
            for (int i = 1; i <= s2; i++) {
                if (s1 % i == 0 && s2 % i == 0) {
                    obeb = i;
                }
            }
        }
        System.out.println("obeb = " + obeb);
        System.out.println("okek = " + (s1 * s2) / obeb);
    }
}
