// Time Complexity :: O(n)

package Assignment1;

import java.util.Scanner;

public class SearchForNumber {

	public static void main(String[] args) {

        int n, x,m = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements  want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++){
        	a[i] = s.nextInt();
        }
        System.out.print("Enter the element you want to find:");
        x = s.nextInt();
        for(i = 0; i < n; i++){
        	if(a[i] == x){
        		m = 1;
        		break;
        	}  
        	else{
        		m = 0;
        		}}
            
        if(m == 1) {
        	System.out.println("Element found at position:"+(i + 1));
        	}
        else {
        	System.out.println("Element not found");
        }
}
}
