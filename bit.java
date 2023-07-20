package Setbit;

import java.util.Scanner;

public class bit {

		public static int setBit(int n, int m)
		{
		   
		    int B= n-n|(1 << m );
		    return B;
		   
		}
		 

		public static void main(String arg[])
		{
			Scanner A=new Scanner(System.in);
		    int n = A.nextInt();
		    int m = A.nextInt(); 
			System.out.println(setBit(n, m));
		}
}

		

	
	


