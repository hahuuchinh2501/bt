package hinh;

import java.util.Scanner;

public class bai20_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("nhap so hang");
        int A = scanner.nextInt();
        
        System.out.println("nhap so cot");
        int B = scanner.nextInt();
        
      
        char[][] triangle = new char[A][B];
        
       
        for (int i = 0; i < A; i++) {
            for (int j = 0; j< B-i; j++) {
                if (i<=j) {
                    triangle[i][j] = '*'; 
                } else {
                    triangle[i][j] = ' ';
                }
            }
        }
        
        
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
