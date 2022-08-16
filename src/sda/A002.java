package sda;

public class A002 {
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        for (int[] each : a) {
            for (int sayi : each) {
                System.out.print(sayi + " ");
            }
            System.out.println();
        }
    }
}
