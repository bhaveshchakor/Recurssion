package week_9_Recurssion;

public class SumnAvgOfArrayEle_rec
{

	public static void main(String[] args)
	{
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int sum=0;
		int i=0;
		sum=iloop(i,a,sum);
		double avg=sum/a.length;
		System.out.println(sum+" "+avg);
	}

	private static int iloop(int i, int[] a, int sum)
	{
		if (i<a.length)
		{
			sum+=a[i];
			return iloop(++i, a, sum);
		}
		return sum;
	}

}
