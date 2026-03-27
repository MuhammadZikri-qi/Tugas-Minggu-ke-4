import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        
        while (true) {
            System.out.print("Masukkan bilangan genap: ");
            bilangan = input.nextInt();
            
            if (bilangan % 2 == 0) {
                System.out.println("Hasil: " + (bilangan + 1));
                break;
            } else {
                System.out.println("Itu bilangan ganjil kocag .");
            }
        }
        input.close();
    }
}
