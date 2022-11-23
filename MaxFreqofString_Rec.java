package week_9_Recurssion;

public class MaxFreqofString_Rec
{
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args)
	{
		String s = "abacbacdba";
		char ch = 0;
		ch=iloop(0, s, ch);
		System.out.println(ch+" "+max);
	}

	private static char iloop(int i, String s, char ch)
	{
		if (i < s.length())
		{
			int j = 0;
			int cnt = 0;
			cnt = jloop(i, j, s, ch, cnt);
			if (cnt > max)
			{
				max = cnt;
				ch = s.charAt(i);
			}
			return iloop(++i, s, ch);
		}
		return ch;
	}

	private static int jloop(int i, int j, String s, char ch, int cnt)
	{
		if (j < s.length())
		{
			if (s.charAt(i) == s.charAt(j))
			{
				cnt++;
			}
			j++;
			return jloop(i, j, s, ch, cnt);
		}
		return cnt;
	}

}
