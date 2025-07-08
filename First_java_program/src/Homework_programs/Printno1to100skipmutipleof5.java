package Homework_programs;
//Print numbers from 1 to 100, but skip multiples of 5
//Write a program to print all numbers from 1 to 100, but skip the numbers that are multiples of 5.
//Example:
//Output: 1 2 3 4 6 7 8 9 11 ... (skip 5, 10, 15…)
//Tip: Use "continue" inside a loop.



public class Printno1to100skipmutipleof5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1 ; i<=100 ; i++)
		{
			if (i%5==0)
			{
				continue;
			}
				System.out.print(i+" ");
			
		}
	

	}

}
