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
	
	public double fibonacciIterative(double position)
	{
		int a = 0;
		int b = 1;
		
		if(position < 0)
		{
			return Double.MIN_VALUE;
		}
		
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else
		{
			for(int index = 0; index < position; index++)
			{
				int nextNumber = a + b;
				a = b;
				b = nextNumber;
			}
		}
		return b;
	}
	
	public double factorialNumber(double position)
	{
		//Bounds check
		if(position < 0)
		{
			return Double.MIN_VALUE;
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
	
	public double factorialIterative(double position)
	{
		if(position < 0)
		{
			return Double.MIN_VALUE;
		}
		
		double result = 1;
		
		for(int index = 1; index <= position; index++)
		{
			result = result * index;
		}
		
		return result;
	}
}
