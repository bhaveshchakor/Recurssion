
package week_9_Recurssion;

public class Prac_saddlepoint
{

	public static void main(String[] args)
	{
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		iloop(a, 0);
	}

	private static void iloop(int[][] a, int i)
	{
		if (i < a.length)
		{
			jloop(a, i, 0);
			i++;
			iloop(a, i);
		}
	}

	private static void jloop(int[][] a, int i, int j)
	{
		if (j < a[i].length)
		{
			boolean smallinrow = true;
			smallinrow = rowloop(a, i, j, 0, smallinrow);
			Boolean maxincol = true;
			maxincol = colloop(a, i, j, 0, maxincol);
			if (smallinrow && maxincol)
			{
				System.out.println(a[i][j]);
				
			}
			j++;
			jloop(a, i, j);
		}
	}

	private static Boolean colloop(int[][] a, int i, int j, int k, boolean maxincol)
	{
		if (k<a.length)
		{
			if (a[i][j] < a[k][j])
			{
				return false;
			}
			k++;
			return colloop(a, i, j, k, maxincol);
		}
		return maxincol;
	}

	private static boolean rowloop(int[][] a, int i, int j, int k, boolean smallinrow)
	{
		if (k < a.length)
		{
			if (a[i][j] > a[i][k])
			{
				return false;
			}
			return rowloop(a, i, j, ++k, smallinrow);
		}
		return smallinrow;
	}

}
