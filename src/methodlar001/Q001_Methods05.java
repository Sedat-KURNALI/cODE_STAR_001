package methodlar001;

public class Q001_Methods05 {

    public static void main(String[] args) {
        /*
            Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
            Input :
            John White
            1234234534561478
            Output : Name :
            J*** W****
            CCN : **** **** **** 1478
            Ilk Harfler Buyuk harf ile baslamalidir.
            7:37
            soru buydu. sizin yolladığım kodla da olmadı.
        */

        String name = "John White";
        String ccn = "1234234534561478"; // "1234 2345 3456 1478"
        System.out.println("name = " + name);
        System.out.println("ccn = " + ccn);
        int bosluk = name.indexOf(" ");
        String nameSonHali = name.substring(0, 1) + name.substring(1, bosluk).replaceAll("\\w", "*") + " "
                + name.substring(bosluk + 1, bosluk + 2) + name.substring(bosluk + 2).replaceAll("\\w", "*");
        // ccn 16 hanedir ve matematiksel işlem olmayacağı için String yaptım 4 - 4 ayıracam
        String ccnSonHali = ccn.substring(0, 4).replaceAll("\\d", "*") + " "
                + ccn.substring(4, 8).replaceAll("\\d", "*") + " "
                + ccn.substring(8, 12).replaceAll("\\d", "*") + " "
                + ccn.substring(12);
        System.out.println("nameSonHali = " + nameSonHali);
        System.out.println("ccnSonHali = " + ccnSonHali);

    }

}