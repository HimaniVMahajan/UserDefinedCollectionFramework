//Doubly Linear Linked List.

package UserDefinedCollections;										//create user defined package

import java.lang.*;
import java.util.*;

class Node <T>
{
	public T data;
	public Node next;
	public Node prev;
	
	public Node(T val)
	{
		data = val;
		next = null;
		prev = null;
	}
}

public class DoublyLinearLinkedList <T>
{
	public Node Head;
	public int size;
	
	public DoublyLinearLinkedList()
	{
		Head = null;
		size = 0;
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
	
	public void InsertFirst(T no)
	{
		Node newn = new Node(no);									//Node class constructor call
		
		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			newn.next = Head;
			Head.prev = newn;
			Head = newn;
		}
	}
	
	public void InsertLast(T no)
	{
		Node newn = new Node(no);
		
		if(Head == null)
		{
			Head =  newn;
		}
		else if(Head.next == null)								//single node
		{
			Head.next = newn;
			newn.prev = Head;
		}
		else
		{
			Node temp = Head;
			
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newn;
			newn.prev = temp;
		}
	}
	
	public void InsertAtPos(T no, int pos)
	{
		Node newn = new Node(no);
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
			Node temp = Head;
			
			for(int i=1; i<pos-1; i++)
			{
				temp = temp.next;
			}
			newn.next = temp.next;
			temp.next.prev = newn;
			temp.next = newn;
			newn.prev = temp;
		}
	}
	
	public void DeleteFirst()
	{
		if(Head == null)
		{
			return;
		}
		else if(Head.next == null)							//single node
		{
			Head = null;
		}
		else												//multiple node
		{
			Head = Head.next;
			Head.prev = null;
		}
	}
	
	public void DeleteLast()
	{
		if(Head == null)
		{
			return;
		}
		else
		{
			Node temp = Head;
			
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next.prev = null;
			temp.next = null;
		}
	}
	
	public void DeleteAtPos(int pos)
	{
		size = Count();
		
		if(Head == null)
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
				temp.next.next.prev = temp;
				temp.next = temp.next.next;
			}
		}
	}
	
	public void Display()
	{
		Node temp = Head;
		
		System.out.println();
		while(temp != null)
		{
			System.out.print(temp.data +"\t");
			temp = temp.next;
		}
		System.out.println();
	}
}
	
	
	
	
	
	
	