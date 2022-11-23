package week_9_Recurssion;

public class ReverseEveryWord_rec
{
	public static void main(String[] args)
	{
		String s1 = "You all are very very very good students";
		String[] sa = s1.split(" ");
		String newString = "";
		int i = 0;
		newString=iloop(sa, i, newString);
		System.out.println(newString);
	}
	private static String iloop(String[] sa, int i, String newString)
	{
		if (i < sa.length)
		{
			String s2 = sa[i];
			char[] ca = s2.toCharArray();

			int j = 0;
			int k = ca.length - 1;
			rev(ca, j, k);
			String s3 = new String(ca);
			newString += s3 + " ";
			i++;
			return iloop(sa, i, newString);
		}
		return newString;
	}
	private static void rev(char[] ca, int j, int k)
	{
		if (j < k)
		{
			char temp = ca[j];
			ca[j] = ca[k];
			ca[k] = temp;

			j++;
			k--;
			rev(ca, j, k);
		}
	}
}
