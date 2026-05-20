package Strings;

public class Palindrome_special {
	
	public static void main(String[] args) {
		
		
//		Coding Question
//		Palindrome String (Ignoring Special Characters)
//		 After converting uppercase letters to lowercase and removing all non-alphanumeric characters, check whether the string is a palindrome.
//		Input:
//		 s = "A man, a plan, a canal: Panama"
//		Processed String:
//		 amanaplanacanalpanama
//		Output:
//		 true
		
		
		
		String s = "A man, a plan, a canal: Panama";	
		s=s.toLowerCase();
		// 2. Remove non-alphanumeric characters
		s = s.replaceAll("[^a-z0-9]", "");
		
		String reversed= new StringBuilder(s).reverse().toString();
		
		System.out.println(s.equals(reversed));
		
	}
	
	
	

}
