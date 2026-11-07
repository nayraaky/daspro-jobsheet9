package tugas;

import java.util.Scanner;

public class PemesananKafeKampus17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
                "Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        int[] harga = { 15000, 13000, 10000, 12000, 8000, 18000, 20000 };

        System.out.println("+------------------------------------+");
        System.out.println("          DAFTAR MENU KAFE            ");
        System.out.println("+------------------------------------+");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println("+------------------------------------+");

        System.out.print("\nCari Menu: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("    Menu \"" + menu[i] + "\" tersedia seharga Rp " + harga[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("    Menu \"" + cari + "\" tidak tersedia.");
        }

        int jumlahPesanan;
        do {
            System.out.print("\nJumlah menu yang ingin dipesan: ");
            jumlahPesanan = sc.nextInt();
            if (jumlahPesanan <= 0) {
                System.out.println("    Jumlah pesanan harus lebih dari 0!");
            }
        } while (jumlahPesanan <= 0);
        sc.nextLine(); 

        String[] pesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBayar = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            boolean valid = false;
            do {
                System.out.print("Pesanan ke-" + (i + 1) + " (nama menu): ");
                String pilihan = sc.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(pilihan)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        totalBayar += harga[j];
                        valid = true;
                        break;
                    }
                }

                if (!valid) {
                    System.out.println("    Menu tidak ada! Silakan masukkan nama menu yang sesuai.");
                }
            } while (!valid);
        }

        System.out.println("\n---------- Daftar Pesanan ----------");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " : Rp " + hargaPesanan[i]);
        }
        System.out.println("--------------------------------------");
        System.out.println("Total Biaya : Rp " + totalBayar);
        System.out.println("+------------------------------------+");

        sc.close();
    }
}
