package week_9_Recurssion;

public class PrimeNo_rec
{

	public static void main(String[] args)
	{
		int num = 10;
		int cnt = 0;
		cnt = iloop(num, cnt, 2);
		if (cnt == 0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}

	private static int iloop(int num, int cnt, int i)
	{
		if (i < num)
		{
			if (num % i == 0)
			{
				cnt++;
			}

			cnt = iloop(num, cnt, ++i);
		}
		return cnt;
	}

}
