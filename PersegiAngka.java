import java.util.Scanner;

public class PersegiAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = input.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal adalah 3!");
            return;
        }

        // bagian atas persegi
        for (int i = 1; i <= n; i++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // bagian tengah persegi
        for (int i = 1; i <= n - 2; i++) {
            System.out.print(n + " ");
            for (int j = 1; j <= n - 2; j++) {
                System.out.print("  "); // spasi di tengah
            }
            System.out.println(n);
        }

        // bagian bawah persegi
        for (int i = 1; i <= n; i++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
