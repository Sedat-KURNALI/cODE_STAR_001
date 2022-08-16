package sorular;

public class S_001_10 {
    public static void main(String[] args) {
        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.substring(1);
        str2 = str2.substring(1);
        double sayi1 = Double.parseDouble(str1);
        double sayi2 = Double.parseDouble(str2);
        System.out.println("Toplam = $" + (sayi1 + sayi2));
    }
}
