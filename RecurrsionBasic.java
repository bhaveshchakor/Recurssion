package week_9_Recurssion;

public class RecurrsionBasic
{
	public static void main(String[] args)
	{
		int num = 0;
		m1(num);
	}

	private static void m1(int num)
	{
		if (num < 4)
		{
			System.out.println("hi");
			++num;
			m1(num);
		}
	}
}
