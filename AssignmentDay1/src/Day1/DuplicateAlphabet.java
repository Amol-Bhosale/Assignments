//WAP to print the number of alphabets repeated in the given string.
package Day1;

public class DuplicateAlphabet {

	public static void main(String[] args) {
		
		String name="Amol Sadashiv Bhosale";
		
		int count=0;
		int length= name.length();
		
		char[] ch=name.toCharArray();
		
		for(int i=0;i<length;i++) {
			
			for(int j=i+1;j<length;j++) {
				if (ch[i]==ch[j]) {
					System.out.println("Duplicate alphabet:   " +ch[j]);
					//System.out.println(j);
					count++;
				}
				
			}
			
		}
		System.out.println("No. of duplicate alphabets Occurences: " +count);
	}

}
