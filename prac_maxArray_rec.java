package week_9_Recurssion;

public class prac_maxArray_rec
{

	public static void main(String[] args)
	{
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int max=0;
		max=iloop(0,a,max);
		System.out.println(max);
	}

	private static int iloop(int i, int[][] a, int max)
	{
		if (i<a.length)
		{
			max=jloop(i,0,a,max);
			i++;
			max=iloop(i, a, max);
		}
		return max;
	}

	private static int jloop(int i, int j, int[][] a, int max)
	{
		if (j<a.length)
		{
			if (a[i][j]>max)
			{
				max=a[i][j];
			}
			j++;
			return jloop(i, j, a, max);
		}
		return max;
		
	}

}
