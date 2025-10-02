package ExceptionHandling; 

import java.util.Scanner;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan bilangan pembilang: ");
            int a = input.nextInt();

            System.out.print("Masukkan bilangan penyebut: ");
            int b = input.nextInt();

            int hasil = a / b;   
            System.out.println("Hasil = " + hasil);

        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
        } finally {
            System.out.println("Blok finally SELALU dijalankan, apapun yang terjadi.");
        }

        input.close();
    }
}
