import java.util.Scanner;


public class SinglyLinkedList {
	class Node
	{
		int data;
		Node next;
	    Node(int data)
		{
			this.data=data; //main data
			this.next=next; // pointer
		}
	}
	public Node head=null;  //list at start will be empty
	public Node tail=null;
	
	public void addData(int data)
	{
		Node newNode =new Node(data);  
		if(head==null)      //if list is empty then it data will be filled on top i.e. head
		{
			head=newNode; 
			tail=newNode;
		}
		else
		{
			tail.next=newNode;   // else data will pointed towards end of already filled list
			tail=newNode;    // tail will be extended to new data 
		}
	}
	public int count()
	{
		Node current=head;
		int c=0;
		while(current!=null)
		{
			c++;
			current=current.next;  // move to next node
		}
		return c;
	}
	public int search(int ele)
	{
		int pos=0;
			while(head!=null)
			{
				pos++;
				if(ele==head.data)
				{
					return pos;
				}
				head=head.next;
			}
		return -1; // if element not found
	}
	public void insBeg(int ele)
	{
		Node newNode=new Node(ele);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			Node temp=head;       
			head=newNode;
			newNode.next=temp;
		}
	}
	public void insEnd(int ele)
	{
		Node newNode=new Node(ele);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;   // pointing towards last address 
			tail=null;     // assigning last address as new Node
		}
	}
	public void insSpecific(int ele,int pos)
	{
		Node newNode=new Node(ele);
		Node current=head;
		int index=0;
		while(index<pos-1)
		{
			current=current.next;
			index++;
		}
		newNode.next=current.next;
		current.next=newNode;  // normal list pos-1 pointing towards new Node value
	}
	void delBeg()
	{
		if(head==null)
		{
			System.out.println("Underflow");
		}
		else
		{
			head=head.next;
		}
	}
	public void delEnd()
	{
		Node current=head;
		if(current==null)
		{
			System.out.println("List is already empty");
		}
		else
		{
			while(current.next.next!=null)  // head.next.next is last data
			{
				current=current.next;   // this went 2nd last data
			}
			current.next=null;  //and last 2nd data pointer will be null that deletes the connection to last node
		}
	}
	public void delSpec(int pos)
	{
		int i=0;
		while(i<pos-1)
		{
			head=head.next;
			i++;
		}
		Node temp=head.next.next;  //storing the value of the next to the deleted node
		head.next=temp;        //pointing towards the next to the deleted node
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+ " ");
			temp=temp.next;
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SinglyLinkedList sll=new SinglyLinkedList();
		boolean response=true;
		while(response)
		{
		System.out.println("-------------MENU-------------");
		System.out.println("1. Add data");
		System.out.println("2. Count");
		System.out.println("3. Search");
		System.out.println("4. Insert at Beginning");
		System.out.println("5. Insert at Specific Position");
		System.out.println("6. Insert at Ending");
		System.out.println("7. Delete the Beginning");
		System.out.println("8. Delete at Specific Position");
		System.out.println("9. Delete at Ending");
		System.out.println("10.Display");
		System.out.println("11.EXIT");
		System.out.println("-------------------------------");
		int reply=sc.nextInt();
		switch(reply)
		{
		case 1:
		{
			System.out.println("Enter Integer to add to List");
			int a=sc.nextInt();
			sll.addData(a);
			break;
		}
		case 2:
		{
			System.out.println("Total elements in the list : "+sll.count());
			break;
		}
		case 3:
		{
			System.out.println("Enter the element you want to search to find out its position ");
			int s=sc.nextInt();
			System.out.println("Position of the searched element is : "+sll.search(s));
			break;
		}
		case 4:
		{
			System.out.println("Enter the element to insert at the beginning");
			int ele=sc.nextInt();
			sll.insBeg(ele);
			break;
		}
		case 5:
		{
			System.out.println("Enter the element to insert and its position");
			int ele=sc.nextInt();
			int pos=sc.nextInt();
			sll.insSpecific(ele, pos);
			sll.display();
			break;
		}
		case 6:
		{
			System.out.println("Enter the element to insert at the ending");
			int ele=sc.nextInt();
			sll.insEnd(ele);
			break;
		}
		case 7:
		{
			sll.delBeg();
			break;
		}
		case 8:
		{
			System.out.println("Enter the position to Delete that element");
			int pos=sc.nextInt();
			sll.delSpec(pos);
			break;
		}
		case 9:
		{
			System.out.println("Delete the element at ending");
			sll.delEnd();
			break;
		}
		case 10:
		{
			System.out.println("Display the list");
			sll.display();
			break;
		}
		case 11:
			System.exit(0);
		}
		System.out.println("Want to continue?");
		char choice=sc.next().charAt(0);
		if(choice=='N')
		{
			response=false;
		}
		else
			response=true;
		}
	}

}
