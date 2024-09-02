import java.util.*;
class ReplaceElementsWithRank
{
	static Scanner sc = new Scanner (System.in);
	public static int[] replaceElementsWithRank(int []a)
	{
		int b[]=new int[a.length];
		
		for (int i=0;i<a.length;i++)
		{
			int max=Integer.MIN_VALUE;
			for (int j=0;j<a.length ;j++ )
			{
				if (a[j]>max)
				{
					max=a[j];
				}
			}
			for (int k=0;k<a.length ;k++ )
			{
				if (a[k]== max && max != Integer.MIN_VALUE)
				{
					b[k]=i+1;
					a[k]=Integer.MIN_VALUE;
				}
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		int[]a={10,9,1,0,2,3,4,6,6};
		System.out.println("\nGiven: "+Arrays.toString(a));
		int[]res=replaceElementsWithRank(a);
		System.out.println("\nOutput: "+Arrays.toString(res));
	}
}
/*
Given: [10, 9, 1, 0, 2, 3, 4, 6, 6]

Output: [1, 2, 7, 8, 6, 5, 4, 3, 3]

*/
