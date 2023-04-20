package wileyjava;
import java.util.*;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int num;
		
		do
		{
			System.out.print("Enter a value < 10:");
			num=in.nextInt();
		}while(num<10);

	}

}
