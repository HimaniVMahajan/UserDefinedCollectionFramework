//SinglyLinkedList in generic way.

package UserDefinedCollections;								//user define package creation					

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

public class SinglyLinkedList <T>
{
	public Node Head;
	public int size;
	
	public SinglyLinkedList()
	{
		Head = null;
		size = 0;
	}
	
	public int Count()
	{
		Node temp = Head;
		int iCnt = 0;
		
		while(temp != null)
		{
			iCnt++;
			temp = temp.next;
		}
		return iCnt;
	}
	
	public void InsertFirst(T no)
	{
		Node newn = new Node(no);							//Node class constructor call
		
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
	
	public void InsertLast(T no)
	{
		Node newn = new Node(no);
		
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
	}
	
	public void InsertAtPos(T no, int pos)
	{
		Node newn = new Node(no);
		Node temp = Head;
		
		size = Count();
		
		if(Head == null)
		{
			Head = newn;
		}
		else if(pos == 1)
		{
			InsertFirst(no);
		}
		else if(pos == (size+1))
		{
			InsertLast(no);
		}
		else
		{
			for(int i=1; i<pos-1; i++)
			{
				temp = temp.next;
			}
			newn.next = temp.next;
			temp.next = newn;
		}
	}
	
	public void DeleteFirst()
	{
		if(Head == null)
		{
			return;
		}
		else
		{
			Head = Head.next;
		}
	}
	
	public void DeleteLast()
	{
		Node temp = Head;
		
		if(Head == null)
		{
			return;
		}
		else
		{
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	
	public void DeleteAtPos(int pos)
	{
		size = Count();
		
		if((Head == null) || (pos < 0) || (pos > size))
		{
			return;
		}
		else if(pos == 1)
		{
			DeleteFirst();
		}
		else if(pos == size)
		{
			DeleteLast();
		}
		else
		{
			Node temp = Head;
			
			for(int i=1; i<pos-1; i++)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}
	
	public void Display()
	{
		if(Head == null)
		{
			return;
		}
		else
		{
			Node temp = Head;
			
			while(temp != null)
			{
				System.out.print(temp.data +"\t");
				temp = temp.next;
			}
		}
		System.out.println();
	}
}
		
		
			