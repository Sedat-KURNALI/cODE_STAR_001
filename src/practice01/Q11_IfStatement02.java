package practice01;

import java.util.Scanner;

public class Q11_IfStatement02 {
    public static void main(String[] args) {
        /*
            not hesaplayici
                    A => 90 ~100
                    B => 80 ~ 89
                    C => 70 ~ 79
                    D => 60 ~ 69
                    F =>  0 ~ 59
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Notunuzu Giriniz");
        int not = scan.nextInt();

        if (not < 0 || not > 100) {
            System.out.println("Notunuzu Düzgün Giriniz");
        } else if (not <= 59) {
            System.out.println("Notunuz F");
        } else if (not <= 69) {
            System.out.println("Notunuz D");
        } else if (not <= 79) {
            System.out.println("Notunuz C");
        } else if (not <= 89) {
            System.out.println("Notunuz B");
        } else {
            System.out.println("Notunuz A");
        }
    }
}
