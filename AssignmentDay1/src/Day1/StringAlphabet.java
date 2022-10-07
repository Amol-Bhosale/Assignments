package Day1;

import java.util.Arrays;

public class StringAlphabet {

	public static void main(String[] args) {
		
		String name= "Amolbzc";
		String rev="";
		
		char[] charArray= name.toCharArray();
		System.out.println(charArray );
		Arrays.sort(charArray);
		System.out.println(charArray);
		int len=charArray.length;
		
		for(int i= len-1;i>=0;i--) {
			
			rev=rev+charArray[i];
		}
		System.out.println(rev);
		
		
		
		

	}

}
