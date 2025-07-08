package WhileLoop;

import java.util.Arrays;

public class Reverse_strig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "madam";
		  String rev="";
		  
//		  //1st method     //used by length() & charAt() method
//		for(int i=s.length()-1; i>=0 ; i--)                             //this s.length()-1 will give last index of string madam 
//		{
//			rev = rev+s.charAt(i);                                         //give last char of i is m 
//			System.out.println(rev);
//			
//			if (s.equals(rev))
//			{
//				System.out.println("String is palindrome " );
//			}
//			else
//			{
//				System.out.println("String is not palindrome ");
//			}
//			
//		}
//		 
		
		
		//2ed method     by converting string to charectar array 
		
		  char a[]=s.toCharArray();                                 //this will convert char type of array 
		  System.out.println(Arrays.toString(a));                   //[m, a, d, a, m]
        
		  for(int i = a.length-1;i>=0;i--)                                //find the length of array [m, a, d, a, m]=4   reduce till 0  reduce
		  {  
			  rev= rev+a[i]; 
		  }
			  if (s.equals(rev)) 
			  {
				  
				  System.out.println("String is palindrome:"); 
			  }
			  else 
			  {
				  System.out.println("String is not palindrome:");
			  }
   }
}
//
//	      //3ed method by using String buffer class        // Here we can use direct reverse methoed using create stringbuffer veriable 
	
//	        StringBuffer p= new StringBuffer ("Welcome");
//	        {
//	        	System.out.println(p.reverse());
//	        }
//
//	}
          //4th method by using StringBuilder class        // Here we can use direct reverse methoed using create stringBuider veriable 

//         StringBuilder m = new StringBuilder ("Come");
//         System.out.println(m.reverse());
