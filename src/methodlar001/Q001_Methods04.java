package methodlar001;

public class Q001_Methods04 {

    public static void main(String[] args) {
        String isim = "TechProEducation 1234 14221//()&%AAA 123 ";
        String yeniisim = isim.substring(0, 1)
                + isim.substring(1, 4).replaceAll("\\w","*").replaceAll("\\W","*")
                + isim.substring(4, 5)
                +isim.substring(5).replaceAll("\\w","*").replaceAll("\\W","*");
        System.out.println(isim);
        System.out.println(yeniisim);


    }

}