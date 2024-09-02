import java.util.*;
class ReverseArray //Without creating New array
{
	static Scanner sc = new Scanner (System.in);
	public static int[] reverseArray(int []a)
	{
		int start=0;
		int end=a.length-1;
		while (start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4,5,6,7,8,9};
		System.out.println("\nGiven: "+Arrays.toString(a));
		int[]res=reverseArray(a);
		System.out.println("\nOutput: "+Arrays.toString(res));
	}
}
/*
Given: [1, 2, 3, 4, 5, 6, 7, 8, 9]

Output: [9, 8, 7, 6, 5, 4, 3, 2, 1]
*/
