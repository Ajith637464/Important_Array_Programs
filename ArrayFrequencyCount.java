import java.util.*;
class ArrayFrequencyCount
{
	static Scanner sc = new Scanner (System.in);
	public static void arrayFrequencyCount(int []a)
	{
		int min=Integer.MIN_VALUE;
		for (int i=0;i<a.length ;i++ )
		{
			int count=1;
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[i]==a[j] && a[i] != min)
				{
					count++;
					a[j]=min;
				}
			}
			if (a[i] != min)
			{
				System.out.println(a[i]+" : "+count);
			}
		}
	}
	public static void main(String[] args) 
	{
		int[]a={0,1,5,6,4,2,3,4,5,4,2,3,1,2,2,6,4,1};
		arrayFrequencyCount(a);
	}
}
/*
Given: [1, 2, 3, 4, 5, 6, 7, 8, 9]

Output: [9, 8, 7, 6, 5, 4, 3, 2, 1]
*/
