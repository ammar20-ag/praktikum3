package ExceptionHandling;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ThrowsDemo {
    
    public static void bacaFile(String namaFile) throws FileNotFoundException {
        File file = new File(namaFile);
        Scanner reader = new Scanner(file);
        System.out.println("Isi file " + namaFile + ":");
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        reader.close();
    }

    public static void main(String[] args) {
        try {
            bacaFile("data.txt"); 
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } finally {
            System.out.println("Blok finally selalu dijalankan.");
        }
    }
}
