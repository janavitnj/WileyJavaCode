package Sort;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,4,3,9};
		int key=5;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println("key found at index:"+i);
				System.exit(0);
			}
		}
		System.out.println("key not found");
	}

}
