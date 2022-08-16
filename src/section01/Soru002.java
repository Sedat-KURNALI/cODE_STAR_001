package section01;

public class Soru002 {
    public static void main(String[] args) {
        /*
            For loop ve while Loop kullanarak 3 basamakli sayilardan
            15, 20 ve 90’na tam bolunebilen sayilari yazdirin.
        */
        int basla = 100, bitis = 999;
        int bolen1 = 15, bolen2 = 20, bolen3 = 90;
        int bolunebilenSayiAdedi = 0;
        while (basla <= bitis) {
            if (basla % bolen1 == 0 && basla % bolen2 == 0 && basla % bolen3 == 0) {
                System.out.print(basla + " ");
                bolunebilenSayiAdedi++;
            }
            basla++;
        }
        System.out.println("");
        System.out.println("bolunebilenSayiAdedi = " + bolunebilenSayiAdedi);
        System.out.println("===============================");

        basla = 100;
        bitis = 999;
        bolunebilenSayiAdedi = 0;
        for (int i = basla; i <= bitis; i++) {
            if (i % bolen1 == 0 && i % bolen2 == 0 && i % bolen3 == 0) {
                System.out.print(i + " ");
                bolunebilenSayiAdedi++;
            }
        }
        System.out.println("");
        System.out.println("bolunebilenSayiAdedi = " + bolunebilenSayiAdedi);
    }
}
