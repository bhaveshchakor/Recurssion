package week_9_Recurssion;

public class CompareLexicoStr_rec
{

	public static void main(String[] args)
	{
		String s1 = "abcd";
		String s2 = "abc";

		System.out.println(s1.compareTo(s2));
		System.out.println(myCompare(s1, s2));
	}

	private static int myCompare(String s1, String s2)
	{
		int diff = loopCompare(s1, s2, 0);

		if (diff == 0)
			return s1.length() - s2.length();
		else
			return diff;

	}

	private static int loopCompare(String s1, String s2, int i)
	{
		if (i < s1.length() && i < s2.length())
		{
			if (s1.charAt(i) != s2.charAt(i))
			{
				return s1.charAt(i) - s2.charAt(i);
			}

			return loopCompare(s1, s2, ++i);
		}
		return s1.length() - s2.length();
	}

}
