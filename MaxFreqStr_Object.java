package week_9_Recurssion;

public class MaxFreqStr_Object
{

	public static void main(String[] args)
	{
		String s = "abacbacdba";
		int max = Integer.MIN_VALUE;
		char ch = 0;
		Pair pair = null;
		pair = iloop(s, 0, max, ch);
		System.out.println(pair.ch + " " + pair.max);
	}

	private static Pair iloop(String s, int i, int max, char ch)
	{
		if (i < s.length())
		{
			int cnt = 0;
			cnt = jloop(s, i, 0, cnt);
			if (cnt == 0)
			{
				int count = 0;
				count = jloop2(s, i, 0, count);
				if (count > max)
				{
					max = count;
					ch = s.charAt(i);
				}
			}

			return iloop(s, ++i, max, ch);
		}
		Pair pair = new Pair(max, ch);
		return pair;
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

class Pair
{
	int max = 0;
	char ch = 0;
	public Pair(int max, char ch)
	{
		this.max = max;
		this.ch = ch;
	}
}
