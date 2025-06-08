package Conditinal_statment;

public class Project_2_homework {

	public static void main(String[] args)
	{
		
	    int math = 45;
	    int science = 46;
	    int english = 35;
	    
	    int total= math+science+english;
	    double average= total/3.0d;        
	    
	    System.out.println("Maths: "+math);
	    System.out.println("Science: "+science);
	    System.out.println("English: "+english);
	    System.out.println("total marks of subjects: "+total);
	    System.out.println("average marks : "+average);
		
//	Based on the average, prints the grade as follows:
//  90-100 : A+        75-89 : A        60-74 : B         40-59 : C        <40 : Fail
	    
//print a custom message:
//	If failed: “Please work harder next time.”
//	If Grade A+ or A: “Excellent performance!”
//	Otherwise: “Keep improving.”
	    
	    if (average >= 90)
        {
       	 System.out.println("Gread A+");
       	 System.out.println("Excellent performance!");
       	}	    
        else if (average >= 75)
        {
       	 System.out.println("Gread A");
       	 System.out.println("Excellent performance!");
       	}
        else if (average >= 60)
        {
       	 System.out.println("Gread B");
       	 System.out.println("Keep improving.");
       	}
        else if (average >= 40)
        {
       	 System.out.println("Gread C");
       	 System.out.println("Keep improving.");
       	}
	  //Check if any subject mark is below 35 → print: “Failed due to low score in at least one subject.”	    
        else if (average < 35)
	    {
        	if (math<35 || science<35 || english<35)
        	{
        	 System.out.println("Failed due to low score in at least one subject.");
        	}
        	
	    System.out.println("Fail");
	    System.out.println("Please work harder next time.");
        	
	    }
        
	}

	
}	