package Sort;

public class QuickSort {
	public static int partition(int a[],int start,int end)
	{
		int pivot=end;
		int i=start-1;
		for(int j=start;j<=end;j++)
		{
			if(a[j]<=a[pivot])
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		return i;
	}
	public static void sort(int a[],int start,int end)
	{
		if(start<end)
		{
			int pivot=partition(a,start,end);
			sort(a,start,pivot-1);
			sort(a,pivot+1,end);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,2,3};
		sort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}

}

