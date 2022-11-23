package week_9_Recurssion;

public class EqualityofTwoArray_rec
{
	public static void main(String[] args)
	{
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 10, 20, 30, 40 };
		int i = 0;
		int cnt = 0;
		boolean ans = isEqualArrray(i, a, b, cnt);
		System.out.println(ans);

	}

	private static boolean isEqualArrray(int i, int[] a, int[] b, int cnt)
	{
		if (a.length != b.length)
		{
			return false;
		}
		if (i < a.length)
		{
			if (a[i] != b[i])
			{
				return false;
			}
			i++;
			return isEqualArrray(i, a, b, cnt);
		}
		return true;

	}

}
