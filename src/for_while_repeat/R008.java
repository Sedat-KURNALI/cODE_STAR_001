package for_while_repeat;

public class R008 {
    public static void main(String[] args) {
        /*
          'a' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.
            Ascii value of a = 97
            Ascii value of b = 98
       */

        for (int i = 97; i <= 122; i++) {
            System.out.println("Ascii value of " + (char) i + " = " + i);
        }
    }
}
