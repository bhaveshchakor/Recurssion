package week_9_Recurssion;

public class GetCharAtIndex
{

	public static void main(String[] args)
	{
		String s1="Welcometojava";
		int index=11;
		char ch=0;
		ch=iloop(s1,0,index,ch);
		System.out.println(ch);
	}

	private static char iloop(String s1, int i, int index,char ch)
	{
		if (i<s1.length())
		{
			if (i==index)
			{
				return s1.charAt(i);
			}
			
			return iloop(s1, ++i, index, ch);
		}
		return ch;
	}

}
