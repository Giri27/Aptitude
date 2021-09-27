package com.xworkz.aptitudetest;

public class Prime {
	
	public int primeNumber(int number) {
		
		boolean prime=false;
		for (int i = 2; i <=number/2 ;i++) {
			if(number % i == 0) {
				prime=true;
			}
		}
		if(prime==true) {
			System.out.println(number +" is not a prime");
		} else if (prime==false) {
			System.out.println(number +" is prime");
		}
		
		primeNumber(number);
		return 0;
	}

}
