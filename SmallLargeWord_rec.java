package week_9_Recurssion;

public class SmallLargeWord_rec
{

	public static void main(String[] args)
	{
		String s = "welcome to java programming";
		String[] sa = s.split(" ");
		int i = 0;
		iloop(sa, i);
		System.out.println("Smallest word: " + sa[0]);
		System.out.println("Largest word: " + sa[sa.length - 1]);
	}

	private static void iloop(String[] sa, int i)
	{
		if (i < sa.length)
		{
			int j = i + 1;
			jloop(sa, i, j);
			iloop(sa, ++i);
		}
	}

	private static void jloop(String[] sa, int i, int j)
	{
		if (j < sa.length)
		{
			if (sa[i].length() > sa[j].length())
			{
				String temp = sa[i];
				sa[i] = sa[j];
				sa[j] = temp;
			}
			jloop(sa, i, ++j);
		}
	}
}
