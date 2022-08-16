package recap1;

import java.util.Scanner;

public class Q07_BMISiniflama {
    public static void main(String[] args) {
        /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("kg olarak ağırlığınızı giriniz : ");
        double agirlik = scan.nextDouble();
        System.out.println("cm olarak boyunuzu giriniz : ");
        double boy = scan.nextDouble()/100;
        double bmi = agirlik / (boy * boy);
        System.out.println("BMI " + bmi);
        if (bmi <= 20) {
            System.out.println("Oldukca zayifsiniz");
        } else if (bmi <= 25) {
            System.out.println("Normal sinirlardasiniz");
        } else if (bmi <= 30) {
            System.out.println("Sisman kategorisindesiniz");
        } else {
            System.out.println("Obez kategorisindesiniz");
        }
    }
}
