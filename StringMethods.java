class StringMethods{
	
	public static void main(String a[]){
		
		StringMethods sm = new StringMethods();
		System.out.println("Count of specific character");
		sm.countSpecificCharacter();
		System.out.println("Number of words in the statement");
		sm.countNumberOfWords();
		System.out.println("Replacing character"); 
		sm.replaceCharacter();
		System.out.println("Remove duplicates");
		sm.removeDuplicates();
		System.out.println("Reverse word");
		sm.reverseWord();
		System.out.println("Palindrome");
		sm.palindrome();
		System.out.println("Replace a word by given string");
		sm.replaceString();
		System.out.println("Split the string by given character");
		sm.splitTheString();
	}
	
		//count the specific character
		public void countSpecificCharacter(){
			String string = "Heyyy developer!..";
			char ch[] = string.toCharArray();
			char c = 'y';
			int count = 0;
			for(int i=0; i<ch.length; i++){
				if(ch[i] == c)
					count++;
			}
			System.out.println(count);
		}
		
		//count the number of words
		public void countNumberOfWords(){
			String string = "Hello developers!! good morning, welcome to xworkz";
			char ch[] = string.toCharArray();
			char c = ' ';
			int count=1;
			for(int i=0; i<ch.length; i++){
				if(ch[i] == c)
					count++;
			}
			System.out.println(count);
		}
		
		//replace character
		public void replaceCharacter(){
			String string = "Hello developers!! good morning, welcome to xworkz";
			char ch[] = string.toCharArray();
			char c1 = 'e';
			char c2 = '8';
			for(int i=0; i<ch.length; i++){
				if(ch[i] == c1){
					ch[i] = c2;
				}
				System.out.print(ch[i]);
			}
			System.out.println();
		}
		
		//remove duplicates character from words
		public void removeDuplicates(){
			String string = "Hello developers!! good morning, welcome to xworkz";
			for(int i=0; i<string.length(); i++){
				char ch = string.charAt(i);
				int index = string.indexOf(ch, i+1);
				if(index == -1)
					System.out.print(ch);
			}
			System.out.println();
		}
		
		//reverse the word 
		public void reverseWord(){
			String string = "Morning";
			char ch[] = string.toCharArray();
			String reverse = "";
			for(int i=ch.length-1; i>=0; i--){
				reverse += ch[i];
			}
			System.out.println(reverse);
		}
		
		//String palindrome
		public void palindrome(){
			String string = "MADAM";
			String temp = string;
			int reverse = 0, rem;
			while(temp != 0){
				rem = temp % 10;
				reverse = reverse * 10 + rem;
				temp = temp / 10;
			}
			
		}
		
		//replace the string by given word
		public void replaceString(){
			
		}
		
		//split the string by given character
		public void splitTheString(){
			
		}
	

}