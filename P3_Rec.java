package week_9_Recurssion;

public class P3_Rec
{
	public static void main(String[] args)
	{
		int i = 0;
		iloop(i);

	}

	private static void iloop(int i)
	{
		if (i < 5)
		{

			int j = 0;
			jloop(i, j);
			System.out.println();
			i++;
			iloop(i);
		}
	}

	private static void jloop(int i, int j)
	{
		// loop content
		if (j < 5)
		{

			if (j - i <= 0)
			{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			j++;
			jloop(i, j);
		}
	}
}
