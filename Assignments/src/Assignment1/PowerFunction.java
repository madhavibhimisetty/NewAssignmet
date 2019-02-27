// Time Complexity : O(log n)


package Assignment1;

import java.util.Scanner;

public class PowerFunction {
	static int power(int x, int y) 
		    { 
		        if (y == 0) 
		            return 1; 
		        if(y==1)
		        	return x;
		        else if (y % 2 == 0) 
		            return power(x, y / 2) * power(x, y / 2); 
		        else
		            return x * power(x, y / 2) * power(x, y / 2); 
		    } 
		  
		   public static void main(String[] args) 
		    { 
		    	Scanner n = new Scanner(System.in);
				System.out.println("Enter first number :: ");
				int x=n.nextInt();
				Scanner a = new Scanner(System.in);
				System.out.println("Enter second number :: ");
				int y=a.nextInt();
				System.out.printf("%d", x*power(x, y-1)); 
		    } 
}
