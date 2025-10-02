package ExceptionHandling;

public class ThrowDemo {

    public static void cekUmur(int umur) {
        if (umur < 17) {
            throw new IllegalArgumentException("Umur minimal 17 tahun untuk mendaftar!");
        } else {
            System.out.println("Umur valid, silakan lanjut pendaftaran.");
        }
    }

    public static void main(String[] args) {
        try {
            cekUmur(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
