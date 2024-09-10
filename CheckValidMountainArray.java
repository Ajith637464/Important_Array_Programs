class CheckValidMountainArray{
    public static boolean validMountainArray(int[] arr)
	{
		boolean ans=false;
        boolean flag =true,flag1=true,flag2=false;
		for (int i=0;i<arr.length-1;i++)
		{
			if (flag)
			{
				if (arr[i+1]>arr[i])
				{
					i--;
					flag=false;
				}
				else
				{
					ans=false;
					break;
				}
			}
			else if (flag1)
			{
				if (arr[i+1]==arr[i])
				{
					ans=false;
					break;
				}
				else if (arr[i+1]<arr[i])
				{
					flag1=false;
					flag2=true;
					ans=true;
				}
			}
			else if (flag2)
			{
				if (arr[i+1]==arr[i])
				{
					ans=false;
					break;
				}
				else if (arr[i+1]>arr[i])
				{
					ans=false;
					break;
				}
				else
					ans=true;
			}
		}
		return ans;
    }
	public static void main(String[]args)
	{
		int[]a={1,3,2};
		System.out.println(validMountainArray(a));


	}
}