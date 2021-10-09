
public class StackUsingLinkedListImplementation {
	
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=next;
		}
	}
	Node head=null;
	Node tail=null;
	
	
	boolean isEmpty()
	{
		return(head==null);
	}
	
	void push(int x)
	{
		Node n=new Node(x);
		if(head==null)
		{
			head=n;
			tail=n;
		}
		else
		{
			Node temp=head;
			head=n;
			head.next=temp;
		}
	}
	void pop()
	{
		if(head==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			int x=head.data;
			head=head.next;
			System.out.println(x+" is popped out");
		}
	}
	void peek()
	{
		if(head==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println(head.data+" is the top element");
		}
	}
	void display()
	{ 
		Node t=head;
		System.out.print("Stack :");
		while(t!=null)
		{
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkedListImplementation s=new StackUsingLinkedListImplementation();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		System.out.println("Stack is empty? "+s.isEmpty());
		s.pop();
		s.display();
		s.peek();

	}

}
