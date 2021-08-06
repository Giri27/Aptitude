class MethodsOfStringClass{
	
	public static void main(String a[]){
		
		String str = "Girija";
		System.out.println(str);
		System.out.println(str.toUpperCase());   //toUpperCase()
		System.out.println(str.toLowerCase());   //toLowerCase()
		System.out.println(str.startsWith("G"));    //returns boolean value
		System.out.println(str.startsWith("A"));
		System.out.println(str.endsWith("a"));
		System.out.println(str.endsWith("i"));
		System.out.println(str.charAt(2));    //charAt() returns specific index value
		System.out.println(str.length());   //return length of the string
		//intern()
		
		int x = 10;
		String z = String.valueOf(x);
		System.out.println(z + 10);  //valueOf() 
		
		String string = "good morning";
		String rString = string.replace("morning","evening");   //replace()
		System.out.println(rString);
		
		String s = " Good Morning ";
		System.out.println(s);
		System.out.println(s.trim());     //trim()
		
		//StringBuffer
		StringBuffer str1 = new StringBuffer("heyy!..");
		str1.append("wassup");         //append()
		System.out.println(str1);
		
		str1.insert(7, "bro ");
		System.out.println(str1);//insert()
		
		str1.replace(1,9, "hello");    //replace()
		System.out.println(str1);
		
		str1.delete(1,3);   //delete()
		System.out.println(str1);
		
		str1.reverse();    //reverse()
		System.out.println(str1);
		
		//capacity()
		//ensureCapacity()
		
		
		
	}

}