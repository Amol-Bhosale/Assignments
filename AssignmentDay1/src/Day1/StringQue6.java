//WAP to demonstrate how memory is allocated to string objects in memory heap and string constant pool.

package Day1;

public class StringQue6 {

	public static void main(String[] args) {
		String a = "AmolBhosale";
		String b = "AmolBhosale";

		System.out.println(a == b);   //string literals are created in the String pool area

		String c = new String("AmolBhosale");

		   
		System.out.println(b == c); //String objects are created in the Heap memory area.

		String d = c.intern();   //string object, method intern() creates an exact copy of a String object in the heap memory and stores it in the String constant pool.
		System.out.println(b == d); 
		
	}

}
