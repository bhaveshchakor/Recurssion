package week_9_Recurssion;

import java.util.Arrays;

public class RemoveDuplicate_Rec
{
	public static void main(String[] args)
	{
		int[] a = { 1, 2, 4, 4, 2, 1 };
		int unc = 0;
		int i = 0;
		unc = iloop(i, a, unc);

		int[] b = new int[unc];
		int bindex = 0;
		int i1 = 0;
		iloop2(a, b, i1, bindex);

		System.out.println(Arrays.toString(b));

	}

	private static void iloop2(int[] a, int[] b, int i, int bindex)
	{
		if (i < a.length)
		{
			int cnt = 0;
			int j = 0;
			cnt = jloop2(a, i, j, cnt);
			if (cnt == 0)
			{
				b[bindex++] = a[i];
			}
			i++;
			iloop2(a, b, i, bindex);
		}
	}

	private static int jloop2(int[] a, int i, int j, int cnt)
	{
		if (j < i)
		{
			if (a[i] == a[j])
			{
				cnt++;
				return cnt;
			}

			j++;
			return jloop2(a, i, j, cnt);
		}
		return cnt;
	}

	private static int iloop(int i, int[] a, int unc)
	{
		if (i < a.length)
		{
			int cnt = 0;
			int j = 0;
			cnt = jloop(a, i, j, cnt);
			if (cnt == 0)
			{
				unc++;
			}
			i++;
			return iloop(i, a, unc);
		}
		return unc;
	}

	private static int jloop(int[] a, int i, int j, int cnt)
	{
		if (j < i)
		{
			if (a[i] == a[j])
			{
				cnt++;
				return cnt;
			}
			j++;
			return jloop(a, i, j, cnt);
		}
		return cnt;

	}
}
