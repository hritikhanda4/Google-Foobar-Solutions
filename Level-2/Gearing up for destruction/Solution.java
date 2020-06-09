class Solution {
    public static int[] solution(int[] pegs) {
        int arr[]=new int[2];  
    	if(pegs.length<=1)
    	{
    		arr[0]=-1;
    		arr[1]=-1;
    		return arr;
    	}
		int n=pegs.length;
		int r=0,a,b=1,p,sign;
		for(int i=0;i<n;i++)
		{
			if(n%2!=0)
			{
				a=2;
				b=1;
			}
			else
			{
				a=2;
				b=3;
			}
			if(i%2==0)
			    sign=-1;
			else
				sign=1;
			if(i>0&&i<n-1)
				p=2;
			else
				p=1;
			r+=a*(sign*p*pegs[i]);
		}
		if(r<=0)
		{
    		arr[0]=-1;
    		arr[1]=-1;
    		return arr;
    	}
		System.out.println(r);
		if(r%b==0)
			{
			r=r/b;
			b=1;
			}
		arr[0]=r;
		arr[1]=b;
		float currentRadius=r/b;
		for (int i=0;i<pegs.length-2;i++)
		{
	      float CenterDistance = pegs[i+1]-pegs[i];
	      float NextRadius = CenterDistance-currentRadius;
	      if(currentRadius <= 0 || NextRadius< 1)
	      {
	    	  arr[0]=-1;
	    	  arr[1]=-1;
	    	  return arr;  
	      }
	       else
	       {
	            currentRadius = NextRadius;
			}
		}
		return arr;
    }
}