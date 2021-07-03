class Matrix{
	
	public static void main(String a[]){
		Matrix matrix = new Matrix();
		matrix.printMatrix();
		matrix.printMatrixPlus();
		matrix.printMatrixUptoThree();
		matrix.printMatrixGreaterThanThree();
		
	}
	
	void printMatrix(){
		
		System.out.println("Matrix box");
		for(int r=1; r<=5; r++){
			for(int c=1; c<=5; c++){
				
				if(r==1 || c==1 || r==5 || c==5){
					System.out.print(r+""+c+"\t");
				}else{
						System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	void printMatrixPlus(){
		
		System.out.println("Matrix plus");
		for(int r=1; r<=5; r++){
			for(int c=1; c<=5; c++){
				if(r==3 || c==3 ){
					System.out.print(r+""+c+"\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	void printMatrixUptoThree(){
		
		System.out.println("Matrix upto three rows three columns whose r & c==3");
		for(int r=1; r<=3; r++){
			for(int c=1; c<=3; c++){
				if(r==3 && c==3){
					System.out.print(r+""+c+"\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
	}
	
	void printMatrixGreaterThanThree(){
		
		System.out.println("Matrix greater than three rows three columns whose r & c equals to 3,4,5");
		for(int r=1; r<=5; r++){
			for(int c=1; c<=5; c++){
				if(r>=3 && c>=3){
					System.out.print(r+""+c+"\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
	}

}
