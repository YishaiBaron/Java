
//Ex7
// Yishai Baron 308396761
public class Ex7 {		
	public static boolean find(int[][] a, int x){ //Complexity O(n)
		boolean found = false;
		int row = 0;
		int col = a.length-1;
		  while ( row < a.length && col >= 0 && !found )  
		   {
		      if ( a[row][col] == x )
		      {
		       found  = true;
		      }
		      else if ( a[row][col] > x )
		        col--;
		      else  		//  if a[i][j] < x
		        row++;
		   }
			return found;
	}

	public static int find(int[] a, int x)	{ //Complexity:  log O(size)
        
        int right = a.length - 1;
        int middle;
        int left=0;
        for (int i= 0; i<a.length; i+=2) { //even indexes - {0,1,2,3}
        	if (a[i]==x) return i;        
           middle = (int) Math.floor((left + right)/2); // binary search  
          if (a[middle] > x ) 
                right = middle - 1;
            else if (a[middle] < x)
                    left = middle + 1;
            else if (a[middle] == x)   return middle;
            
            else break; 
        }  
        int leftodd=0;
       
        int rightodd = a.length;
        for (int j= 1; j<a.length; j+=2) { //odd indexes -{0,1,2}
        	if (a[j]==x) return j; 
        	middle = (int) Math.floor((leftodd + rightodd)/2); // binary search  
           if (a[middle] < x ) 
                 rightodd = middle -1 ;
             else if (a[middle] > x)
                     leftodd = middle + 1;
                 else
                     return middle;
         }
        
        return -1;
	}
        public static int countSub(String s, char first, char last) // Complexity-->O(n)
    	{
    		int cunt=0; //counter
    		String temp=s;
    		if(temp.length()<=1)//if just 1 char - return 0
    			return 0;
    		for(int j=1,i=0;i<temp.length() && j<temp.length();)//run until the end of the  S
    		{
    			if(temp.charAt(i)==first)
    			{
    				if(temp.charAt(j)==last)//if it is a HIT- COUNTER++ && J++
    				{
    					cunt++;
    					j++;
    				}
    				else//find the next LAST char
    					j++;
    				if(j==temp.length())//if this is the end of the string
    				{
    					temp=temp.substring(i+1);
    					j=i+1;
    					i=0;
    				}
    			}
    			else//if not start with the FIRST char
    				temp=temp.substring(i+1);


    		}
    		return cunt;
    	}	
	
		
	
	
}