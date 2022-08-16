package for_while_repeat;

public class R004 {
    public static void main(String[] args) {
        /*
            Girdi olarak bir tamsayı kabul eden ve
            faktöriyel hesaplayan programi yazıniz.
            Input : 6
            Output: 6!=6*5*4*3*2*1=720
       */
        int input = 7;
        int f = 1;
        System.out.print(input + "!=");
        for (int i = input; i >= 1; i--) {
            f = f * i;
            System.out.print(i);
            if (i != 1) System.out.print("*");
        }
        System.out.print("=" + f);
    }
}
