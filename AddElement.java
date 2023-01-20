//Java Program to Add the elements of an Array
import java.util.*;

public class AddElement
{
	int arr[];
	public static void main(String arg[])
	{
		Scanner scan1 = new Scanner(System.in);
		AddElement obj = new AddElement();
		
		System.out.println("Enter how many element do you want");
		int arrayLength=scan1.nextInt();
		
		obj.accept(arrayLength);
		obj.display(arrayLength);
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
	private void display(int arrLength)
	{
		System.out.println("element in array:");
		for(int counter=0;counter<arr.length;counter++)
		{
			System.out.println(arr[counter]);
		}
	}
}