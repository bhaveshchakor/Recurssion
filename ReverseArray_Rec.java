package week_9_Recurssion;

public class ReverseArray_Rec
{
	public static void main(String[] args)
	{
		int[] a = { 1, 2, 3, 4, 5 };
		int i = 0;
		int j = a.length - 1;
		a = jloop(i, j, a, 0);

		System.out.println("\n" + "After reverse: ");
		for (int ele : a)
		{
			System.out.print(ele + " ");
		}
	}

	private static int[] jloop(int i, int j, int[] a, int j2)
	{
		if (j2 < a.length)
		{
			while (i < j)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
			return jloop(i, j, a, ++j2);
		}
		return a;
	}
}
