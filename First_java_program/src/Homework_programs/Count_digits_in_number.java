package Homework_programs;

public class Count_digits_in_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 456756;
        int count = 0;
        int copyno= num;
        while(copyno>0)
        {
        	copyno = copyno/10 ;
        	count++;
         }
           System.out.println("count the length of num " +num + " is " +count);
	}

}
