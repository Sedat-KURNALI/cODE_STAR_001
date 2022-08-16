package for_while_repeat;

public class ForLoop006 {
    public static void main(String[] args) {
        /*      Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
                Test Data:
                Yarım elmas uzunluğu : 7
                Beklenen Çıktı:
                      *
                     ***
                    *****
                   *******
                  *********
                 ***********
                *************
                 ***********
                  *********
                   *******
                    *****
                     ***
                      *
             */
        int a = 7;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= (a - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

