/**
 * Program to find frequency of 'query strings' in strings array
 * @author AnirudhVeeramalla
 */

/**
 * Class to get frequency of 'query strings' in strings array
 * @author AnirudhVeeramalla
 */

class SparseArray {
	
	/**
	 * method to return frequency of queried string in string array
	 * @param strings
	 * @param queries 
	 * @return frequency of query strings
	 */
	int[] matchingStrings(String[] strings, String[] queries) {
		
        int[] result=new int[queries.length];
        
        for(int i=0;i<queries.length;i++)
        {
            for(int j=0;j<strings.length;j++)
            {
            	//compare query string with string
                if(queries[i].equals(strings[j]))
                {
                    result[i]++;
                }
            }
        }
        return result;
    }

}
