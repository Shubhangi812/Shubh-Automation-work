package WhileLoop;

import java.util.Arrays;

public class Object_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //if you want to use any type of data like int , String in single array then use object class 
		// object is a root class or predefine class in java 
		
		Object a[] = new Object [5];
		
		a[0]= 145;
		a[1]= "String";
		a[2]= true;
		a[3]="h";
		a[4]=22.6;
		
		System.out.println(Arrays.toString(a));                      // [145, String, true, h, 22.6]   this is called heterogeneous data 
		
		// want to use looping statement
		
		for (Object x:a) 
		{
			System.out.println(x);
		}
	}

}
