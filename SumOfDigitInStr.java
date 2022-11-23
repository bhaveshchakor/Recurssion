package week_9_Recurssion;

public class SumOfDigitInStr
{

	public static void main(String[] args)
	{
		String s1="c1h2e3t4a5n";
		int sum=0;
		sum=iloop(s1,0,sum);
		System.out.println(sum);
	}

	private static int  iloop(String s1, int i, int sum)
	{
		if (i<s1.length())
		{
			if (s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
			sum+=(s1.charAt(i)-48);	
			}
			return iloop(s1, ++i, sum);
		}
		return sum;
	}

}
