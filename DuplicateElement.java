//Program to find duplicate elements of an array
import java.util.*;
public class DuplicateElement
{
	
	int arr[];
	public static void main(String arg[])
	{
	    Scanner scan1 = new Scanner(System.in);

		System.out.println("Enter how many element do you want");
		int arrayLength=scan1.nextInt();
		
		DuplicateElement obj = new DuplicateElement();
		obj.accept(arrayLength);
		obj.checkDuplicate();
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
	public int checkFrequency(int no)
	{
		int count=0;
		for(int counter=0;counter<arr.length;counter++)
		{
			if(arr[counter] == no)
			{
				count++;
			}
		}
		return count;
	}
	public void checkDuplicate()
	{
		System.out.println("Duplicate Element is:");
		for(int counter=0;counter<(arr.length);counter++)
		{
			int countNo=checkFrequency(arr[counter]);
			if(countNo>1)
			{
				System.out.println(arr[counter]);
			}
			
		}
		
	}
}