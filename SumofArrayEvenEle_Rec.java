package week_9_Recurssion;

public class SumofArrayEvenEle_Rec
{

	public static void main(String[] args)
	{
		int a[] = { 6, 4, 2, 5, 6, 5,3,2};
		int sum = 0;
		sum = arraySum(a, 0, sum);
		System.out.println(sum);

	}

	private static int arraySum(int[] a, int i, int sum)
	{
		if (i < a.length)
		{
			if (a[i] % 2 == 0)
			{
				sum += a[i];
			}

			return arraySum(a, ++i, sum);

		}
		return sum;
	}

}
