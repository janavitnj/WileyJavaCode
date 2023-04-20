package wileyjava;

public class LoopNest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++)
		{
			System.out.println("This is iteration "+i);
			for(int j=1;j<5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
