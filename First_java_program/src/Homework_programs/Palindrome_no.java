package Homework_programs;

public class Palindrome_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=121;
		int originalno=num;
		int reverseno=0;
		
		while(num>0)
		{
			int digit=num%10 ;                  //Separate last digit
			reverseno = reverseno*10 + digit  ;    //reveres no 
			num = num/10;                       //remove last digit 
			
		}
		
		if(originalno == reverseno) {
			System.out.println("no is palindrome : " + originalno);
		}
		else 
		{
           System.out.println("no is not palindrome : " + originalno);
		}
	}

}
