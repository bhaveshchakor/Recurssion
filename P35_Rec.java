package week_9_Recurssion;

public class P35_Rec
{
	//static int cnt=65;
	public static void main(String[] args)
	{
		int cnt=65;
		int i = 0;
		cnt=iloop(i,cnt);
	}

	private static int iloop(int i,int cnt)
	{
		if (i < 5)
		{
			int j = 0;
			cnt=jloop(i, j,cnt);
			System.out.println();
			return iloop(++i,cnt);
		}
		return cnt;
	}

	private static int jloop(int i, int j, int cnt)
	{
		if (j < 5)
		{
			if (j-i<=0)
			{
				System.out.print((char)(cnt++));
			}
			else {
				System.out.print(" ");
			}
			j++;
			return jloop(i, j,cnt);
		}
		return cnt;
	}
}
/*
A
BC
DEF
GHIJ
KLMNO*/