//WAP to sort array on the basis of unit place. For example we are having following numbers:- 10,2,3,41,12,13,19,81,9. 
  //Output will be 10,41,81,2,12,3,13,19,9.

package Day1;

import java.util.Arrays;

public class ArrayQue10 {
	public void sortArray(int arr[])
	{
		int temp=0;
		int brr[]=new int[arr.length];
		for(int i=0;i<=9;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]%10==i)
				{
					brr[temp]=arr[j];
					temp++;
				}
			}
		}
		System.out.print("\nUnite place Array:");
		for(int i:brr)
		{
			System.out.print(" "+i);
		}
		
		
		
	}
	public static void main(String[] args) {
		ArrayQue10 program=new ArrayQue10();
		int arr[]={1,6,28,21,11,55,32,2,67,3,99,8};	
		System.out.print("Orignal Array:");
		//Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(" "+i);
		}
		program.sortArray(arr);
		
	}

}
