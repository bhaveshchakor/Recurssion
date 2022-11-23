package week_9_Recurssion;

public class FindEle_Rec
{

	public static void main(String[] args)
	{
		int ele=4;
		int[]a= {1,2,3,4,3,5,4};
		int[]res=new int[2];
		int cnt=0;
		res=iloop(0,a,ele,res,cnt);
		if (res[1]!=0)
		{
			System.out.println("Found at: "+res[0]);
		}
		else {
			System.out.println("Not found");
		}
	}

	private static int[] iloop(int i, int[] a, int ele, int[] res, int cnt)
	{
		if (i<a.length)
		{
			if (a[i]==ele)
			{
				cnt++;
				res[0]=i;
				res[1]=cnt;
				return res;
			}
			
			return iloop(++i, a, ele, res, cnt);
		}
		return res;
	}

}
