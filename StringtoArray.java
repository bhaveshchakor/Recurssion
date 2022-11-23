package week_9_Recurssion;

public class StringtoArray
{
	public static void main(String[] args)
	{
		String s="Hefshine";
		char []ca=new char[s.length()];
		int i=0;
		rec(s,ca,i);
		print(ca,i);
		
	}

	
	private static void rec(String s, char[] ca, int i)
	{
		if (i<ca.length)
		{
			ca[i]=s.charAt(i);
			
			rec(s, ca, ++i);
		}
	}
	
	private static void print(char[] ca, int i)
	{
		if (i<ca.length)
		{
			System.out.print(ca[i]+" ");
			
			print(ca, ++i);
		}
	}
}
