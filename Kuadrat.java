public class Kuadrat {
    public static void main(String[] args) {
        int batas = 5; // batas nilai n (1 s.d 5)

        for (int n = 1; n <= batas; n++) {
            int jumlahKuadrat = 0;
            String deret = "";

            // perulangan dalam untuk menghitung jumlah kuadrat dari 1 sampai n
            for (int i = 1; i <= n; i++) {
                int kuadrat = i * i;
                jumlahKuadrat += kuadrat;
                deret += i * i;

                // tambahkan tanda + kecuali di akhir
                if (i < n) {
                    deret += " + ";
                }
            }

            // tampilkan hasil sesuai ketentuan
            if (n == 1) {
                System.out.println("n = " + n + " -> jumlah kuadrat = " + deret);
            } else {
                System.out.println("n = " + n + " -> jumlah kuadrat = " + deret + " = " + jumlahKuadrat);
            }
        }
    }
}