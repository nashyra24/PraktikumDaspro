import java.util.Scanner; // import library Scanner untuk input

public class Triangle19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menginput nilai N
        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();

        int i = 1; // inisialisasi baris dimulai dari 1

        // Outer loop = mengulangi baris sebanyak n kali
        while (i <= n) {
            int j = 1;

            // Inner loop = mencetak bintang sebanyak n kali dalam sebaris
            while (j <= i) {
                System.out.print("*");
                j++;
            }

            // Pindah ke baris baru setelah baris selesai dicetak
            System.out.println();
            i++;
        }

        sc.close(); 
    }
}

