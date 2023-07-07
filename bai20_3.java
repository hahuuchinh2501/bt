package hinh;
import java.util.Scanner;
public class bai20_3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap M: ");
        int M = scanner.nextInt();
        System.out.print("nhap N: ");
        int N = scanner.nextInt();

        char[][] tamGiac = new char[M][2 * N - 1];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                if (i == M - 1 || i + j == M - 1 || j - i == N - 1) {
                    tamGiac[i][j] = '*';
                } else {
                    tamGiac[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                System.out.print(tamGiac[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }

}
