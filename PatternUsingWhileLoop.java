import java.util.Scanner;

class PatternUsingWhileLoop{
	
	public static void main(String a[]){
		
		System.out.println("Enter the size of matrix");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		PatternUsingWhileLoop pattern = new PatternUsingWhileLoop();
		
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
		int r=1;
		while(r<=row){
			int c=1;
			while(c<=row){
				if(r>=c && r+c<=row+1){
						System.out.print("*");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void rightEquilateralTriangle(int row){
		System.out.println("Right Equilateral triangle");
		int r=1;
		while(r<=row){
			int c=1;
			while(c<=row){
				if((r+c)>=(row+1) && r<=c){
					System.out.print("*");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void downEquilateralTriangle(int row){
		System.out.println("Down Equilateral triangle");
		int r=1;
		while(r<=row){
			int c=1; 
			while(c<=row){
				if(r<=c && r+c<=row+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void equilateralTriangle(int row){
		System.out.println("Equilateral triangle");
		int r=1; 
		while(r<=row){
			int c=1; 
			while(c<=row){
				if(r>=c && r+c>=row+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void fifthPattern(int row){
		System.out.println("Fifth pattern");
		int r=1; 
		while(r<=row){
		int c=1; 
		while(c<=row){
				if((r+c<=row+1) || r<=c){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void sixthPattern(int row){
		System.out.println("Sixth pattern");
		int r=1; 
		while(r<=row){
			int c=1; 
			while(c<=row){
				if((r+c<=row+1) || r>=c){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void seventhPattern(int row){
		System.out.println("Seventh pattern");
		int r=1; 
		while(r<=row){
			int c=1; 
			while(c<=row){
				if((r+c>=row+1) || r>=c){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void eighthPattern(int row){
		System.out.println("Eighth pattern");
		int r=1; 
		while(r<=row){
			int c=1; 
			while(c<=row){
				if(r<=c || (r+c>=row+1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void ninthPattern(int row){
		System.out.println("Ninth pattern");
		int temp=1;
		int r=1; 
		while(r<=row){
			int c=1; 
			while(c<=row){
				if((r+c>=row+1) || r>=c){
					System.out.print(temp+"\t");
					temp++;
				}else{
					System.out.print("\t");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void tenthPattern(int row){
		System.out.println("Tenth pattern");
		int temp=1;
		int r=1; 
		while(r<=row){
			int c=1; 
			while(c<=row){
				if((r+c<=row+1) || r>=c){
					System.out.print(temp+"\t");
					temp++;
				}else{
					System.out.print("\t");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}


}