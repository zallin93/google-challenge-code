package code;

public class Pirates 
{
   
    public static int answer(int[] numbers) 
    { 

    	// used to keep track of what's been hit
        int[] num2 = new int[numbers.length];
        
        for(int i = 0; i < num2.length; i ++)
        {
        	num2[i] = 0;
        }
        
        int j = 0;
        int counter = 0;
        
        while(num2[j] != 1)
        {
        	num2[j] = 1;
        	j = numbers[j];
        }
        
        while(num2[j] != 0)
        {
        	num2[j] = 0;
        	j = numbers[j];
        	counter++;
        }
      
        return counter;
    } 
}
