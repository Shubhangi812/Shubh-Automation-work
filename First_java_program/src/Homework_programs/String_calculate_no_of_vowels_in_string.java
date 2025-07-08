package Homework_programs;

//Write a Java Program to Calculate total number of vowels in a String “Hello how are you doing today?”

public class String_calculate_no_of_vowels_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Hello how are you doing today?" ;
		int vowel = 0;
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
		sentence=sentence.toLowerCase();        //convert all in lower case .
		{
			System.out.println(sentence);
		}
		
        for (int i=0; i<sentence.length(); i++ )
        {
        	char ch = sentence.charAt(i);
        	switch(ch)                     // printing each vowel count 
        	{
        	case 'a': aCount++;break;
        	case 'e': eCount++;break;
        	case 'i': iCount++;break;
        	case 'o': aCount++;break;
        	case 'u': aCount++;break;
        	default:break;
        	}
                	
        	if (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u')
        	{
        		vowel++;
        	}       	
        	
        }
       
        System.out.println("total number of vowels : "+vowel);
        System.out.println("print vowel count : ");
        System.out.println("a : "+aCount);
        System.out.println("e : "+eCount);
        System.out.println("i : "+iCount);
        System.out.println("o : "+oCount);
        System.out.println("u : "+uCount);
        
        
	}
	
	
	

}