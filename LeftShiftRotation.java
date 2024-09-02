import java.util.*;
class LeftShiftRotation
{
	static Scanner sc = new Scanner (System.in);
	public static int[] leftShiftRotation(int []a,int n)
	{
		for (int i=1;i<=n;i++)
		{
			int first=a[a.length-1];
			for (int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=first;
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int[]a={10,9,1,0,2,3,4,6,6};
		System.out.println("\nGiven: "+Arrays.toString(a));
		System.out.print("Enter the n value: ");
		int n=sc.nextInt();

		int[]res=leftShiftRotation(a,n);
		System.out.println("\nOutput: "+Arrays.toString(res));
	}
}
/*
Given: [10, 9, 1, 0, 2, 3, 4, 6, 6]

Enter the n value: 2

Output: [6, 6, 10, 9, 1, 0, 2, 3, 4]
*/
