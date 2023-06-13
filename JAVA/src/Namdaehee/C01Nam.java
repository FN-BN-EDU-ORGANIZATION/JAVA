package Namdaehee;
public class C01Nam {
    public static void main(String[] args) {
        int rows = 6; // 높이(행수)

        for (int i = 1; i <= rows; i++) {
            // 공백딱이
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // 별딱이
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
