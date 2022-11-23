package week_9_Recurssion;

public class Equals_Rec
{

	public static void main(String[] args)
	{
		String s1 = "Kiran";
		String s2 = "Kiran";

		boolean result = equal(s1, s2);
		System.out.println(result);
	}

	private static boolean equal(String s1, String s2)
	{
		if (s1.length() != s2.length())
		{
			return false;
		}

		return loop(s1, s2, 0);
	}
	private static boolean loop(String s1, String s2, int i)
	{
		if (i < s1.length())
		{
			if (s1.charAt(i) != s2.charAt(i))
			{
				return false;
			}
			return loop(s1, s2, ++i);
		}
		return true;
	}

}
