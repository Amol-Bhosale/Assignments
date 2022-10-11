// WAP to store elements in List and remove all duplicates names of items. After 
//duplicates are removed print all elements in descending order.

package CollectionAssignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class Question4 {
	
public static void main(String[] args) {
		
		
		// creating list
				ArrayList<String> list=new ArrayList<String>();
				
				// adding elements to it(32 and 99 repeated)
				list.add("aaa");
				list.add("bb");
				list.add("c");
				list.add("dd");
				list.add("c");
				list.add("aa");
				list.add("bb");
				list.add("AAA");
				list.add("bb");
//				list.add("amol");
//				list.add("Amol");
//				list.add("AMOL");
				
				System.out.println("List : "+list);
				HashSet<String> set=new HashSet<String>();
				set.addAll(list);
				System.out.println("Set : "+set);
				
				// getting size of collection
				int collectionSize=set.size();
						
				// creating array
				String[] array=new String[collectionSize];
				int index=0;
						
				// adding elements to an array
				for(String element : set) 
				{
					array[index]=element;
					index++;
				}
				
				
				Arrays.sort(array);
				System.out.println("In Ascending order after removing duplicates : "+ Arrays.toString(array));
				// Reversing the array
				for(int i=0;i<array.length/2;i++) 
				{
					String buffer=array[i];
					array[i]=array[array.length-i-1];
					array[array.length-i-1]=buffer;
				}
				System.out.println("In Descending order after removing duplicates : "+ Arrays.toString(array));
	}

}

