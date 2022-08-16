package section01;

public class dfgfg {
    public static void main(String[] args) {
        String input = "Ankara";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
