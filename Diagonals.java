import java.util.Scanner;
class Diagonals{
	
	public static void main(String a[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of row");
	byte row = sc.nextByte();
		
	Diagonals diagonals = new Diagonals();
	diagonals.numericDiagonals(row);
	
	}
	
	void numericDiagonals(byte row){
		System.out.println("Numeric Diagonals");
		byte primary = 1;
		byte secondary = row;
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){  
			if(r==c){
				if( r<=(row/2)){
					System.out.print(primary +"\t");
					primary++;
				}else{
					System.out.print(primary +"\t");
					primary--;
				}
			}else if(r+c==row+1){
				if(r<=row/2){
					System.out.print(secondary +"\t");
					secondary--;
				}else{
					System.out.print(secondary +"\t");
					secondary++;
				}
			}else{
				System.out.print("\t");
			}
		}
		System.out.println();
		}
	}

}