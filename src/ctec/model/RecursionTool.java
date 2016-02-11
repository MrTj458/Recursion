package ctec.model;

public class RecursionTool
{
	public RecursionTool()
	{
		
	}
	
	public double fibonacciNumber(double position)
	{
		//Bounds check
		if(position < 0)
		{
			return Double.MIN_VALUE;
		}
		
		//Base case
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else //recursive case
		{
			return fibonacciNumber(position - 1) + fibonacciNumber(position - 2);
		}
	}
	
	public double factorialNumber(double position)
	{
		//Bounds check
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		if(position == 0)
		{
			return 1;
		}
		else
		{
			return position * factorialNumber(position - 1);
		}
	}
}
