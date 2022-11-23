package week_9_Recurssion;

public class toLowerCase_rec
{

	public static void main(String[] args)
	{
		String s1="KIRAN KUMAR";
		String s2="";
		s2=iloop(s1,0,s2);
		System.out.println(s2);//kiran kumar
	}

	private static String iloop(String s1, int i, String s2)
	{
		if (i<s1.length())
		{
			char ch=s1.charAt(i);
			if (ch>='A' && ch<='Z')
			{
				s2=s2+(char)(ch+32);
			}
			else {
				s2+=ch;
			}
			return iloop(s1, ++i, s2);
		}
		return s2;
	}

}
