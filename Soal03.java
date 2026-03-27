import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Batas awal: ");
        int awal = input.nextInt();
        System.out.print("Batas akhir: ");
        int akhir = input.nextInt();
        
        int jumlahDeret = 0;
        int count = 0;
        
        System.out.print("Deret: ");
        for (int i = awal; i <= akhir; i++) {
            if (i % 11 == 0 && i % 2 != 0) {
                System.out.print(i + " ");
                jumlahDeret += i;
                count++;
            }
        }
        System.out.println("\nJumlah deret: " + jumlahDeret);
        if (count > 0) {
            System.out.println("Rata-rata: " + ((double) jumlahDeret / count));
        } else {
            System.out.println("Tidak ada deret yang sesuai.");
        }
        input.close();
    }
}
