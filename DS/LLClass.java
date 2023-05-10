package DS;

import DataStructure.Node;

/*class Node
	{
		int value;
		Node next;
		
		public Node(int d)
		{
			value=d;
			//next=null;
		}
		
	}*/
class LL
{
	Node head;
	int size=0;
	void create(int item)
	{
		head = new Node(item);
	    
	   head.next=null;
	   
	   
	    
	    size = 1;
	}
	void insert(int item,int index)
	{
		Node node=new Node(item);
		if(index==0)
		{
			node.next=head;
			head=node;
			size++;
		}
		else if(index>=size)
		{
			Node temp=head;
			node.next=null;
			while(temp!=null)
				temp=temp.next;
			temp.next=node;
			size++;
		}
		else
		{
			int i=0;
			Node temp=head;
			while(i==index-1)
			{
				temp=temp.next;
				i++;
			}
			Node next=temp.next;
			temp.next=node;
			node=temp.next;
			
			size++;
		}
	}
}

public class LLClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sll l= new Sll();
		l.createSinglyLinkedList(10);
		l.insertInLinkedList(10, 0);
		l.insertInLinkedList(30, 1);
		l.traverseSinglyLinkedList();
		//l.insert(20, 3);
		
	}

}
