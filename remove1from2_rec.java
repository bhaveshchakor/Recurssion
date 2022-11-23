package week_9_Recurssion;

public class remove1from2_rec
{
	public static void main(String[] args)
	{
		int[] a = { 1, 1, 1, 1, 1, 2, 2, 3, 4, 4, 4 };
		int[] b = { 1, 2, 4 };

		a = iloop(a, b, 0);
		print(a, 0);

	}
	private static void print(int[] a, int i)
	{
		if (i < a.length)
		{
			System.out.print(a[i] + " ");
			print(a, ++i);
		}
	}
	private static int[] iloop(int[] a, int[] b, int i)
	{
		if (i < b.length)
		{

			int cnt = 0;
			cnt = jloop(a, b, i, 0, cnt);

			int[] c = new int[a.length - cnt];
			int count = 0;
			int index = 0;

			jloop2(a, b, c, i, 0, count, index);
			a = c;

			return iloop(a, b, ++i);
		}
		return a;
	}
	private static void jloop2(int[] a, int[] b, int[] c, int i, int j, int count, int index)
	{
		if (j < a.length)
		{

			if (b[i] == a[j] && count < 2)
			{
				count++;
			}
			else
			{
				c[index++] = a[j];
			}
			jloop2(a, b, c, i, ++j, count, index);
		}
	}
	private static int jloop(int[] a, int[] b, int i, int j, int cnt)
	{
		if (j < a.length)
		{
			if (b[i] == a[j] && cnt < 2)
			{
				cnt++;
			}
			return jloop(a, b, i, ++j, cnt);
		}
		return cnt;
	}
}
