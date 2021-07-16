import java.util.Scanner;

class Pattern{
	
	public static void main(String a[]){
		
		System.out.println("Enter the size of matrix");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		Pattern pattern = new Pattern();
		
		pattern.leftEquilateralTriangle(row);
		pattern.rightEquilateralTriangle(row);
		pattern.downEquilateralTriangle(row);
		pattern.equilateralTriangle(row);
		pattern.fifthPattern(row);
		pattern.sixthPattern(row);
		pattern.seventhPattern(row);
		pattern.eighthPattern(row);
		pattern.ninthPattern(row);
		pattern.tenthPattern(row);
	}
	
	public void leftEquilateralTriangle(int row){
		System.out.println("Left Equilateral triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){
				if(r>=c && r+c<=row+1)
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void rightEquilateralTriangle(int row){
		System.out.println("Right Equilateral triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){
				if((r+c>=row+1) && r<=c){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void downEquilateralTriangle(int row){
		System.out.println("Down Equilateral triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){
				if(r<=c && r+c<=row+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void equilateralTriangle(int row){
		System.out.println("Equilateral triangle");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){
				if(r>=c && r+c>=row+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void fifthPattern(int row){
		System.out.println("Fifth pattern");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){
				if((r+c<=row+1) || r<=c){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void sixthPattern(int row){
		System.out.println("Sixth pattern");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){
				if((r+c<=row+1) || r>=c){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void seventhPattern(int row){
		System.out.println("Seventh pattern");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){
				if((r+c>=row+1) || r>=c){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void eighthPattern(int row){
		System.out.println("Eighth pattern");
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){
				if(r<=c || (r+c>=row+1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void ninthPattern(int row){
		System.out.println("Ninth pattern");
		int temp=1;
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){
				if((r+c>=row+1) || r>=c){
					System.out.print(temp+"\t");
					temp++;
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	public void tenthPattern(int row){
		System.out.println("Tenth pattern");
		int temp=1;
		for(int r=1; r<=row; r++){
			for(int c=1; c<=row; c++){
				if((r+c<=row+1) || r>=c){
					System.out.print(temp+"\t");
					temp++;
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}


}