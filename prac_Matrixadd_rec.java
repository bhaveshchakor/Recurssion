package week_9_Recurssion;

public class prac_Matrixadd_rec
{

	public static void main(String[] args)
	{
		int[][] a = { { 1, 2 }, 
				      { 3, 4 } };
		int[][] b = { { 1, 2 }, 
				      { 3, 4 } };

		int[][] sum = new int[a.length][b.length];
		iloop(a, b, sum, 0);
		print(sum,0);

	}

	private static void print(int[][] sum, int i)
	{
		if (i<sum.length)
		{
			print2(sum,i,0);
			System.out.println();
			print(sum, ++i);
		}
	}

	private static void print2(int[][] sum, int i, int j)
	{
		if (j<sum.length)
		{
			System.out.print(sum[i][j]+" ");
			print2(sum, i, ++j);
		}
	}

	private static void iloop(int[][] a, int[][] b, int[][] sum, int i)
	{
		if (i < a.length)
		{
			jloop(a, b, sum, i, 0);
			iloop(a, b, sum, ++i);
		}

	}

	private static void jloop(int[][] a, int[][] b, int[][] sum, int i, int j)
	{
		if (j < b.length)
		{
			sum[i][j] = a[i][j] + b[i][j];
			jloop(a, b, sum, i, ++j);
		}
	}

}
