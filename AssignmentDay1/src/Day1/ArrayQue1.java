
//WAP to find third maximum number from list of numbers.

package Day1;

import java.util.Arrays;
import java.util.Collections;

public class ArrayQue1 {

	public static void main(String[] args) {
		
		int[] arr= {11,23,2,56,32,78};
		int max=0;
		int second=0;
		int third=0;
		
		for(int i:arr) {
			
			if(max<i) {
				third=second;
				second=max;
				max=i;
			} else if(second<i) {
				third= second;
				second = i;
				
			} else if (third<i) {
				
				third=i;
				
			}
			
		}
		
		System.out.println(third);
		System.out.println(max);
		System.out.println(second);
		

	}

}
