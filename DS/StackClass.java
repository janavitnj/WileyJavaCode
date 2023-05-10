package DS;

public class StackClass {
	int arr[];
	int top;
	int size;
	
	StackClass(int size)
	{
		arr=new int[size];
		this.size=size;
		top=-1;
	}
	
	public void push(int item)
	{
		if(isFull())
		{
			System.out.println("Stack overflow");
			System.exit(1);
		}
		System.out.println("Inserted "+item);
		arr[++top]=item;
	}
	
	private boolean isFull() {
		// TODO Auto-generated method stub
		return top==size-1;
	}

	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			System.exit(1);
		}
		System.out.println("Deleted "+arr[top]);
		top--;
	}
	
	public int sizeStack()
	{
		return top+1;
	}
	
	public void printStack()
	{
		
		for(int i=top;i>=0;i--)
			System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackClass s=new StackClass(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.printStack();
		s.pop();
		s.printStack();
	}

}
