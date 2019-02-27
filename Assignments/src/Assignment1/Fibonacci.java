// Time Complexity :: O(n)

package Assignment1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number :: ");
		int length=a.nextInt();
			System.out.println("FibonacciSeries Iterative...");
			  fibonacciSeriesIterative(length);
			   
			  System.out.println("\nFibonacciSeries Recursive...");
			  fibonacciSeriesRecurisve(-1, 1, length);
			 }
			 
			 public static void fibonacciSeriesIterative(int length){
			  int a = -1;
			  int b =  1;
			   
			  int c = 0;
			  for (int i = 0; i < length; i++) {
			   c = a+b; 
			   System.out.print(c + ", ");
			   a = b;
			   b = c;
			  }
			 }
			  
			 public static void fibonacciSeriesRecurisve(int a, int b, int length){
			  if(length == 0){
			   return;
			  }
			   
			  int c = a+b;
			  System.out.print(c + ", ");
			  fibonacciSeriesRecurisve(b, c, length-1);
			 }
			
	}


