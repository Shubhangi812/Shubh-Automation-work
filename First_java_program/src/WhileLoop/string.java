package WhileLoop;

import java.util.Arrays;

//string is predefine class which contains no of predefine methods .
//string is not premitive datatype .
//String is a collection of char


public class string {            

	public static void main(String[] args) {          
		// TODO Auto-generated method stub
     //String name = "rohit";                        //1st way
     String name  = new String ("Rohit") ;          //2st way
     
     
      System.out.println(name);
     
      
   //Methods of string 
   //length() -return length of string 
      
     // System.out.println(name.length());           // 1st way 
      int l = name.length();                         //2ed way
      System.out.println(l);       
      
   //Concat() - joinig two string 
      
      String surname = new String (" Roy");
      String fname = new String (" Smith");
      //System.out.println(name+surname);             // 1 way
      System.out.println(name.concat(surname));     //2ed way
      
      System.out.println(name.concat(fname).concat(surname));   
      
      System.out.println("Welcome ".concat("To Home ").concat("Rohit"));   //you can directly concat the stings 
      
   // Trim() -- Removes the spaces from right & left side 
      String s ="  Welcome  ";
      System.out.println("before trim: " +s);
      System.out.println("before trim length of string: " +s.length());
      String s1 = s.trim();
      System.out.println("after trim: " +s1);
      System.out.println("after trim length of string: " +s1.length());
      
      
  //charAt() --- returns the charectar from index 
  //check substring is apart of main string    
      
   // Index start from 0 
      System.out.println(s.charAt(5));   //c
      System.out.println(s.charAt(4));  //l
      
      
  //contains()---  returns true or false boolean 
      
      System.out.println(s.contains("wel"));    //false
      System.out.println(s.contains("come"));   //true 
  
  //equals()    equalsIgnoreCase()   -----       compare two strings     //returns true or false value 
      s1 ="good";
      String s2 = ("Good");
      System.out.println(s1.equals(s2));    //false 
      System.out.println(s1.equalsIgnoreCase(s2));         //true 
      
  //replace() ---  replace the character/sequence of character in the string .
      
     s1= "Welcome To home raj";
     
     System.out.println(s1.replace('h', 'H'));         //Welcome To Home raj
     System.out.println(s1.replace('r', 'R'));         //Welcome To home Raj
     System.out.println(s1.replace("home", "Office"));         //Welcome To Office raj
    		 
 //substring()    ----- extract substring from the main string 
     // Starting index   0 1 2 3 4 5 6 7 8 9  10
      //                 W e l c o m e   R a  j
    //  Ending index     1 2 3 4 5 6 7 8 9 10 11
     
     s= "welcome Raj";
     
     System.out.println(s.substring(2));     //lcome Raj
                                  //si ei
     System.out.println(s.substring(2, 10));  //lcome Ra
     
     System.out.println(s.subSequence(9,10));  //a
     
     
  //toUpperCase()  toLowerCase()  ----- convert string in to upper case or lower case
     
     System.out.println(s.toUpperCase()); //WELCOME RAJ
     
     System.out.println(s.toLowerCase()); //welcome raj
     
 //split() -----  divide string in to multiple part based on delimiters   @ , . & are delimiters
    // Ex.1 
     s = "pink@mail.com";
   //here if you want to divide sprint in to two separate string then we use two string array [index] variables
     
     String a[]=s.split("@");
      
     System.out.println(a[0]);    //pink
     System.out.println(a[1]);    //mail.com
     
     // Ex.2
  //replace()   
     
     String amount= "$54.98";
     System.out.println(amount.replace("$","").replace(".", ""));    //5498
     
      //Ex.3
     
     String p = "abc@123,mail";
     String r[]=p.split("@");
     
     System.out.println(r[0]);      //o/p    abc
     System.out.println(r[1]);      //o/p    123.mail
     
     String p1[]=r[1].split(",");
     
     System.out.println(p1[0]);       //123
     System.out.println(p1[1]);       //mail
     
     //We can  split abc@123,mail in less code as 
     
     System.out.println(p.split("@")[0]);      //abc
     System.out.println(p.split("@")[1].split(",")[0]);   //123
     System.out.println(p.split("@")[1].split(",")[1]);   //mail
     
     //another way with using create new variable 
     String fiststring = p.split("@")[0];      //abc
     String secoundstring = p.split("@")[1].split(",")[0];   //123
     String thirdstring = p.split("@")[1].split(",")[1];   //mail
     
     System.out.println(fiststring);
     System.out.println(secoundstring);
     System.out.println(thirdstring);
    
      //Ex4= mnl 549 nana
     
     String e="mnl 549 nana";
     
     String [] array =e.split(" ");
     
     String one = array[0];
     String two = array[1];
     String three = array[2];
     
     System.out.println(one);
     System.out.println(two);
     System.out.println(three);
     
   // if you want in one array then use 
     
     System.out.println(Arrays.toString(array));          //[mnl, 549, nana]
      
   //* % ^ ( ) - you can't use as a delimiter because these are the reserved symbols (fix regular expression in java
      
      
      
      
      
	}

}
