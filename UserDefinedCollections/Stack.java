//Stack 

package UserDefinedCollections;
import java.lang.*;
import java.util.*;

class Node<T>
{
	public T data;
	public Node next;
	
	public Node(T val)
	{
		data = val;
		next = null;
	}
}

public class Stack <T>
{
	public Node<T> Head;
	public T val;
	
	public Stack()
	{
		Head = null;
	}
	
	public int Count()
	{
		int iCnt = 0;
		Node temp = Head;
		
		while(temp != null)
		{
			iCnt++;
			temp = temp.next;
		}
		return iCnt;
	}
	
	public void push(T no)
	{
		Node newn = new Node(no);				//dynamic memory allocation
	
		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			newn.next = Head;
			Head = newn;
		}
	}
	
	public void pop()
	{
		Node<T> temp = null;
		
		if(Head == null)
		{
			System.out.println("\nStack is empty\n");
		}
		else
		{
			Head = Head.next;
		}
	}
	
	public T peep()
	{
		//T val;
		
		if(Head == null)
		{
			System.out.println("\nStack is empty\n");
		}
		else
		{
			val = Head.data;
		}
		return val;
	}
		
	public void Display()
	{
		System.out.println();
		Node temp = Head;
		
		if(Head == null)
		{
			return;
		}
		
		while(temp != null)
		{
			System.out.println(temp.data +"\t");
			temp = temp.next;
		}
		System.out.println();
	}
}