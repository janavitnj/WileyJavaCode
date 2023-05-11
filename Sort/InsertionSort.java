package Sort;

public class InsertionSort {

	public static int[] insertionsort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		return a;
	}
	public static void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,3,1,2,7,10,100};
		a=insertionsort(a);
		printArray(a);
	}

}
