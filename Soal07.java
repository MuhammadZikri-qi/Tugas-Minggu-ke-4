import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jam lembur: ");
        int jamLembur = input.nextInt();
        
        if (jamLembur > 50) {
            jamLembur = 50;
        }
        
        int totalUpah = 0;
        if (jamLembur <= 20) {
            totalUpah = jamLembur * 2000;
        } else {
            totalUpah = jamLembur * 3000;
        }
        
        System.out.println("Total upah lembur: Rp." + totalUpah);
        input.close();
    }
}
