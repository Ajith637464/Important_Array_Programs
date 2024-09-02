import java.util.*;
class MaxProductSubArray
{
	static Scanner sc = new Scanner (System.in);
	public static void findMaxProductSubArray(int []a)
	{
		int sum=Integer.MIN_VALUE;
		String sub_arr="";
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i;j<a.length ;j++ )
			{
				String temp_arr="";
				int prod=1;
				for (int k=i;k<=j ;k++ )
				{
					prod*=a[k];
					temp_arr+=a[k]+" ";
				}
				if (prod>sum)
				{
					sum=prod;
					sub_arr=temp_arr;
				}
			}
		}
		System.out.println("\nMax Product sub array: [ "+sub_arr+"]");
		System.out.println("\nProduct is: "+sum);
	}
	public static void main(String[] args) 
	{
		int[]a={0,1,2,-1,5,5,1};
		System.out.println("\nGiven: "+Arrays.toString(a));
		findMaxProductSubArray(a);
	}
}
/*
Given: [0, 1, 2, -1, 5, 5, 1]

Max Product sub array: [ 5 5 ]

Product is: 25
*/
