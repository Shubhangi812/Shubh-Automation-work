package Homework_programs;

public class Find_sum_of_digits {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
		int sum = 0;
		int copy =num;
		while (copy>0)
		{
			int saperat_digit = copy%10;      //get last digit of the num 1234  like 4 3 2 1
			sum += saperat_digit ;            // Add saperat digit into sum  like 0+4=4,3+4=7,2+7=9,1+9=10
			copy/= 10;                        //Remove the last digit like 1234/10 =123 ,123/10=12,12/10=1
			
		}
		System.out.println("sum of the digits is: " + num + " = "+ sum);
}
}