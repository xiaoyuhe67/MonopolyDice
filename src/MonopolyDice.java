import java.util.Random;

public class MonopolyDice {
	
	public static void main(String[] args)
	{
		int time=0;
		int num1 = 0;
		int num2 =0;
		
		Random rand = new Random();

		
		while (time<=3)
		{
			num1=rand.nextInt(6)+1;
			num2=rand.nextInt(6)+1;
			
			if(num1!=num2)
			{
				System.out.println("User rolls "+num1+" & "+num2);
				System.out.println("Move "+ (num1+num2) +" Spaces and stop");
				break;
			}
			else
			{
				time=time+1;
				
				System.out.println("User rolls "+num1+" & "+num2);
				
				System.out.println("Doubles!");		
				
				if (time==3)
				{
					System.out.println("Go to jail!");
				}
				else
				{
					System.out.println("Move "+(num1+num2)+" Spaces and roll again getting...");
				}
			}
			
			
			
		}
		
		
	}

}
