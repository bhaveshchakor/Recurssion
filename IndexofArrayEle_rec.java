package week_9_Recurssion;

public class IndexofArrayEle_rec
{
	public static void main(String[] args)
	{
		char[] a = { 'a', 'b', 'c', 'd' };

		int i = 0;
		iloop(i, a);

	}

	private static void iloop(int i, char[] a)
	{
		if (i < a.length)
		{
			System.out.println(i + " " + a[i]);
			i++;
			iloop(i, a);
		}
	}
}
