import UserDefinedCollections.SinglyLinkedList;
import UserDefinedCollections.SinglyCircularLinkedList;						//import user define package
import UserDefinedCollections.DoublyLinearLinkedList;
import UserDefinedCollections.DoublyCircularLinkedList;
import UserDefinedCollections.Queue;
import UserDefinedCollections.Stack;
import java.lang.*;
import java.util.*;

class GenericMain
{
	public static void main(String args[])
	{
		SinglyLinkedList<Character> obj1 = new SinglyLinkedList<Character>();
		SinglyCircularLinkedList<Character> obj2 = new SinglyCircularLinkedList<Character>();
		DoublyLinearLinkedList<Character> obj3 = new DoublyLinearLinkedList<Character>();
		DoublyCircularLinkedList<Character> obj4 = new DoublyCircularLinkedList<Character>();
		
		Queue<Character> obj5 = new Queue<Character>();
		
		Stack<Character> obj6 = new Stack<Character>();
		
		Scanner sobj = new Scanner(System.in);
		int choice = 1, iRet = 0;
		int pos = 0;
		char val;
		
		while(choice != 0)
		{
			System.out.println();
			System.out.println("1.InsertFirst");
			System.out.println("2.InsertLast");
			System.out.println("3.InsertAtPos");
			System.out.println("4.DeleteFirst");
			System.out.println("5.DeleteLast");
			System.out.println("6.DeleteAtPos");
			System.out.println("7.Count");
			System.out.println("8.Display");
			System.out.println("9.Insert into Queue");
			System.out.println("10.Delete node From Queue");
			System.out.println("11.Count Nodes from Queue");
			System.out.println("12.Display Queue elements");
			System.out.println("13.Push into Stack");
			System.out.println("14.Pop from Stack");
			System.out.println("15.Peep from Stack");
			System.out.println("16.Count Nodes from Stack");
			System.out.println("17.Display Stack elements");
			System.out.println("0.Exit");
			
			System.out.println("\nEnter your choice:\t");
			choice = sobj.nextInt();
			
			switch(choice)
			{
				case 1:
						System.out.println("\nEnter the Value for Insert First:\t");
						val = sobj.next().charAt(0);									//for take character input
						obj1.InsertFirst(val);
						break;
				
				case 2:
						System.out.println("\nEnter the Value for Insert Last:\t");
						val = sobj.next().charAt(0);
						obj1.InsertLast(val);
						break;
						
				case 3:
						System.out.println("\nEnter the Value for Insert Node:\t");
						val = sobj.next().charAt(0);
						System.out.println("\nEnter the Position for Insert Node:\t");
						pos = sobj.nextInt();
						obj1.InsertAtPos(val,pos);
						break;
						
				case 4:
						obj1.DeleteFirst();
						break;
						
				case 5:
						obj1.DeleteLast();
						break;
						
				case 6:
						System.out.println("\nEnter the Position for Delete Node:\t");
						pos = sobj.nextInt();
						obj1.DeleteAtPos(pos);
						break;
						
				case 7:
						iRet = obj1.Count();
						System.out.println("\nTotal number of Nodes:\t" +iRet);
						break;
						
				case 8:
						System.out.println("\nElements are:-");
						obj1.Display();
						break;
						
				case 9:
						System.out.println("Enter the Value for Insert into Queue:\t");
						val = sobj.next().charAt(0);
						obj5.Enqueue(val);
						break;
						
				case 10:
						obj5.Dequeue();
						System.out.println("\nDeleted node from Queue");
						break;
				
				case 11:
						iRet = obj5.Count();
						System.out.println("\nTotal number of Nodes:\t" +iRet);
						break;
						
				case 12:
						System.out.println("\nQueue Elements are:-");
						obj5.Display();
						break;
						
				case 13:
						System.out.println("Enter the Value for Insert into Stack:\t");
						val = sobj.next().charAt(0);
						obj6.push(val);
						break;
						
				case 14:
						obj6.pop();
						break;
						
				case 15:
						val = obj6.peep();
						System.out.println("Peeped element from Stack is:\t" +val);
						break;
						
				case 16:
						iRet = obj6.Count();
						System.out.println("\nTotal number of Nodes:\t" +iRet);
						break;
								
				case 17:
						System.out.println("\nStack Elements are:-");
						obj6.Display();
						break;
						
				case 0:
						System.out.println("\nThank You for using this Application:\n");
						break;
				
				default:
						System.out.println("Wrong choice");
						break;
			}
		}
		obj1.Head = null;
		obj6.Head = null;
	}
}