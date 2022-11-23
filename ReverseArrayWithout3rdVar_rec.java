package week_9_Recurssion;

import java.util.Arrays;

public class ReverseArrayWithout3rdVar_rec
{

	public static void main(String[] args)
	{
		int[] a = { 1, 2, 3, 4, 5 };
		int i = 0;
		int j = a.length - 1;
		a = kloop(i, j, a, 0);
		System.out.println(Arrays.toString(a));

	}

	private static int[] kloop(int i, int j, int[] a, int k)
	{
		if (k < a.length)
		{
			while (i < j)
			{

				a[i] = a[i] + a[j];
				a[j] = a[i] - a[j];
				a[i] = a[i] - a[j];
				i++;
				j--;
			}

			k++;
			return kloop(i, j, a, k);

		}
		return a;
	}
}