import java.math.*;

public class Answer { 
	static int val = 0;
	public static int answer(int x) { 
	
		int y=0;
		
		if(x>0)
		{
			y =(int) Math.pow(7, x);
			x--;
			//return val + answer(x);
		}
		else
			return 1;
		
		return y + answer(x);
	}
	
	public static void main(String[] args)
	{
		System.out.println(Answer.answer(2));
	}
}
