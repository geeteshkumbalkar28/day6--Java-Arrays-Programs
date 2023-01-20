//Java Program to Calculate average of numbers using Array

public class CalculateAverage
{
	public static void main(String arg[])
	{
		CalculateAverage obj = new CalculateAverage();
		int arr[] = {10,20,30,40,50,60,70,80,90,100,55,69,78};
		int iAns=obj.average(arr);
		System.out.println("average of numbers using Array :"+iAns);
		
	}
	private int average(int array[])
	{
		int sum=0;
		int ave=0;
		for(int counter=0;counter<array.length;counter++)
		{
			sum = sum+array[counter];
		}
		ave=sum/array.length;
		return ave;
		
	}
}