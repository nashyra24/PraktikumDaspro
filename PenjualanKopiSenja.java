import java.util.Scanner;

public class PenjualanKopiSenja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = input.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===\n");

        int totalPelangganSemuaCabang = 0;
        int totalItemSemuaCabang = 0;

        // perulangan untuk setiap cabang
        for (int cabang = 1; cabang <= jumlahCabang; cabang++) {
            System.out.println("--- Cabang " + cabang + " ---");

            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = input.nextInt();

            int totalItemCabang = 0;

            // perulangan untuk setiap pelanggan
            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                System.out.print("- Pelanggan " + pelanggan + " memesan berapa item? ");
                int jumlahItem = input.nextInt();
                totalItemCabang += jumlahItem;
            }

            // tampilkan hasil per cabang
            System.out.println("Cabang " + cabang + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang + "\n");

            // tambahkan ke total keseluruhan
            totalPelangganSemuaCabang += jumlahPelanggan;
            totalItemSemuaCabang += totalItemCabang;
        }

        // tampilkan total keseluruhan
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelangganSemuaCabang + " orang");
        System.out.println("Item terjual: " + totalItemSemuaCabang + " item");
    }
}
