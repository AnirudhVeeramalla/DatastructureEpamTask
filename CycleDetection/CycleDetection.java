/**
 * Program to detect cycle in linked list
 * @author AnirudhVeeramalla
 */


/**
 * class that holds data and address of next node
 * @author AnirudhVeeramalla
 *
 */
 class SinglyLinkedListNode {
	  
        int data;
        SinglyLinkedListNode next;
        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
 }

 /**
  * Class to detect cycle in linked list  
  * @author AnirudhVeeramalla
  *
  */
public class CycleDetection {
    
	/**
	 * method to find whether there is cycle
	 * @param head
	 * @return true/false if there is cycle or not
	 */
	  boolean hasCycle(SinglyLinkedListNode head) {
	     if(head==null)
	         return false;
	     else
	     {
	         SinglyLinkedListNode fast=head;
	         SinglyLinkedListNode slow=head;
	         //move fast by two steps and slow by one step if both meet then there is cycle
	         while(fast!=null&&fast.next!=null)
	         {
	             fast=fast.next.next;
	             slow=slow.next;
	             if(fast==slow)
	                 return true;
	         }
	         return false;
	     }
	    
	}
}
