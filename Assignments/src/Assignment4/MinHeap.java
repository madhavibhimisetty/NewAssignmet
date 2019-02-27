package Assignment4;

public class MinHeap { 
	private int[] heap;
	private int size;
	private int maxSize;
	private static final int FRONT = 1;

	public MinHeap(int maxSize){
	    this.heap = new int[maxSize+1];
	    heap[0] = Integer.MIN_VALUE;
	    this.size = 0;
	}

	private int getParent(int position){
	    return position/2;
	}

	private int getLeftChild(int position){
	    return 2*position;
	}

	private int getRightChild(int position){
	    return 2*position+1;
	}
	private boolean isLeaf(int position){
	    return (position > size/2);
	} 
	private void swap(int position1, int position2){
	    int temp = heap[position1];
	    heap[position1] = heap[position2];
	    heap[position2] = temp;
	} 
	private void heapify(int position){
	    while (!isLeaf(position)){
	        int left  = getLeftChild(position);
	        int right = getRightChild(position);
	        if (heap[position] > heap[left] || heap[position] > heap[right]){
	            if (heap[left] < heap[right]){
	                swap(position, left);
	                position = left;
	            } else {
	                swap(position, right);
	                position = right;
	            }
	        } else
	            break;
	    }
	}
	public void insert(int data){
	    heap[++size] = data;
	    int currentItem = size;
	    while( heap[getParent(currentItem)] > heap[currentItem] ){
	        swap(getParent(currentItem),currentItem);
	        currentItem = getParent(currentItem);
	    }
	}
	public String toString(){
	    StringBuilder output = new StringBuilder();
	    for(int i=1; i<= size/2; i++){
	        output.append("Parent :"+ heap[i]);
	        output.append("LeftChild : "+heap[getLeftChild(i)] +" RightChild :"+ heap[getRightChild(i)]).append("\n");
	    }
	    return output.toString();
	}
	 public void minHeap() 
	    { 
	        for (int pos = (size / 2); pos >= 1; pos--) { 
	            heapify(pos); 
	        } 
	    } 
	 public int delete(){
		    int itemPopped = heap[FRONT];
		    heap[FRONT] = heap[size--];
		    heapify(FRONT);
		    return itemPopped;
		}
	 public void print() 
	    { 
	        for (int i = 1; i <= size / 2; i++) { 
	            System.out.print(" PARENT : " + heap[i] 
	                     + " LEFT CHILD : " + heap[2 * i] 
	                   + " RIGHT CHILD :" + heap[2 * i + 1]); 
	            System.out.println(); 
	        } 
	    } 
    public static void main(String[] arg) 
    { 
        System.out.println("The Min Heap is "); 
        MinHeap minHeap = new MinHeap(15); 
        minHeap.insert(5); 
        minHeap.insert(3); 
        minHeap.insert(17); 
        minHeap.insert(10); 
        minHeap.insert(84); 
        minHeap.insert(19); 
        minHeap.insert(6);  
        minHeap.insert(22); 
        minHeap.insert(9); 
        minHeap.minHeap();  

        minHeap.print(); 
        System.out.println("The Min val is " + minHeap.delete()); 
    } 
} 