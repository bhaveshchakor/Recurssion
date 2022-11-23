package week_9_Recurssion;

public class prac_freq
{

	public static void main(String[] args)
	{
		String s1 = "welcome";
		int min = 9999;
		char[] ch = new char[1];
		min = iloop(s1, 0, min, ch);
		System.out.println(min);
		System.out.println(ch[0]);
	}

	private static int iloop(String s1, int i, int min, char[] ch)
	{
		if (i < s1.length())
		{
			int cnt = 0;
			cnt = jloop(s1, i, 0, cnt);
			if (cnt ==0)
			{
				int freq=0;
				freq=jloop2(s1,i,0,freq);
				if (freq<min)
				{
					min=freq;
					ch[0]=s1.charAt(i);
				}
			}
			
			return iloop(s1, ++i, cnt, ch);
		}
		return min;
	}

	private static int jloop2(String s1, int i, int j, int freq)
	{
		if (j<s1.length())
		{
			if (s1.charAt(i)==s1.charAt(j))
			{
				freq++;
			}
			
			return jloop2(s1, i, ++j, freq);
		}
		return freq;
	}

	private static int jloop(String s1, int i, int j, int cnt)
	{
		if (j < i)
		{
			if (s1.charAt(i) == s1.charAt(j))
			{
				cnt++;
			}
			
			return jloop(s1, i, ++j, cnt);
		}
		return cnt;

	}

}
