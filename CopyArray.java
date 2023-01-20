//Java Program to copy all the elements of an array into another array
import java.util.*;

public class CopyArray
{
	int arr[];
	public static void main(String arg[])
	{
	    Scanner scan1 = new Scanner(System.in);

		System.out.println("Enter how many element do you want");
		int arrayLength=scan1.nextInt();
		
		CopyArray obj = new CopyArray();
		obj.accept(arrayLength);
		obj.copyArray();
			
	}
	public void copyArray()
	{
		int array[]=new int[arr.length];
		
		System.out.println("elements of an array into another array is :");
		for(int counter=0;counter<(arr.length);counter++)
		{
				array[counter]=arr[counter];
		}
		for(int iCounter=0;iCounter<(array.length);iCounter++)
		{
				System.out.println(array[iCounter]);
		}
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

}