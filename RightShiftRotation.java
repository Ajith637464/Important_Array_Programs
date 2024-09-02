import java.util.*;
class RightShiftRotation
{
	static Scanner sc = new Scanner (System.in);
	public static int[] rightShiftRotation(int []a,int n)
	{
		for (int i=1;i<=n ;i++)
		{
			int first=a[0];
			for (int j=0;j<a.length-1 ;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int[]a={10,9,1,0,2,3,4,6,6};
		System.out.println("\nGiven: "+Arrays.toString(a));
		System.out.println("Enter the n value: ");
		int n=sc.nextInt();

		int[]res=rightShiftRotation(a,n);
		System.out.println("\nOutput: "+Arrays.toString(res));
	}
}
/*
Given: [10, 9, 1, 0, 2, 3, 4, 6, 6]

Enter the n value: 2

Output: [1, 0, 2, 3, 4, 6, 6, 10, 9]
*/
