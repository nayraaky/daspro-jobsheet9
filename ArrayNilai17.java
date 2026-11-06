import java.util.Scanner;

public class ArrayNilai17 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        int jumlahLulus         = 0;
        int jumlahTidakLulus    = 0;

            for (int i = 0; i < nilaiAkhir.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilaiAkhir[i] = input.nextInt();
            }

            System.out.println("+-----------------------------------+");
            for (int i = 0; i < nilaiAkhir.length; i++) {
                if (nilaiAkhir[i] > 70) {
                    System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
                    jumlahLulus++;
                } else {
                    System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (TIDAK LULUS)");
                    jumlahTidakLulus++;
                }
            }
            
            System.out.println("+-----------------------------------+");
            System.out.println("Jumlah mahasiswa lulus          : " + jumlahLulus);
            System.out.println("Jumlah mahasiswa tidak lulus    : " + jumlahTidakLulus);
        input.close();
    }
}
