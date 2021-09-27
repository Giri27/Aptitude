package com.xworkz.aptitudetest;

public class Sort {
	
	public short sorting(short array[]) {
		
		
		for(int j=0; j < array.length-1; j++){
			for(int i=0; i< array.length-1; i++){
				if(array[i] > array[i+1]){
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = (short) temp;
				}
			}
		}
		return 0;
	}

}
