package bayramSonrasi;

import java.util.Arrays;

public class Q001 {
    public static void main(String[] args) {


        String[] str = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        int[] sayi = {1232, 1134, 2345, 1022};

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        Arrays.sort(sayi);
        System.out.println(Arrays.toString(sayi));


    }
}
