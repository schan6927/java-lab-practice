import java.util.Scanner;

class OutOfRangeException extends RuntimeException {}
class AddZeroException extends RuntimeException {}
class SubtractZeroException extends RuntimeException {}


class Calculate
{
	public void range(int a) throws OutOfRangeException
	{
		if(a < 0 || a > 1000)
		{
			throw new OutOfRangeException();
		}
	}
	public int addition(int a, int b) throws AddZeroException
	{
		if(a==0 || b==0)
		{
			throw new AddZeroException();
		}
		return a+b;
	}
	public int subtraction(int a, int b) throws SubtractZeroException
	{
		if(a==0 || b==0)
		{
			throw new SubtractZeroException();
		}
		return a-b;
	}
	
}


public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		Calculate c = new Calculate();
		
		
		
		int num_1 = 0;
		int num_2 = 0;
		int result = 0;
		
		try
		{
			if(str.contains("+"))
			{
				num_1 = Integer.valueOf(str.split("\\+")[0]);
				num_2 = Integer.valueOf(str.split("\\+")[1]);
				result = c.addition(num_1, num_2);
				c.range(num_1);
				c.range(num_2);
				c.range(result);
			}
			else
			{
				num_1 = Integer.valueOf(str.split("-")[0]);
				num_2 = Integer.valueOf(str.split("-")[1]);
				result = c.subtraction(num_1, num_2);
				c.range(num_1);
				c.range(num_2);
				c.range(result);
				
			}
			System.out.println(result);
		}
		catch (OutOfRangeException e)
		{
			System.out.println("OutOfRangeException");
		}
		catch(AddZeroException e)
		{
			System.out.println("AddZeroException");
			
		}
		catch(SubtractZeroException e)
		{
			System.out.println("SubtractZeroException");
			
		}
	}

}
