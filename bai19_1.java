package hinh;

import java.util.Scanner;
public class bai19_1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("nhap so");
	        int rows = scanner.nextInt();
	        
	      
	        char[][] triangle = new char[rows][rows];
	        
	       
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j <= i; j++) {
	                if (j == 0 || i == j || i == rows - 1) {
	                    triangle[i][j] = '*'; 
	                } else {
	                    triangle[i][j] = ' '; 
	                }
	            }
	        }
	        
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(triangle[i][j] + " ");
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }

}

