class Star{
	
	public static void main(String a[]){
		
		Star star = new Star();
		int rc = Integer.parseInt(a[0]);
		star.firstPattern(rc);
		star.secondPattern(rc);
		star.thirdPattern(rc);
		star.fourthPattern(rc);
		star.fifthPattern(rc);
		star.sixthPattern(rc);
		star.seventhPattern(rc);
		star.ninthPattern(rc);
		star.tenthPattern(rc);
	}	

	public void firstPattern(int rc){
		
		for(int r=1; r<=rc; r++){
			for(int c=1; c<=r; c++){
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void secondPattern(int rc){
		
		for(int r=1; r<=rc; r++){
			for(int c=1; c<r; c++){
				System.out.print(" ");
			}
			for(int k=rc; k>=r; k--){
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void thirdPattern(int rc){
		
		for(int r=1; r<=rc; r++){
			for(int c=1; c<=r; c++){
				if((c==1) || (c==r) || (r==rc)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void fourthPattern(int rc){
		
		for(int r=1; r<=rc; r++){
			for(int c=1; c<r; c++){
				System.out.print(" ");
			}
			for(int k=rc; k>=r; k--){
				if( (r==1) || (k==r) || (k==rc)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void fifthPattern(int rc){
		
		for(int r=1; r<=rc; r++){
			for(int c=rc; c>=r; c--){
				if((r==1) || (c==r) || (c==rc))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int k=1; k<r; k++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void sixthPattern(int rc){
		
		for(int r=1; r<=rc; r++){
			for(int c=rc; c>r; c--){
				System.out.print(" ");
			}
			for(int k=1; k<=r; k++){
				if((k==1) || (k==r) || (r==rc)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void seventhPattern(int rc){
		
		for(int r=1; r<=rc; r++){
			for(int k=rc; k>=r; k--){
				System.out.print("*");
			}
			for(int c=1; c<r; c++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void eighthPattern(int rc){
		
		for(int r=1; r<=rc; r++){
			for(int c=r; c>r; c--){
				System.out.print(" ");
			}
			for(int k=1; k<=r; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void ninthPattern(int rc){
		
		for(int r=1; r<=(rc*2-1); r++){
			for(int c=1; c<=rc; c++){
				if((c==r) || (c==rc-r+1))
					System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void tenthPattern(int rc){
		
		for(int r=1; r<=rc; r++){
			for(int c=rc; c>r; c--){
				System.out.print(" ");
			}
			for(int k=1; k<=(r*2)-1; k++){
				if(k==1 || k==(r*2)-1 || r==rc)
					System.out.print("*");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
}