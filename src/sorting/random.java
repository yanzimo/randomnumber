package sorting;
import java.util.Random;

public class random {
	public static void main(String [] args)

	{
		int lowerBound = 0;
		int upperBound = 50000;
		Random rand = new Random();
		for (int j = 0; j< 20000; j++)
		{
		int number = lowerBound + (int)(Math.random()*((upperBound-lowerBound)+1));
		
		number ++;
		//for (number= 0; number< uppperBound){
		
		System.out.println(number);
		
		//System.out.println("");
		}
		System.out.println("done");
		}
	
    }
	



