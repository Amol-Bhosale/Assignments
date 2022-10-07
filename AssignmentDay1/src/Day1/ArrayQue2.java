
//WAP to find duplicate numbers and there counting from list of numbers.


package Day1;

public class ArrayQue2 {

	public static void main(String[] args) {
		
		
		int[] arr= {12,34,23,12,56,23};
		int count=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			
			
			if(arr[i]== arr[j]) {
				//System.out.println(arr[j]);
				count++;
				
				
				System.out.println(count+")"+arr[j]);
				
			}
			
			}
		}

	}

}
