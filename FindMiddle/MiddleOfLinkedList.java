
/**
 * class that holds data and address of next node
 * @author AnirudhVeeramalla
 *
 */
class Node
{
	int data;
	Node next;
	Node(int data,Node next)
	{
		this.data=data;
		this.next=next;
	}
}

/**
 * Class to find middle element in linked list  
 * @author AnirudhVeeramalla
 *
 */
public class MiddleOfLinkedList {
	
	/**
	 * Method to find middle element in linked list
	 * @param head
	 * @return middle element of linked list
	 */
	int findMiddle(Node head)
	   {
		     if(head==null)
		    	 return Integer.MIN_VALUE;
	         Node fast=head;
	         Node slow=head;
	         //move fast by two steps and slow by one step
	         while(fast!=null&&fast.next!=null)
	         {
	             fast=fast.next.next;
	             slow=slow.next;
	         }
	         return slow.data;
	   }

}
