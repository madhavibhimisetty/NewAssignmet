package Assignment6;

import java.util.Scanner;

public class StirngLibrary {
	public static void findInStr(String s1, char c){
			int count=0;
			for (int i = 0; i < s1.length(); i++) {
			    if (s1.charAt(i) == c) {
			    	System.out.println("Character found at index ::"+i);
			    	count+=1;}
			}
			if(count==0){
			System.out.println("Character not found in a string");}
		}
		public static void main(String args[]) {
		int i = 0;
		System.out.println("Enter the String::");
		Scanner s=new Scanner(System.in);
		String str = s.next();
		System.out.println("Enter the character you want to search::");
		Scanner s1=new Scanner(System.in);
		char c = s1.next().charAt(0);
		findInStr(str,c);
		System.out.println("\n\n");
		System.out.println("Enter the String1 for comparision::");
		Scanner s2=new Scanner(System.in);
		String str1 = s2.next();
		System.out.println("Enter the String2 for comparison::");
		Scanner s3=new Scanner(System.in);
		String str2 = s3.next();
		if(str1.equals(str2)) 
			System.out.println("strings are equal");
		else
			System.out.println("strings are not equal");
		System.out.println("\n\n");
		String str3 = String.valueOf(str);
		String str4 = String.valueOf(str.toCharArray(), 0, str.length()); 
		System.out.println("copied string::"+str4);
		String word = "I am the employee of omniwyse.Recently i have joined in omniwyse";

	    int findit = word.indexOf("omniwyse");
	    int count = 0;

	    for(int i1=0; i1<=findit; i1++)
	    {
	    	findit = word.indexOf("omniwyse" , findit + 1);

	        count = count + 1;
	    }
	    System.out.print("How many time sting1 occured in string2::"+count);
}
}