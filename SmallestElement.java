//Program to find smallest number in an array

import java.util.*;

public class SmallestElement
{
	
	int arr[];
	public static void main(String arg[])
	{
	    Scanner scan1 = new Scanner(System.in);

		System.out.println("Enter how many element do you want");
		int arrayLength=scan1.nextInt();
		
		SmallestElement mObj = new SmallestElement();
		mObj.accept(arrayLength); 
		int iAns=mObj.minimum();
		System.out.println("samllest element in array is :"+iAns);
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
	public int minimum()
	{
		int minElement = arr[0];
		for(int counter=1;counter<arr.length;counter++)
		{
			if(minElement>arr[counter])
			{
				minElement=arr[counter];
			}
		}
		return minElement;
	}
}
