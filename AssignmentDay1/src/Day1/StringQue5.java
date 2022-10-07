//WAP to demonstrate which is fast in processing StringBuilder or StringBuffer

package Day1;

public class StringQue5 {
	
	 
	long startTime = 01;
    long endTime = 01;
    long timeDiff = 01;
    
    
 // Concatenates to StringBuffer
  public void concat1(StringBuffer website) 
    { 
        startTime = System.nanoTime();
        website.append(".com");
        endTime = System.nanoTime();
        timeDiff = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + timeDiff);
    } 
  
  
    // Concatenates to StringBuilder 
    public void concat2(StringBuilder website) 
    {  
        startTime = System.nanoTime();
        website.append(".com"); 
        endTime = System.nanoTime();
        timeDiff = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + timeDiff);
    } 
 
   
    
 
    public static void main(String[] args) 
    { 
    	StringQue5 object = new StringQue5();
       
        StringBuffer s1 = new StringBuffer("Amol"); 
        object.concat1(s1);
 
        StringBuilder s2 = new StringBuilder("Amol"); 
        object.concat2(s2);
 
         
    } 
	}


