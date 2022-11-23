package week_9_Recurssion;

public class MaxFreqStr_AC
{

	public static void main(String[] args)
	{
		String s = "abacbacdba";
		int max = Integer.MIN_VALUE;
		char ch = 0;
		int[] temp = new int[2];
		iloop(s, 0, max, ch, temp);
		System.out.println((char)(temp[1])+" "+temp[0]);
	}

	private static void iloop(String s, int i, int max, char ch, int[] temp)
	{
		if (i < s.length())
		{
			int cnt = 0;
			cnt = jloop(s, i, 0, cnt);
			if (cnt == 0)
			{
				int count = 0;
				count = jloop2(s, i, 0, count);
				if (count>max)
				{
					max=count;
					ch=s.charAt(i);
				}
			}
			
			iloop(s, ++i, max, ch, temp);
		}
		temp[0]=max;
		temp[1]=ch;
	}

	private static int jloop2(String s, int i, int j, int count)
	{
		if (j < s.length())
		{
			if (s.charAt(i) == s.charAt(j))
			{
				count++;
			}

			return jloop2(s, i, ++j, count);
		}
		return count;
	}
	private static int jloop(String s, int i, int j, int cnt)
	{
		if (j < i)
		{
			if (s.charAt(i) == s.charAt(j))
			{
				cnt++;
			}

			return jloop(s, i, ++j, cnt);
		}
		return cnt;
	}

}
