import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ukuran: ");
        int n = input.nextInt();
        
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
