package week_9_Recurssion;

public class SumofArrayStaticVariable_Rec
{
	static int sum=0; // it is class variable so it is accessible by all the method of class. and changes made to it will be reflected here 
	static int a[]= {1,2,4,4};
	public static void main(String[] args)
	{
		arraySum(a,0);
		System.out.println(sum);
	}
	private static void arraySum(int[] a, int i)
	{
		if (i<a.length)
		{
			sum+=a[i];
			arraySum(a, ++i);//no need to return any value coz it is adding the value in class variable sum.
		}
		
	}
}
