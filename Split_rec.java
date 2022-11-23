package week_9_Recurssion;

public class Split_rec
{

	public static void main(String[] args)
	{
		String s1 = "abc cde efg ghi";
		char ch = ' ';
		int cnt = 0;
		cnt = iloop(s1, 0, cnt, ch);
		String[] sa = new String[cnt + 1];
		int index=0;
		String temp = "";
		sa=splitMethod(s1, ch, sa, 0,index,temp);
		String newString="";
		for (int i = 0; i < sa.length; i++)
		{
			if (i<sa.length-1)
			{
				newString+=sa[i]+", ";
			}
			else {
				newString+=sa[i];
			}
		}
		System.out.println(newString);

	}

	private static int iloop(String s1, int i, int cnt, char ch)
	{
		if (i < s1.length())
		{
			if (s1.charAt(i) == ch)
			{
				cnt++;
			}

			cnt= iloop(s1, ++i, cnt, ch);
		}
		return cnt;
	}
	private static String[] splitMethod(String s1, char ch, String[] sa, int i, int index,String temp)
	{
		
		
		if (i < s1.length())
		{
			
			if (s1.charAt(i) != ch)
			{
				temp += s1.charAt(i);
			}
			else if(s1.charAt(i)==ch)
			{
				sa[index++] = temp;
				temp = "";
			}
			if (i==s1.length()-1)
			{
				sa[index++]=temp;
			}

			return splitMethod(s1, ch, sa, ++i, index, temp);
		}
		return sa;
	}

}
