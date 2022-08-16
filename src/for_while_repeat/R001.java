package for_while_repeat;

public class R001 {
    public static void main(String[] args) {
        /*
            Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
            Input :
            String str=“Javaisalsoeasy”
            Output: a s
         */
        String str = "Javaisalsoeasy";
        String tekrar = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                    if (!tekrar.contains(str.substring(i, i + 1))) {
                        tekrar += str.substring(i, i + 1) + " ";
                    }
                }
            }
        }
        System.out.println("tekrar = " + tekrar);
    }
}
