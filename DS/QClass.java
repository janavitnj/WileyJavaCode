package DS;

public class QClass {
	int size=5;
	int items[]=new int[size];
	int front,rear;
	public QClass()
	{
		front=-1;
		rear=-1;
	}
	
	boolean isFull()
	{
		if(front==0 && rear==size-1)
			return true;
		return false;
	}
	
	boolean isEmpty()
	{
		if(front==-1)
			return true;
		else
			return false;
	}
	
	void enq(int item)
	{
		if(isFull())
		{
			System.out.println("queue is full");
		}
		else 
		{
			if(front==-1)
				front=0;
			rear++;
			items[rear]=item;
			System.out.println("Inserted "+item);
		}
	}
	int deq()
	{
		int element;
		if(isEmpty())
		{
			System.out.println("empty");
			return -1;
		}
		else
		{
			element=items[front];
			if(front>=rear)
			{
				front=-1;
			    rear=-1;
			}
			else
			{
				front++;
			}
			System.out.println("Deleted "+element);
			return element;
		
		}
	}
	
	void display()
	{
		int i;
		if(isEmpty())
			System.out.println("empty");
		else
		{
			for( i=front;i<=rear;i++)
				System.out.println(items[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QClass q=new QClass();
		q.enq(10);
		q.enq(20);
		q.enq(30);
		q.display();
		q.deq();
		q.display();
	}

}
