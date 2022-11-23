package week_9_Recurssion;

public class prac_FmaxSmax_rec
{

	public static void main(String[] args)
	{
		int[]a= {1,2,3,4,5,6};
		int max=0;
		int max2=0;
		
		max2=iloop(a,0,max,max2);
		System.out.println(max);
		System.out.println(max2);// 5
	}

	private static int iloop(int[] a, int i, int max, int max2)
	{
		if (i<a.length)
		{
			if (a[i]>max)
			{
				max2=max;
				max=a[i];
			}
			if (a[i]>max2 && a[i]!=max)
			{
				max2=a[i];
			}
			max2=iloop(a, ++i, max, max2);
		}
		return max2;
	}

}
