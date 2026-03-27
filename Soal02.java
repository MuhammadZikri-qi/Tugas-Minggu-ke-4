import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan merek susu (X/Y/Z): ");
        char merek = input.next().toUpperCase().charAt(0);
        System.out.print("Masukkan jumlah kotak: ");
        int jumlah = input.nextInt();
        
        double totalPembelian = 0, diskon = 0;
        
        switch (merek) {
            case 'X':
                totalPembelian = jumlah * 40000;
                if (jumlah >= 3) diskon = totalPembelian * 0.10;
                break;
            case 'Y':
                totalPembelian = jumlah * 50000;
                if (jumlah > 3) diskon = totalPembelian * 0.12;
                break;
            case 'Z':
                totalPembelian = jumlah * 60000;
                if (jumlah >= 2) {
                    diskon = ((jumlah - 1) * 60000) * 0.15;
                }
                break;
            default:
                System.out.println("Merek tidak valid.");
                return;
        }
        
        double totalPembayaran = totalPembelian - diskon;
        System.out.println("Total Pembelian: Rp." + totalPembelian);
        System.out.println("Diskon: Rp." + diskon);
        System.out.println("Total Pembayaran: Rp." + totalPembayaran);
        
        input.close();
    }
}
