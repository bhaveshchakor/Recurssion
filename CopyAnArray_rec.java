package week_9_Recurssion;

public class CopyAnArray_rec
{
	public static void main(String[] args)
	{
		int[] a = { 10, 5, 4, 1, 7, 9 };
		int[] b = new int[a.length];

		int i = 0;
		b = iloop(i, a, b);
		print(0,b);
	}

	private static int[] iloop(int i, int[] a, int[] b)
	{
		if (i < a.length)
		{
			b[i]=a[i];
			return iloop(++i, a, b);
		}
		return b;
	}
	private static void print (int i, int[] b)
	{
		if (i < b.length)
		{
			System.out.println(b[i]+" ");
			i++;
			 print(i, b);
		}
		
	}
	
}
