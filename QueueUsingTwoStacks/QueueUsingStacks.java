/**
 * Program to insert back,delete front,print front from queue by using two stacks
 * @author AnirudhVeeramalla
 */
import java.util.*;
public class QueueUsingStacks {
	
	    static Stack<Integer> stack1; 
	    static Stack<Integer> stack2;  

	    /**
	     * method to insert element at back of queue here we use stack so we insert it in stack1
	     * @param element
	     */
	    static void enqueue(int element)
	    {
	       stack1.push(element);
	    }
	    
	    /**
	     * method to delete from queue at front here we put all the elements from stack1 into stack2 and pop the element
	     */
	    static void dequeue()
	    {
	       if(stack2.isEmpty())
	       {
	    	   //push all elements into stack2
	           while(!stack1.isEmpty())
	           {
	               stack2.push(stack1.pop());
	           }
	       }
	       if(!stack2.isEmpty())
	       {
	    	   stack2.pop();
	       }
	    }
	    
	    /**
	     * method to print front element here we put all elements from stack1 to stack2 and print peek element
	     */
	    static void printFront()
	    {
	       if(stack2.isEmpty())
	       {
	    	 //push all elements into stack2
	           while(!stack1.isEmpty())
	           {
	               stack2.push(stack1.pop());
	           }
	       }
	       if(!stack2.isEmpty())
	       {
	    	   System.out.println(stack2.peek());
	       }
	    }
	    
	    /**
	     * Main method to accept input and call methods
	     * @param args
	     */
	    public static void main(String[] args) {
	    	
	        Scanner ScanIt=new Scanner(System.in);
	        stack1=new Stack<Integer>();
	        stack2=new Stack<Integer>();
	        int queries=ScanIt.nextInt();
	        for(int i=0;i<queries;i++)
	        {
	             int type=ScanIt.nextInt();
	             switch(type)
	             {
	                 case 1:int element=ScanIt.nextInt();
	                        enqueue(element);
	                        break;
	                 case 2:dequeue();
	                        break;
	                 case 3:printFront();
	                        break;
	                 default:
	                	    System.out.println("Wrong input");
	             }
	        }
	         
	    }

}
