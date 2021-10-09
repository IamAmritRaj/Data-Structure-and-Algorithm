
public class StackUsingArrayImplementation 
{
	int size=100;
	int top=-1;
	int[] list=new int[size];
	
	boolean isEmpty()
	{
		return(top<0);
	}
	
	void push(int x)
	{
		if(top>size-1)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			top++;
			list[top]=x;		
		}	
	}
	
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			int x=list[top];
			top--;
			System.out.println(x+" is popped out");
		}
	}
	
	void peek()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			System.out.println(list[top]+" is the top element");
		}
	}
	
	void display()
	{
		System.out.print("Stack : ");
		for(int i=top;i>-1;i--)
		{
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArrayImplementation sa=new StackUsingArrayImplementation();
		sa.push(10);
		sa.push(20);
		sa.push(30);
		sa.display();
		System.out.println("Is Stack empty? "+sa.isEmpty());
		sa.pop();
		sa.display();
		sa.peek();

	}

}
