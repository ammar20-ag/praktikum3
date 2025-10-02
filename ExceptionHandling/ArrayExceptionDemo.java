package ExceptionHandling;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        String[] nama = {"Andi", "Budi", "Citra"};

        try {
            System.out.println("Elemen ke-5: " + nama[4]); // indeks 4 tidak ada
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indeks array di luar batas!");
        } finally {
            System.out.println("Program tetap berjalan meskipun ada error.");
        }
    }
}
