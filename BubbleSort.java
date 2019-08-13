public class BubbleSort {
	
	public static int[] sortArray(int [] input) {
		
		int swapped=0,temp=0;
		
		for(int i=0; i<input.length; i++) {
			
			if(i+1>=input.length) {
				// prevent the loop to cross Upper Boundary[Array IndexOutofBound] 
				i=0;
				swapped++;
			}			
			
			if(input[i]>input[i+1]) { // Check to swap the adjacent variables
				temp=input[i];
				input[i]=input[i+1];
				input[i+1]=temp;
			}
			if(swapped>(input.length-1)) {
				break;
			}
		}
		
		return input;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3, 6, 1, 2, 9, 8, 1, 8};
		
		int [] result = BubbleSort.sortArray(arr);
		
		for (int i : result) {
			System.out.print(i+"\t");
		}
	}

}
