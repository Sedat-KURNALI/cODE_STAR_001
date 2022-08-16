package section01;

public class S01_Frekans {
    public static void main(String[] args) {
        /*

         */
        String str = "sdfjsdnfaacc";
        str = str.toLowerCase();

        for (char i = 'a'; i <= 'z'; i++) {
            int toplam = 0;
            for (int j = 0; j < str.length(); j++) {
                if (i == str.charAt(j)) {
                    toplam++;
                }
            }
            if (toplam!=0) {
                System.out.print("" + i + toplam + " ");
            }
        }
    }
}
