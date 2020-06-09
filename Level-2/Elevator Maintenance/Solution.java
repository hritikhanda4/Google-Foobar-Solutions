import java.util.Arrays;
public class Solution {
    //Split function for spliting versions in a string into a string array
	public static String[] split(String s)
	{
		int j=0;
		String a[]= {"-1","-1","-1"};
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)=='.')
			{
				a[j]=temp;
				
				temp="";
				j++;
			}
			else
				temp+=s.charAt(i);
		}
		a[j]=temp;
		return a;
	}

    public static String[] solution(String[] l) {
    	String output[]=new String[l.length];
    	//a array for splitted versions of versions in list l
    	String a[][]= new String[l.length][3];
    	//filling array with -1 which will be used as exit condition later
		for (String[] row : a) { 
             Arrays.fill(row, "-1");  
        } 
        //spliting the list l
		for(int i=0;i<l.length;i++)
			a[i]=Solution.split(l[i]);
		//a_int is a integer version of array a
		int a_int[][]=new int[l.length][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a_int[i][j]=Integer.parseInt(a[i][j]);
			}
			
		}
		//Sorting
		for(int k=0;k<3;k++) {
			
		for(int i=a_int.length-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				
				boolean r=false;
				//Sorting on the basis of column 1
				if(k==0)
					r=true;
					
				//Sorting on the basis of column 2
				else if(k==1)
				{
					if(a_int[j][0]==a_int[j+1][0])
						r=true;
				}
				
				//Sorting on the basis of column 2
				else if(k==2)
				{
					if(a_int[j][0]==a_int[j+1][0]&&a_int[j][1]==a_int[j+1][1])
						r=true;
				}
				
				if(r) {
				if(a_int[j][k]>a_int[j+1][k])
				{
					int temp=a_int[j][0];
					a_int[j][0]=a_int[j+1][0];
					a_int[j+1][0]=temp;
					
					temp=a_int[j][1];
					a_int[j][1]=a_int[j+1][1];
					a_int[j+1][1]=temp;
					
					temp=a_int[j][2];
					a_int[j][2]=a_int[j+1][2];
					a_int[j+1][2]=temp;
				}
			}
			}
		}
		}
    //joining the sorted verions
		for(int i=0;i<a_int.length;i++)
		{
			output[i]="";
			for(int j=0;j<3;j++)
			{
				if(a_int[i][j]!=-1)
				{	
					
					String temp=Integer.toString(a_int[i][j]);
					output[i]=output[i]+temp;
					if(j<2) {
					if(a_int[i][j+1]!=-1)
					output[i]=output[i]+".";	
				}}
			    
				else
				
					break;
			}
                
			}
		
    	return output;
        
    }
}

