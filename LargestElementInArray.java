//Program to find largest element of an array
import java.util.*;

public class LargestElementInArray
{
	
	int arr[];
	public static void main(String arg[])
	{
	    Scanner scan1 = new Scanner(System.in);

		System.out.println("Enter how many element do you want");
		int arrayLength=scan1.nextInt();
		
		LargestElementInArray mObj = new LargestElementInArray();
		mObj.accept(arrayLength); 
		int iAns=mObj.maximum();
		System.out.println("largest element in array is :"+iAns);
	}
	private void accept(int arrLength)
	{
		Scanner scan = new Scanner(System.in);
		arr=new int[arrLength];
		System.out.println("Enter the element");
		for(int counter=0;counter<arr.length;counter++)
		{
			arr[counter]=scan.nextInt();
		}
	}
	public int maximum()
	{
		int maxElemnt = arr[0];
		for(int counter=1;counter<arr.length;counter++)
		{
			if(maxElemnt<arr[counter])
			{
				maxElemnt=arr[counter];
			}
		}
		return maxElemnt;
	}
}