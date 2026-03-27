import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nomor misi awal: ");
        int awal = input.nextInt();
        System.out.print("Nomor misi akhir: ");
        int akhir = input.nextInt();
        
        System.out.print("Misi yang membuka portal: ");
        for (int i = awal; i <= akhir; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        input.close();
    }
}
