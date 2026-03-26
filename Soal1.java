import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan banyak halaman yang diselesaikan Dina (X): ");
        int x = input.nextInt();
        
        if (x >= 0 && x <= 50) {
            int uangPasti = x * 15000;
            int uangSisa = (50 - x) * 15000;
            
            System.out.println("Uang yang pasti diterima Dina: Rp." + uangPasti);
            System.out.println("Uang yang masih bisa didapatkan: Rp." + uangSisa);
        } else {
            System.out.println("Input tidak valid. Halaman maksimal adalah 50.");
        }
        input.close();
    }
}
