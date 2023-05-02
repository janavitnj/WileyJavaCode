package Collections;
import java.util.*;

class Stack1
{
	static Stack s=new Stack();
	static int top=0;
	public static void push(int item)
	{
		s.push(item);
		top++;
	}
	
	public static void pop()
	{
		s.pop();
		top--;
	}
	
	public static void peek()
	{
		s.peek();
	}
	public static void display()
	{
		for(int i=0;i<top;i++)
		{
			System.out.println(s.get(i));
		}
	}
}
public class StackClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack1 s=new Stack1();
		s.push(10);
		
		s.push(20);
		s.push(20);
		
		s.display();
		s.pop();
		s.display();
		
		Stack s1=new Stack();
		s1.push(20);
		s1.push(null);
		s1.push(null);
		//s1.push(30);
		System.out.println(s1.peek());
		
	}
}
