package WhileLoop;

public class String_vs_StringBuffer_vs_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Check String is immutable  -- can not change
		
		String s="Welcome";		
		s.concat("to java");      
		System.out.println(s);              //not affect s.concat("to java") of this hence it is immutable 
		
		//StringBuffer ---- can change string value 
		StringBuffer s1=new StringBuffer ("Welcome");		
		s1.append(" to java");      
		System.out.println(s1);              //affect s1.append("to java") of this hence it is mutable 
		
		//StringBuilder ---- can change string value 
		StringBuilder s2=new StringBuilder ("Welcome");		
		s2.append(" to Selenium");      
		System.out.println(s2);              //affect s1.append("to Selenium") of this hence it is mutable 
				
	}

}
