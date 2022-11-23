package week_9_Recurssion;

public class RemoveDuplicateStr_rec
{

	public static void main(String[] args)
	{
		String s1 = "aabbccdab";
		String s2 = "";

		s2 = iloop(s1, s2, 0);
		System.out.println(s2);
	}

	private static String iloop(String s1, String s2, int i)
	{
		if (i < s1.length())
		{
			if (isUnique(s1, i, 0))
			{
				s2 += s1.charAt(i);
			}
			i++;
			return iloop(s1, s2, i);
		}
		return s2;
	}
	private static boolean isUnique(String s1, int i, int j)
	{
		if (j < i)
		{
			if (s1.charAt(i) == s1.charAt(j))
			{
				return false;
			}

			j++;
			return isUnique(s1, i, j);
		}
		return true;
	}

}
