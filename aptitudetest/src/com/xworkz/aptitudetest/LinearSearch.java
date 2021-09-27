package com.xworkz.aptitudetest;

public class LinearSearch {
	
	public int linearSearch(short array[], int no) {
				
		boolean noFound = false;
		for(int i=0; i < array.length; i++) {
			if(array[i] == no) {
				
				noFound = true;
				System.out.println("Number found in the index position:" + i);
				break;
			}
		}
		if(noFound != true) {
			System.out.println("Number not found");
		}
		
		return 0;
	}
}
