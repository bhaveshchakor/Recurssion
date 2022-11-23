package week_9_Recurssion;

public class EndsWith
{

	public static void main(String[] args)
	{
		String s1 = "Chetan";
		String s2 = "";

		int i = s1.length() - 1;
		int j = s2.length() - 1;
		boolean ans = false;
		ans = iloop(s1, s2, i, j, ans);
		System.out.println(ans);
	}

	private static boolean iloop(String s1, String s2, int i, int j, boolean ans)
	{
		if (i >= 0 && j >= 0)
		{
			if (s2.length() > s1.length())
			{
				return false;
			}
			else
			{
				if (s1.charAt(i) != s2.charAt(j))
				{
					return false;
				}
			}
			return iloop(s1, s2, --i, --j, ans);
		}
		return true;
	}

}
