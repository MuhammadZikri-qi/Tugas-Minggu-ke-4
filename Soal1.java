import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalHalaman = 50;
        int tarifPerHalaman = 15000;
        
        System.out.print("Masukkan jumlah halaman yang sudah diketik (X): ");
        int x = input.nextInt();
        
        if (x >= 0 && x <= totalHalaman) {
            int uangPastiDiterima = x * tarifPerHalaman;
            int uangPotensial = (totalHalaman - x) * tarifPerHalaman;
            
            System.out.println("\n--- Rincian Pendapatan Dina ---");
            System.out.printf("Uang yang pasti diterima Dina : Rp %,d\n", uangPastiDiterima);
            System.out.printf("Uang yang masih bisa didapatkan : Rp %,d\n", uangPotensial);
        } else {
            System.out.println("\nInput tidak valid. Jumlah halaman harus antara 0 hingga 50.");
        }
        
        input.close();
    }
}
