package WhileLoop;

import java.util.Arrays;

public class Mutable_Imutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int a[]= {40 , 50 ,60 ,20};
		
		System.out.println(Arrays.toString(a));         //[40, 50, 60, 20]
		Arrays.sort(a);                                 //here it is mutable because it is sort the values 
		System.out.println(Arrays.toString(a));         //[20, 40, 50, 60]
		
		int b[]=a;
		System.out.println(Arrays.toString(b));         //[20, 40, 50, 60]
	}

}
