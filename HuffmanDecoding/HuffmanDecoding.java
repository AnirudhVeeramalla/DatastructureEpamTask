/**
 * class which contains frequency of each character,character and pointer to left and right nodes
 * @author AnirudhVeeramalla
 */
abstract class Node implements Comparable<Node> {
    int frequency; // the frequency of this tree
    char data;
    Node left;
    Node right;
    public Node(int freq) { 
      frequency = freq; 
    }
 
    // compares on the frequency
    public int compareTo(Node tree) {
        return frequency - tree.frequency;
    }
}

/**
 * Decode string using HuffmanDecoding Technique
 * @author AnirudhVeeramalla
 */
public class HuffmanDecoding {
	
	/**
	 * method which decodes the string 
	 * @param encoded
	 * @param root
	 */
	void decode(String encoded ,Node root)
    {
       if(root==null)
           return;
       Node temp=root;
       //traverse the string
       for(int i=0;i<encoded.length();i++)
       {
    	   //if current character is 0 then move to left
           if(encoded.charAt(i)=='0')
           {
        	   root=root.left;
           }
           //if current character is 1 then move to right
           else
           {
        	   root=root.right;
           }
           
           //print leaf node
           if(root.left==null&&root.right==null)
           {
               System.out.print(root.data+"");
               root=temp;
           }
       }
    }

}
