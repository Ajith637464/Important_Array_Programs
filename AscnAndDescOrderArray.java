import java.util.*;
class AscnAndDescOrderArray
{
	static Scanner sc = new Scanner (System.in);
	public static void ascnAndDescOrderArray(int []a)
	{
		//Ascending Order

		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a.length-1 ;j++ )
			{
				if (a[j+1]<a[j])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		System.out.println("\nAsce Order: "+Arrays.toString(a));
		//Descending Order

		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a.length-1 ;j++ )
			{
				if (a[j+1]>a[j])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("\nDescen Order: "+Arrays.toString(a));
	}
	public static void main(String[] args) 
	{
		int[]a={10,4,3,5,8,6,11,0,-8,5,7,9,4,6};
		System.out.println("\nGiven: "+Arrays.toString(a));
		ascnAndDescOrderArray(a);
	}
}
/*
Given: [10, 4, 3, 5, 8, 6, 11, 0, -8, 5, 7, 9, 4, 6]

Asce Order: [-8, 0, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 10, 11]

Descen Order: [11, 10, 9, 8, 7, 6, 6, 5, 5, 4, 4, 3, 0, -8]
*/
