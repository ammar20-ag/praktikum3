package ExceptionHandling;

public class NullPointerDemo {
    public static void main(String[] args) {
        String teks = null;

        try {
            System.out.println(teks.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Objek masih null!");
        } finally {
            System.out.println("Blok finally tetap dijalankan.");
        }
    }
}
