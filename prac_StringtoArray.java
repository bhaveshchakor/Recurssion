package week_9_Recurssion;

public class prac_StringtoArray
{

	public static void main(String[] args)
	{
		String s1="Hello";
		char[]ch=new char[s1.length()];
		iloop(s1,0,ch);
		print(ch,0);
		
	}

	private static void print(char[] ch, int i)
	{
		if (i<ch.length)
		{
			System.out.print(ch[i]+" "); //H e l l o 
			print(ch, ++i);
		}
	}

	private static void iloop(String s1, int i, char[] ch)
	{
		if (i<s1.length())
		{
			ch[i]=s1.charAt(i);
			iloop(s1, ++i, ch);
		}
	}

}
