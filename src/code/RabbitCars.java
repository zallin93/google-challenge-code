package code;

public class RabbitCars 
{
	/* Returns the number of equal train cars */
	public static int answer(int[] x)
	{		
		while(!isDone(x))
		{
			for(int i=0; i < x.length; i++)
			{
				System.out.println("got here");
				for(int j=0;j < x.length; j++)
				{
					if(x[i] == x[j])
					{
						continue;
					}
					if(x[i] > x[j])
					{
						x[i]--;
						x[j]++;
					}
					
				}
			}
		}
		
		int firstCounter = 0;
		int secondCounter = 0;
		
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < x.length; j++)
			{
				if(i == j)
					continue;
				
				if(x[i] == x[j])
				{
					firstCounter++;
				}
			}
			
			if(firstCounter >= secondCounter)
				secondCounter = firstCounter;
			
			firstCounter = 0;
		}
		
		System.out.print("the array values are: ");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + " " );
		}
		System.out.println();
		
		return secondCounter + 1;
	}
	
	public static boolean isDone(int[] x)
	{
		for(int i = 0;i < x.length; i++)
		{
			for(int j = i; j < x.length; j++)
			{
//				if(i == j)
//					continue;
				
				if(Math.abs(x[i] - x[j]) > 1 )
					return false;
				
				// causing infinite loop
				if(Math.abs(x[i] - x[j]) == 1.0 && i != (x.length-1) && j != (x.length-1))
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		int[] ans = {2,3,5,7};
		System.out.println(RabbitCars.answer(ans));
//		System.out.print("the array values are: ");
//		for(int i = 0; i < ans.length; i++)
//		{
//			System.out.print(ans[i] + " " );
//		}
	}

}
