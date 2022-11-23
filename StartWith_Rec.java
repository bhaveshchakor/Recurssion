package week_9_Recurssion;

public class StartWith_Rec
{

	public static void main(String[] args)
	{
		String s1 = "Chetan";
		String s2 = "Ch";
		boolean ans = false;
		ans = iloop(s1, s2, 0, ans);
		System.out.println(ans);
	}

	private static boolean iloop(String s1, String s2, int i, boolean ans)
	{
		if (s2.length() > s1.length())
		{
			return false;
		}
		else if (i < s2.length())
		{
			if (s1.charAt(i) != s2.charAt(i))
			{
				return false;
			}

			return iloop(s1, s2, ++i, ans);
		}
		return true;

	}

}
