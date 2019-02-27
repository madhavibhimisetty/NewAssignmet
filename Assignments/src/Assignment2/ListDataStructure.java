package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class ListDataStructure {
	ArrayList<Integer> arr= new ArrayList<Integer>();    
	HashMap<Integer, Integer>  hash= new HashMap<Integer, Integer>();
		void add(int x) 
	   { 
			if (hash.get(x) != null) 
		          return;  
			int s = arr.size(); 
		      arr.add(x);
		      hash.put(x, s);
		     
	   }
		void remove(int x) {
		 
	       Integer index = hash.get(x); 
	       if (index == null) 
	          return; 
	       hash.remove(x); 
	       int size = arr.size(); 
	       Integer last = arr.get(size-1); 
	       Collections.swap(arr, index,  size-1); 
	       arr.remove(size-1);
	       hash.put(last, index);  }
	    int search(int x) 
		    { 
		    if(hash.get(x) != null) {
		       return hash.get(x); 
		    }
		    else
				return -1;
		    } 
		void size() {
			int size=hash.size();
			System.out.println("size of the list ::"+size);
			
		}
		void isempty() {
			System.out.println("list is empty or not::"+hash.isEmpty());
		}
		void display() {
		for(int i=0;i<hash.size();i++){
		    System.out.println(arr.get(i));
		} 
		}
		 

		public static void main (String[] args) 
		    { 
		    	ListDataStructure ds = new ListDataStructure(); 
		        ds.add(10); 
		        ds.add(20); 
		        ds.add(30); 
		        ds.add(40); 
		        ds.add(60);
		        System.out.println(ds.search(50)); 
		        ds.remove(30); 
		        ds.size();
		        ds.isempty();
		        ds.display();
		    }      
	  
	      
	       
	    
	  
	   
	   
}

