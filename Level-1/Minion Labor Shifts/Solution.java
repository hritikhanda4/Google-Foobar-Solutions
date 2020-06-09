import java.util.HashMap;
import java.util.ArrayList;
public class Solution {
    public static int[] solution(int[] data, int n) {
      	HashMap<Integer,Integer> m=new HashMap<>();
		        for(int i=0;i<data.length;i++)
		        {
		            if(m.containsKey(data[i]))
		            { 
		            	m.put(data[i],m.get(data[i])+1);
		            	
		            }
		            else
		            {
		                m.put(data[i],1);
		            }
		        }
		       
		         
		     ArrayList<Integer> l=new ArrayList<>();
		     for(int i=0;i<data.length;i++)
			    {
			        if(m.get(data[i])<=n)
			        {
			        l.add(data[i]);
			        }    
			    }
		     int a[]=new int[l.size()];
			    for (int i = 0; i < l.size(); i++)
					a[i] = (Integer) l.get(i);
		    return a;
		        
    }
}
