import java.util.Scanner; // import library untuk input

public class Square19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Menginput nilai n
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        // Outer loop = mengulangi baris sebanyak n kali
        for (int outer = 1; outer <= N; outer++) {

            // Inner loop = mencetak bintang sebanyak n kali dalam sebaris
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }

            // Pindah ke baris baru setelah baris selesai dicetak
            System.out.println();
        }

        sc.close(); // menutup 
    }
}
