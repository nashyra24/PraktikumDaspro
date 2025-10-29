import java.util.Scanner; // Import library Scanner untuk input

public class NilaiKelompok19Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;  // variabel untuk menghitung jumlah kelompok
        int j;      // variabel untuk menghitung jumlah penilai
        int nilai;  // untuk menampung input nilai
        int totalNilai; // total nilai tiap kelompok
        double rataRata; // rata-rata nilai tiap kelompok

        double rataTertinggi = 0; // menyimpan nilai rata-rata tertinggi
        int kelompokTertinggi = 0; // menyimpan nomor kelompok dengan rata-rata tertinggi

        // Outer loop: mengulangi proses untuk setiap kelompok
        while (i <= 3) { // misal ada 3 kelompok
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

            // Mengecek apakah rata-rata kelompok ini lebih tinggi dari yang tertinggi sebelumnya
            if (rataRata > rataTertinggi) {
                rataTertinggi = rataRata;
                kelompokTertinggi = i;
            }

            i++; // Melanjutkan ke kelompok berikutnya
        }

        // Menampilkan kelompok dengan rata-rata tertinggi
        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok " 
                           + kelompokTertinggi + " dengan rata-rata " + rataTertinggi);

        sc.close(); // tutup scanner
    }
}