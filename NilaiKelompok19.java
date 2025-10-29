import java.util.Scanner; // Import library Scanner untuk input
public class NilaiKelompok19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;  // variabel untuk menghitung jumlah kelompok
        int j;      // variabel untuk menghitung jumlah penilai
        int nilai;  // untuk menampung input nilai
        int totalNilai; // total nilai tiap kelompok
        double rataRata; // rata-rata nilai tiap kelompok

        // Outer loop: mengulangi proses untuk setiap kelompok
        while (i <= 6) { // misal ada 6 kelompok
            System.out.println("Kelompok " + i + " :");
            totalNilai = 0; // reset total nilai setiap kelompok ke 0

            // Inner loop: setiap kelompok dinilai oleh 5 penilai
            for (j = 1; j <= 5; j++) {
                System.out.print("  Nilai dari Kelompok Penilai " + j + " = ");
                nilai = sc.nextInt(); // input nilai
                totalNilai += nilai;  // akumulasi nilai
            }

            // Menghitung rata-rata tiap kelompok
            rataRata = totalNilai / 5.0;

            // Menampilkan hasil
            System.out.println("  Total Nilai Kelompok " + i + " = " + totalNilai);
            System.out.println("  Rata-rata Nilai Kelompok " + i + " = " + rataRata);
            System.out.println("------------------------------------");

            i++; // Melanjutkan ke kelompok berikutnya
        }

        sc.close(); // tutup scanner
    }
}
