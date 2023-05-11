package Assignment;

import java.util.Scanner;

public class FibonacciDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		System.out.println(fibo(i));
	}

	private static int fibo(int n) {
		// TODO Auto-generated method stub
		
		        if (n <= 1) { 
		            return n;
		        } else { 
		            return fibo(n - 1) + fibo(n - 2);
		        }
	}

}
