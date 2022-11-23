package week_9_Recurssion;


public class ContainSpecificVal_Rec
{

	public static void main(String[] args)
	{
		int[] a = { 45, 22, 15, 87, 65, 59 };
		int ele = 59;
		int cnt = 0;
		int i = 0;
		boolean ans = iloop(i, a, cnt, ele);
		System.out.println(ans);

	}

	private static boolean iloop(int i, int[] a, int cnt, int ele)
	{
		if (i < a.length)
		{
			if (a[i] == ele)
			{
				return true;
			}
			return iloop(++i, a, cnt, ele);
		}
		return false;
	}

}
