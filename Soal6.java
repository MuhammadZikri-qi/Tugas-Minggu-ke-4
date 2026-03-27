import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan umur PNP: ");
        int umur = input.nextInt();
        
        if (umur % 10 == 0) {
            System.out.println("Dekade PNP Ke " + (umur / 10));
        } else {
            System.out.println("Dies Natalis PNP Ke " + umur);
        }
        input.close();
    }
}
