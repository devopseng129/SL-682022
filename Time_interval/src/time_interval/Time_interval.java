package time_interval;


public class Time_interval 
{
	

	public static void main(String[] args) 
	{
		int i;
		for(i=1;i<=5;i++) 
		{
			System.out.println(i);
			try 
			{
				Thread.sleep(5000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	
		

	}

}
