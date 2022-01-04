//Doubly Circular Linked List.

package UserDefinedCollections;
import java.lang.*;
import java.util.*;

class Node <T>
{
	public T data;
	public Node next;
	public Node prev;
	
	public Node(T val)						//parameterised constructor
	{
		data = val;
		next = null;
		prev = null;
	}
}

public class DoublyCircularLinkedList <T>
{
	public Node Head;
	public Node Tail;
	public int size;
	
	public DoublyCircularLinkedList()
	{
		size = 0;
		Head = null;
		Tail = null;
	}
	
	public int Count()
	{
		int iCnt = 0;
		Node temp = Head;
		
		if(temp == null)
		{
			return 0;
		}
		
		do
		{
			iCnt++;
			temp = temp.next;
		}while(temp != Head);
		
		return iCnt;
	}
		
	public void InsertFirst(T no)
	{
		Node newn = new Node(no);											//Node class constructor call
		
		if((Head == null) && (Tail == null))
		{
			Head = newn;
			Tail = newn;
		}
		else
		{
			newn.next = Head;
			Head.prev = newn;
			newn.prev = Tail;
			Head = newn;
		}
		Head.prev = Tail;													//for circular structure
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
			newn.prev = Tail;
			newn.next = Head;
			Tail = newn;
		}
		Head.prev = Tail;													
		Tail.next = Head;
	}
	
	public void InsertAtPos(T no, int pos)
	{
		Node newn = new Node(no);
		size = Count();
		
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
				temp =temp.next;
			}
			newn.next = temp.next;
			temp.next.prev = newn;
			temp.next = newn;
			newn.prev = temp;
		}
		Head.prev = Tail;
		Tail.next = Head;
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
			Head.prev = Tail;
			Tail.next = Head;
		}
		Head.prev = Tail;
		Tail.next = Head;
	}
	
	public void DeleteLast()
	{
		if(Tail == null)
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
			Head.prev = temp;
			Tail = temp;
		}
		Head.prev = Tail;
		Tail.next = Head;
	}
	
	public void DeleteAtPos(int pos)
	{
		size = Count();
		
		if((Head == null) && (Tail == null))
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
			temp.next.next.prev = temp;
			temp.next = temp.next.next;
		}
		Head.prev = Tail;
		Tail.next = Head;
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
			}while(temp != Head);
		}
		System.out.println();
	}
}
	
	
	
	
	
			

