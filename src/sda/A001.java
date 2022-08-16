package sda;

import java.util.Arrays;

public class A001 {
    public static void main(String[] args) {
        int[] sayi = {3, 11, 5, 4, 2, 6, 17, 23, 54, 0};
        String[] isimler = new String[sayi.length];
        int i = 0;
        for (int each : sayi) {
            isimler[i] = "" + each;
            i++;
        }
        int control = 0;
        for (String each : isimler) {
            if (each.contains("7")) {
                control = 1;
            }
        }
        if (control == 1) {
            System.out.println("Boom");
        } else {
            System.out.println("7 rakami yok");
        }
    }
}
