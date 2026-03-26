package Collection;

import java.util.Scanner;



public class li{
	void m1() {
		
		        try {
		            int a = 110 / 6;   // First try block
		        } catch (ArithmeticException e) {
		            System.out.println("First exception caught");
		        }

		        try {
		            int[] arr = {1, 2, 3};
		            System.out.println(arr[5]);   // Second try block
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Second exception caught");
		        }

		        System.out.println("Program finished");
		    }
		

	


public static void main(String[] args) {
	li o =new li();
	o.m1();
}
}
	
