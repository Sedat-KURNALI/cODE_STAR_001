package otherSample001;

public class a02323 {
    public static void main(String[] args) {
        //100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
        //OUTPUT : 100 98 96 94 92 … … … … 2 0
        int sayi = 100;
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(sayi - i + " ");
        }
    }
}

