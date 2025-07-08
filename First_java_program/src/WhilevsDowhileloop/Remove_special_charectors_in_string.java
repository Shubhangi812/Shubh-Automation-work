package WhilevsDowhileloop;

import java.util.Arrays;
//Example 2 // Remove special charectors & spaces from string 
public class Remove_special_charectors_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "madamala";
//		
//        System.out.println("replaces Sring: " + s.replace("$","").replace("%","").replace("#","").replaceAll(" ", ""));
//	}
		
		
		
//Example 3 // Count occurances of the char in string
//	   
//	    int count[]= new int [256];
//	    
//	 // Count each character
//	    for(int i=0 ; i<s.length() ;i++)
//	    {
//	    	char ch= s.charAt(i);
//	    	count[ch]++;
//	    	System.out.println(ch);
//	    }
//	    System.out.println("Character counts:");   
//	 // Print character counts
//	    
//        for (int i = 0; i < 256; i++) 
//        {
//            if (count[i] > 0) 
//            {
//             System.out.println((char)i + " : " + count[i]);
//            }
//        }
//    }
//}


 //Example 4 // count word in the string

        String p = "Welcome to automation program";
        String m[] = p.split(" ");
        //devide String word 
        System.out.println(Arrays.toString(m));
        
        //Print count using m.length 
        System.out.println("String word count is : "+ p + " --> " + m.length);
        
      
        
        
	}    
}
	
	