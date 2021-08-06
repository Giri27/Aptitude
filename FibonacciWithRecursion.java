class FibonacciWithRecursion{

	public static void main(String a[]){
		
		printFibonacci(10, 0, 1);
	}
	
	static void printFibonacci(int limit, int a, int b){
		
		int sum = a+b;
		if(limit > sum){
			System.out.println(a +"\t");
			a = b;
			b = sum;
			printFibonacci(limit, a, b);
		}else
			System.out.println(a + "\t" + b);
	}
}