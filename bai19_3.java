package hinh;

import java.util.Scanner;

public class bai19_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("nhap so");
        int size = scanner.nextInt();
        
      
        char[][] square = new char[size][size];
        
       
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ( i == j || i == size - 1 - j || i == size / 2 || j == size / 2) {
                    square[i][j] = '*'; 
                } else {
                    square[i][j] = ' '; 
                }
            }
        }
        
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
