package tugas;

import java.util.Scanner;

public class PengelolaanNilaiMhs17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahMhs;
        do {
            System.out.println("+------------------------------------+");
            System.out.print("Masukkan jumlah mahasiswa: ");
            jumlahMhs = sc.nextInt();
            if (jumlahMhs <= 0) {
                System.out.println("Jumlah mahasiswa harus lebih dari 0!");
            }
        } while (jumlahMhs <= 0);
        
        int[] nilai = new int[jumlahMhs];
        int total = 0;

        System.out.println("\n========== Input Data Nilai ==========");
        for (int i = 0; i < nilai.length; i++) {
            do {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilai[i] = sc.nextInt();
                if (nilai[i] < 0 || nilai[i] > 100) {
                    System.out.println("Nilai harus diantara 0 - 100!");
                }
            } while (nilai[i] < 0 || nilai[i] > 100);
            total += nilai[i];
        }
        
        double rata2 = (double) total / nilai.length;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi)
                tertinggi = nilai[i];
            if (nilai[i] < terendah)
                terendah = nilai[i];
        }
        
        System.out.println("\n======= Daftar Nilai Mahasiswa =======");
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        System.out.println("\n========= Rekapitulasi Nilai =========");
        System.out.println("Total nilai        :" + total);
        System.out.println("Rata-rata          :" + rata2);
        System.out.println("Nilai tertinggi    :" + tertinggi);
        System.out.println("Nilai terendah     :" + terendah);
        System.out.println("+------------------------------------+");
    }
}
