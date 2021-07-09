class NumberPattern{
	
	public static void main(String a[]){
		
		NumberPattern np = new NumberPattern();
		int rc = Integer.parseInt(a[0]);
		np.firstPattern(rc);
		np.secondPattern(rc);
		np.thirdPattern(rc);
	}
	
	public void firstPattern(int rc){
		
		for(int r=1; r<=rc; r++){
			for(int c=1; c<=r; c++){
				System.out.print(r+" ");
			}
			System.out.println();
		}
	}
	
	public void secondPattern(int rc){
		System.out.println();
		for(int r=rc; r>=1; r--){
			for(int c=1; c<=r; c++){
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
	
	public void thirdPattern(int rc){
		System.out.println();
		for(int r=1; r<=(rc*2-1); r++){
			for(int c=1; c<=rc; c++){
				if(c==r || c==rc-r+1)
					System.out.print(c+" ");
			System.out.print(" ");
			}
		System.out.println();	
		}
	}

}