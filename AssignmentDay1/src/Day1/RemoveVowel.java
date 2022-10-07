//WAP to remove all the vowels from the given string.

package Day1;

import java.util.Scanner;

public class RemoveVowel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String name = sc.nextLine();
		System.out.println(name);
		
		// method1//
		
		//String new1= name.replaceAll("[AEIOUaeiou]", "");
		//System.out.println(new1);
		
		
		//Method 2//
		String newname="";
		String name1= name.toUpperCase();
		
		for(int i=0;i<name1.length();i++) {
			char ch =name1.charAt(i);
			
			if(ch=='A'|| ch=='E'|| ch=='I' || ch=='O' || ch=='U') 
				continue;
				newname = newname+ch;
			
		}
		System.out.println(newname);
		
		

	}

}
