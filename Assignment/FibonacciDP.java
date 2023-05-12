package Assignment;

import java.util.Scanner;

public class FibonacciDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] dp=new int[10];
		for(int i=0;i<10;i++)
			dp[i]=-1;
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		System.out.println(fibo(i,dp));
	}

	private static int fibo(int n,int dp[]) {
		// TODO Auto-generated method stub
		
		        if (n <= 1) { 
		            return n;
		        } 
		        if(dp[n]!=-1)
		        {
		        	return dp[n];
		        }
		        else { 
		            return  dp[n]=fibo((n - 1),dp) + fibo((n - 2),dp);
		        }
	}

}
