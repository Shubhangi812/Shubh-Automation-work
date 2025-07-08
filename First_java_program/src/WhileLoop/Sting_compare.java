package WhileLoop;

public class Sting_compare{
	//String Comparision methods

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//case 1
//		String s1 = "compare";
//		String s2 = "compare";
//		
//		System.out.println(s1==s2);           //true
//		System.out.println(s1.equals(s2));    //true
//		
//		//case 2
//		String d1 = new String("welcome");
//		String d2 = new String("welcome");
//		
//		System.out.println(d1==d2);           //false    // here is == compare the objects of the verible 
//		System.out.println(d1.equals(d2));    //true     // here is equals() method compare the values of the verible 
		
		//case 3
		String s1 ="welcome";                //it wiil create just veriable .
		String s2 =new String ("welcome");   //it wiil create new object .
		String s3 = s2;
		System.out.println(s1==s2);
		System.out.println(s1.equals(2));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s3==s2);
		System.out.println(s3.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		
		//Immutable -----can't change ---String immutable object 
		//mutable -----can change  ------StringBuffer & StringBuider are mutable objects 
		

	}

}
