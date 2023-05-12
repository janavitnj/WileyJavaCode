package Optimization;

import java.util.Random;

public class EnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		int a[]=new int[1000];
		for(int i=0;i<1000;i++)
			a[i]=rd.nextInt();
		int num;
		long start=System.currentTimeMillis();
		for(int i=0;i<1000;i++)
			System.out.println(a[i]);
		long end=System.currentTimeMillis();
		
		
		long start1=System.currentTimeMillis();
		for(int a1:a)
			System.out.println(a1);
		long end1=System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(end1-start1);
	}

}
