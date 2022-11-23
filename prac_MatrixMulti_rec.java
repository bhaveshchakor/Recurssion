package week_9_Recurssion;

public class prac_MatrixMulti_rec
{

	public static void main(String[] args)
	{
		int[][] a = { { 1, 2,3 }, { 4,5,6 }, { 7,8,9} };
		int[][] b = { { 1, 2,3 }, { 4,5,6 }, { 7,8,9}};
		
		int[][] c = new int[a.length][b[0].length];
		iloop(a, b, c, 0);
		print(c, 0);
		

	}

	private static void print(int[][] c, int i)
	{
		if (i < c.length)
		{
			print2(c, i, 0);
			System.out.println();
			i++;
			print(c, i);
		}
	}

	private static void print2(int[][] c, int i, int j)
	{
		if (j < c.length)
		{
			System.out.print(c[i][j] + " ");
			j++;
			print2(c, i, j);
		}
	}

	private static void iloop(int[][] a, int[][] b, int[][] c, int i)
	{
		if (i < c.length)
		{
			jloop(a, b, c, i, 0);
			iloop(a, b, c, ++i);
		}
	}

	private static void jloop(int[][] a, int[][] b, int[][] c, int i, int j)
	{
		if (j < c.length)
		{
			kloop(a, b, c, i, j, 0);
			jloop(a, b, c, i, ++j);
		}
	}

	private static void kloop(int[][] a, int[][] b, int[][] c, int i, int j, int k)
	{
		if (k < b.length)
		{
			c[i][j] = c[i][j] + a[i][k] * b[k][j];
			kloop(a, b, c, i, j, ++k);
		}
	}

}
