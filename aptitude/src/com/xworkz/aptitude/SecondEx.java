package com.xworkz.aptitude;

import java.util.Scanner;

public class SecondEx {
	
	public static void main(String[] args) {
		
		SecondEx sec = new SecondEx();
		sec.example();		
	}
	
	public void example() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<6; i++) {
			if(i % 2 ==0) {
				sum = number + i;
			}
		}
		System.out.println("Sum :" +sum);
	}

}
