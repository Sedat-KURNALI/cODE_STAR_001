package for_while_repeat;

public class ForLoop001 {
    public static void main(String[] args) {
        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz
        String input = "al su taka tukalari taka tukaciya takatulatmaya gotur emi";
        String yedek = input;
        String temp = "";

        for (int i = 0; i < input.length(); i++) {
            temp = input.substring(i, i + 1);
            for (int j = i + 1; j < input.length(); j++) {
                if (temp.equals(input.substring(j, j + 1))) {
                    yedek = yedek.replace(temp, " ");
                    yedek = yedek.concat(temp);
                }
            }
        }
        System.out.println("input = " + input);
        yedek = yedek.replace(" ", "");
        System.out.println("tekrarlananlar = " + yedek);
    }
}
