package Homework_programs;

public class No_divide_by_3_and_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for (int i=1; i<=100 ;i++)
       {
    	   if (i%3==0 && i%5==0)
    	   {
    		   System.out.println("Numbers that are divisible by both 3 and 5: " +i);
    	   }
       }
	}

}
