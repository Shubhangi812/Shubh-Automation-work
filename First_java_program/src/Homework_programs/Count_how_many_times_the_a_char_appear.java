package Homework_programs;

public class Count_how_many_times_the_a_char_appear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "banana";
		char find = 'a';
		int count = 0;
		
		for (int i=1 ;i<s.length();i++)
		{
		  if(s.charAt(i) == find)
		  {
			  count++;
			 
		  }
		     
		}
		System.out.println("count of a is :"+count);
}
}