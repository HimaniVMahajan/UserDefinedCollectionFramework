//Singly Circular Linked List in generic way.

package UserDefinedCollections;

import java.util.*;
import java.lang.*;

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

public class SinglyCircularLinkedList <T>
{
	public Node Head;
	public Node Tail;
	public int size;
	
	public SinglyCircularLinkedList()
	{
		Head = null;
		Tail = null;
		size = 0;
	}
	
	public int Count()
	{
		int iCnt = 0;
		Node temp = Head;
			
		do
		{
			iCnt++;
			temp = temp.next;
		}while(temp != Tail.next);
		
		return iCnt;
	}
	
	public void InsertFirst(T no)
	{
		Node newn = new Node(no);				//Node constructor call
		
		if((Head == null) || (Tail == null))
		{
			Head = newn;
			Tail = newn;
		}
		else
		{
			newn.next = Head;
			Head = newn;
		}
		Tail.next = Head;
	}
	
	public void InsertLast(T no)
	{
		Node newn = new Node(no);
		
		if((Head == null) && (Tail == null))
		{
			Head = newn;
			Tail = newn;
		}
		else
		{
			Tail.next = newn;
			Tail = newn;
		}
		Tail.next = Head;
	}
	
	public void InsertAtPos(T no,int pos)
	{
		Node newn = new Node(no);
		size = Count();
		
		if((pos < 0) || (pos > (size+1)))
		{
			return;
		}
		else
		{
			if((Head == null) && (Tail == null))
			{
				Head = newn;
				Tail = newn;
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
				Node temp = Head;
			
				for(int i=1; i<pos-1; i++)
				{
					temp = temp.next;
				}
				newn.next = temp.next;
				temp.next = newn;
			}
		}
	}
			
	public void DeleteFirst()
	{
		if((Head == null) && (Tail == null))
		{
			return;
		}
		else
		{
			if(Head != null)
			{
				Head = Head.next;
			}
		}
	}
	
	public void DeleteLast()
	{
		if((Head == null) && (Tail == null))
		{
			return;
		}
		else
		{
			Node temp = Head;
			
			while(temp.next.next != Head)
			{
				temp = temp.next;
			}
			temp.next = Head;
			Tail = temp;
		}
	}
	
	public void DeleteAtPos(int pos)
	{
		size = Count();
		
		if(((Head == null) && (Tail == null)) || (pos <= 0) || (pos > size+1))
		{
			return;
		}
		else
		{
			if(pos == 1)
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
	}
		
	public void Display()
	{
		if((Head == null) && (Tail == null))
		{
			return;
		}
		else
		{
			Node temp = Head;
			
			do
			{
				System.out.print(temp.data +"\t");
				temp = temp.next;
			}while(temp != (Tail.next));
		}
		System.out.println();
	}
}