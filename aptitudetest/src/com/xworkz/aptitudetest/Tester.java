package com.xworkz.aptitudetest;

public class Tester {
	
	public static void main(String[] args) {
		
		
		short array[] = {12,43,126,34,25,64,43,11,1,45,87,78,56,3};
		
		int no = 87;
		LinearSearch ls = new LinearSearch();
		ls.linearSearch(array , no);
		
		
		Sort sort = new Sort();
		sort.sorting(array);
		System.out.println("\nSorting");
		for(int i=0; i< array.length; i++){
			System.out.print(array[i] + "\t");
		}
		
		Pattern p = new Pattern();
		System.out.println("\n\nPattern programs");
		p.diamond(no);
		
		/*Prime prime = new Prime();
		System.out.println("\n\nPrime result");
		prime.primeNumber(8);*/
	}

}
