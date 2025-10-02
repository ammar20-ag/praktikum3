package array;

import java.util.ArrayList;
import java.util.HashMap;

public class DataMahasiswa {
    public static void main(String[] args) {

        String[] jurusan = {"Informatika", "Sistem Informasi", "Teknik Komputer"};
        System.out.println("=== Daftar Jurusan (Array) ===");
        for (String j : jurusan) {
            System.out.println(j);
        }

        ArrayList<String> mahasiswa = new ArrayList<>();
        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");
        mahasiswa.add("Dewi");

        System.out.println("\n=== Daftar Mahasiswa (ArrayList) ===");
        for (String m : mahasiswa) {
            System.out.println(m);
        }

        mahasiswa.remove("Citra");
        System.out.println("\nSetelah menghapus Citra:");
        for (String m : mahasiswa) {
            System.out.println(m);
        }

        HashMap<String, Integer> nilaiUjian = new HashMap<>();
        nilaiUjian.put("Andi", 85);
        nilaiUjian.put("Budi", 90);
        nilaiUjian.put("Dewi", 78);

        System.out.println("\n=== Nilai Ujian Mahasiswa (HashMap) ===");
        for (String nama : nilaiUjian.keySet()) {
            System.out.println(nama + " : " + nilaiUjian.get(nama));
        }

        String cari = "Budi";
        if (nilaiUjian.containsKey(cari)) {
            System.out.println("\nNilai " + cari + " adalah " + nilaiUjian.get(cari));
        } else {
            System.out.println("\nData " + cari + " tidak ditemukan.");
        }
    }
}
