import java.util.*;
class LargeAndSmallElement
{
	static Scanner sc = new Scanner (System.in);
	public static void findLargeAndSmallElement(int []a)
	{
		int min=Integer.MIN_VALUE;

		//Sort array in descending order

		for (int i=0;i<a.length;i++ )
		{
			for (int j=0;j<a.length-1;j++ )
			{
				if (a[j+1]>a[j])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		// Removing duplicates & count

		int count=0;
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[j]==a[i] && a[i] != min)
				{
					a[j]=min;
					count++;
				}
			}
		}

		// Unique element add in a new result array

		int[]res=new int[a.length-count];
		for (int i=0,j=0;i<a.length;i++ )
		{
			if (a[i] != min)
			{
				res[j++]=a[i];
			}
		}
		System.out.println("\nSorted: "+Arrays.toString(res));
		System.out.println("\nFirst Largest Element in an array: "+res[0]);
		System.out.println("\nFirst Smallest Element in an array: "+res[res.length-1]);
	}
	public static void main(String[] args) 
	{
		int[]a={8,5,11,-8,5,59,46,1,2,3,4,7,8,0,46,-8,5};
		System.out.println("\nGiven: "+Arrays.toString(a));

		findLargeAndSmallElement(a);
	}
}
/*
Given: [8, 5, 11, -8, 5, 59, 46, 1, 2, 3, 4, 7, 8, 0, 46, -8, 5]

Sorted: [59, 46, 11, 8, 7, 5, 4, 3, 2, 1, 0, -8]

First Largest Element in an array: 59

First Smallest Element in an array: -8
*/
