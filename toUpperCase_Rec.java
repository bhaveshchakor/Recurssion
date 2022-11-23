package week_9_Recurssion;

public class toUpperCase_Rec
{

	public static void main(String[] args)
	{
		String s = "Hefshine"; 
		int i = 0;
		s = toUpper(s, "", i);//Object not changed. s is now pointing new string. original string is present in scp which will be garbaged.
		System.out.println(s);//HEFSHINE
	}

	private static String toUpper(String s, String s2, int i)
	{
		if (i < s.length())
		{
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z')
			{
				ch = (char) (ch - 32);
			}
			s2 += ch;
			i++;
			return toUpper(s, s2, i);
		}
		return s2;
	}

}
