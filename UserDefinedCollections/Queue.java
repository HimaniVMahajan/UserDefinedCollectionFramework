//Queue implementation using Linked List.

package UserDefinedCollections;
import java.lang.*;
import java.util.*;

class Node <T>
{
	public T data;
	public Node next;
	
	public Node(T val)
	{
		data = val;
		next = null;
	}
}

public class Queue <T>
{
	public Node Head;
	public int Size;
	public int pos;
	
	public Queue()
	{
		Head = null;
		Size = 0;
		pos = 0;
	}

	public void Enqueue(T iVal)
	{
		Node newn = new Node(iVal);
	
		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			Node temp = Head;
		
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newn;
		}
		Size++;
	}

	public void Dequeue()
	{
		if(Head == null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			Head = Head.next;
			Size--;
		}
	}

	public void Display()
	{
		Node temp1 = Head;
	
		System.out.println();
		while(temp1 != null)
		{
			System.out.print(temp1.data +"\t");
			temp1 = temp1.next;
		}
		System.out.println();	
	}

	public int Count()
	{
		return Size;
	}

}
		
