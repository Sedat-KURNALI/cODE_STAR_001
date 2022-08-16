package practice01;

public class Q13_Ternary {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin.
         * eger fiyat 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" ,
         * 20 ve 20 den buyuk ise pahali olsun
         */
        int fiyat = 50;
        if (fiyat < 10) {
            System.out.println("Ucuz : " + fiyat);
        } else if (fiyat < 20) {
            System.out.println("Normal : " + fiyat);
        } else {
            System.out.println("Pahalı : " + fiyat);
        }


        System.out.print(fiyat < 10 ? "Ucuz : " : fiyat < 20 ? "Normal : " : "Pahalı : ");
        System.out.println(fiyat);
    }

}
