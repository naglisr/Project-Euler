
public class ProjectEuler8
{
	public static int prod(int[] nums)
	{
		int prod = 1;
		for( int a = 0; a < nums.length; a++ )
			prod *= nums[a];
		return prod;
	}
	
	int largestProd(int len, int[] nums)
	{
		return nums.length <= len? prod(nums): nums[0] < nums[len]? largestProd(len, nums): largestProd(len, nums);
	}
	
	public static void main(String[] args)
	{
	}
}
