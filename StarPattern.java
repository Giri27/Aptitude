import java.util.Scanner;
class StarPattern{
	
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row");
		byte row = sc.nextByte();
		
		StarPatternByNikunj sp = new StarPatternByNikunj();
		sp.leftAngle(row);
		sp.reverseRightAngle(row);
		sp.borderedLeftAngle(row);
		sp.borderedReverseRightAngle(row);
		sp.borderedReverseLeftAngle(row);
		sp.borderedRightAngle(row);
		sp.reverseLeftAngle(row);
		sp.rightAngle(row);
		sp.pyramid(row);
		sp.diagonals(row);
		sp.numericLeftAngle(row);
		sp.numericReverseLeftAngle(row);
		sp.numericDiagonals(row);
		
	}
	
	void leftAngle(byte row){
		System.out.println("Left angled triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; r>=c; c++){         
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
	
	void reverseRightAngle(byte row){
		System.out.println("Reverse right angled triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){  
			if(r<=c)
				System.out.print("*\t");
			else
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	void borderedLeftAngle(byte row){
		System.out.println("Bordered left angled triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){  
			if(c==1 || r==c || r==row)
				System.out.print("*\t");
			else
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	void borderedReverseRightAngle(byte row){
		System.out.println("Bordered reverse right angled triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){  
			if(r==1 || r==c || c==row)
				System.out.print("*\t");
			else
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	void borderedReverseLeftAngle(byte row){
		System.out.println("Bordered reverse left angled triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){  
			if(c==1 || r==1 || (r+c==row+1))
				System.out.print("*\t");
			else
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	void borderedRightAngle(byte row){
		System.out.println("Bordered right angled triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){  
			if(c==row || r==row || (r+c==row+1))
				System.out.print("*\t");
			else
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	void reverseLeftAngle(byte row){
		System.out.println("Reverse left angled triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){  
			if(r+c<=row+1)
				System.out.print("*\t");
			else
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	void rightAngle(byte row){
		System.out.println("Right angled triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){  
			if(r+c>=row+1)
				System.out.print("*\t");
			else
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	void pyramid(byte row){
		System.out.println("Pyramid");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){ 
				if( r>=c && (r+c>=row+1))
					System.out.print("*\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	void diagonals(byte row){
		System.out.println("Diagonals");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){ 
				if( r==c || (r+c==row+1))
					System.out.print("*\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	void numericLeftAngle(byte row){
		System.out.println("Numeric left angled triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){ 
				if(r>=c)
				System.out.print(r+"\t");
			}
			System.out.println();
		}
	}
	
	void numericReverseLeftAngle(byte row){
		System.out.println("Numeric reverse left angled triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){ 
				if(r+c<=row+1)
				System.out.print(c+"\t");
			}
			System.out.println();
		}
	}
	
	void numericDiagonals(byte row){
		System.out.println("Numeric Diagonals");
		byte primary = 1;
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){  
			if(r==c){
				if( r<=(row/2)){
				System.out.print(primary +"\t");
				primary++;
			}else{
				System.out.print("\t");
			}
			}
			System.out.println();
		}
		}
	}

}
