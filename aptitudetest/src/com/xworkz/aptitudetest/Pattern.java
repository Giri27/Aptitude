package com.xworkz.aptitudetest;

import java.util.Scanner;

public class Pattern {
	
	public int diamond(int rc) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix size");
		rc = sc.nextInt();
		
		System.out.println("\nDiamond pattern");
		for(int r=1; r <= rc; r++) {
			for(int c=1; c <= rc; c++) {
				if(r+c==rc-1 || r+c==rc+1 || r+c==rc+3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\nRectangle without corners pattern");
		for(int r=1; r <= rc; r++) {
			for(int c=1; c <= rc; c++) {
				if((r==1 || c==rc || c==1 || r==rc )&& r!=c) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		return 0;
	}

}
