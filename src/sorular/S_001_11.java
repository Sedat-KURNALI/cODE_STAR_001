package sorular;

public class S_001_11 {
    public static void main(String[] args) {

        String str1 = "sEdaT";
        System.out.println(str1);

        str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase();

        System.out.println(str1);

    }
}
