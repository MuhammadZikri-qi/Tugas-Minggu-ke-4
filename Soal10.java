import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] hargaTiket = {
            {70000, 80000, 90000},
            {40000, 50000, 60000},
            {10000, 20000, 30000}
        };
        
        System.out.println("Kelas: 1. Eksekutif  2. Bisnis  3. Ekonomi");
        System.out.print("Pilih Kelas (1/2/3): ");
        int kelas = input.nextInt() - 1;
        
        System.out.println("Tujuan: 1. Jakarta  2. Yogya  3. Surabaya");
        System.out.print("Pilih Tujuan (1/2/3): ");
        int tujuan = input.nextInt() - 1;
        
        System.out.print("Banyak tiket dibeli: ");
        int banyak = input.nextInt();
        
        int hargaSatuan = hargaTiket[kelas][tujuan];
        double totalHarga = hargaSatuan * banyak;
        double diskon = 0;
        
        if (banyak >= 4) {
            if ((kelas == 0 && tujuan == 2) || (kelas == 2 && tujuan == 1)) {
                diskon = totalHarga * 0.10;
            }
        }
        
        double pembayaran = totalHarga - diskon;
        
        System.out.println("\n--- Detail Pembayaran ---");
        System.out.println("Harga Tiket: Rp." + hargaSatuan);
        System.out.println("Total Harga: Rp." + totalHarga);
        System.out.println("Diskon: Rp." + diskon);
        System.out.println("Besar Pembayaran: Rp." + pembayaran);
        
        input.close();
    }
}
