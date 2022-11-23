package week_9_Recurssion;

public class SumOfArray_Rec
{
public static void main(String[] args)
{
	int a[]= {1,2,4,4};
	int i=0;
	int sum=0;
	System.out.println("sum: "+arraySum(a,i,sum));
}

private static int arraySum(int[] a, int i, int sum)
{
	if (i<a.length)
	{
		sum+=a[i];
		i++;
		return arraySum(a, i, sum);
		
	}
	return sum;
}
}
