package ctec.model;

public class Timer
{
	private long executionTime;
	
	public Timer()
	{
		this.executionTime = 0;
	}
	
	public void startTimer()
	{
		this.executionTime = System.nanoTime();
	}
	
	public void stopTimer()
	{
		this.executionTime = System.nanoTime() - executionTime;
	}
	
	public void resetTimer()
	{
		this.executionTime = 0;
	}

	public long getExecutionTime()
	{
		return executionTime;
	}
	
	public String toString()
	{
		String timerDescription = "The current execution time is: " + this.executionTime + " nanoseconds.";
		
		return timerDescription;
	}
}
