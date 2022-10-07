//An Array Contain different numbers you have to find how many are even, odd, perfect and prime 

package Day1;

public class ArrayQue4 {

	
		public void primeNum(int arr[])
		{
			int countPrime=0;
			for(int i=0;i<arr.length;i++)
			{
				int num=arr[i];
				boolean flag=true;
				if(num==1)
					flag=false;
				for(int j=2;j<num/2;j++)
				{
					if(num%j==0)
					{
						flag=false;
						break;
					}
				}
				if(flag)
				{
					countPrime++;
				}
			}
			System.out.println("Prime="+countPrime);
		}
		public void evenNum(int arr[])
		{
			int countEven=0,countOdd=0;
			for(int i=0;i<arr.length;i++)
			{
				int num=arr[i];
				if(num%2==0)
				{
					countEven++;
				}
				else
				{
					countOdd++;
				}
			}
			System.out.println("Even="+countEven);
			System.out.println("odd numbers=" +countOdd);
		}
		public void perfectNum(int arr[])
		{
			int countPerfect=0;
			int sumPerfect=0;
			for(int i=0;i<arr.length;i++)
			{
				int num=arr[i];
				sumPerfect=0;
				for(int j=1;j<=num/2;j++)
				{
					if(num%j==0)
					{
						sumPerfect=sumPerfect+j;
					}
				}
				
				if(sumPerfect==num)
				{
					countPerfect++;
				}
			}
			System.out.println("Perfect="+countPerfect);
		}
		public static void main(String[] args) {
			ArrayQue4 program=new ArrayQue4();
			int arr[]={1,6,28,21,11};
			program.evenNum(arr);
			program.perfectNum(arr);
			program.primeNum(arr);
			
		}
	}

	


