//Suppose that you are having an array of size N. 
//now your task is to sort the half array that is from 0 to N/2 in ascending order 
//and N/2+1 to N in descending order. 

package Day1;

public class ArrayQue5 {
	public void sortArray(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length/2;j++)
			{
				if(arr[j]<arr[i])
                {
                	temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
			}
			if(i>=arr.length/2)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]>arr[i])
	                {
	                	temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
				}
			}
		}
        for(int k:arr)
        	System.out.print(k+" ");
	}
	public static void main(String[] args) {
		ArrayQue5 program=new ArrayQue5();
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		program.sortArray(arr);
		
	}

}
