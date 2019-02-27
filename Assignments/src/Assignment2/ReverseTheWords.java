package Assignment2;

public class ReverseTheWords {
	
		public static void main(String[] args) 
		{ 
			String s = "Welcome To Omniwyse Technologies";
			String[] split = s.split(" ");
			String result = "";
			for (int i = split.length - 1; i >= 0; i--) {
			  result = result+(split[i] + " ");
			}
			System.out.println(result.trim());
		} 

}
