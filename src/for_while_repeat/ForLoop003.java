package for_while_repeat;

public class ForLoop003 {
    public static void main(String[] args) {
        String input = "Hatice";
        for (int i = 0; i <= input.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(input.substring(j, j + 1) + " ");
            }
            System.out.println("");
        }
        for (int i = input.length() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(input.substring(j, j + 1) + " ");
            }
            System.out.println("");
        }
    }
}
