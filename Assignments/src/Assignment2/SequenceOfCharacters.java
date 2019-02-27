package Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SequenceOfCharacters {


         public static void main(String args[]) throws IOException {
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter the string:");
             String tmp = br.readLine();
             int strLen = tmp.length();
             char c[] = new char[strLen];
             for (int i = 0; i < c.length; i++) {
                 c[i] = tmp.charAt(i);
             }
             System.out.println("Displaying character Array");
             for (int i = 0; i < c.length; i++) {
                 System.out.println(c[i]);
             }
     }
	
	
}
