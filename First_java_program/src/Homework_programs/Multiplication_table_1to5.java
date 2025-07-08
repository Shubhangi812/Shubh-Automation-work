package Homework_programs;

public class Multiplication_table_1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=1;
//		int multipiler=1;
//
//    	 do {
//             System.out.println( +num*multipiler);
//             multipiler++;
//    	                 
//             if(multipiler>10) 
//             {
//            	 multipiler=0;            // Reset multiplier
//                 num++;                   // Move to next table
//                 System.out.println();    // Add space between tables
//            	 multipiler++;
//             }  
//             
//    	 }
//          while (num<=5);

         
//	}
//
//}

//using for loop


       for (int number = 1; number <= 5; number++) 
      {
            System.out.println("Multiplication Table for " + number + ":");
            
            for (int i = 1; i <= 10; i++) 
            {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
            System.out.println(); // Blank line for better readability
        }
    }
}





