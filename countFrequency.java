//Java Program to count the frequency of each element in an array
import java.util.*;

public class countFrequency
{
	int arr[];
	public static void main(String arg[])
	{
	    Scanner scan1 = new Scanner(System.in);

		System.out.println("Enter how many element do you want");
		int arrayLength=scan1.nextInt();
		
		countFrequency obj = new countFrequency();
		obj.accept(arrayLength);
		obj.frequencyOfEachElement();
			
	}
	public int checkFrequency(int no)
	{
		int count=0;
		for(int counter=0;counter<arr.length;counter++)
		{
			if(arr[counter] == no)
			{
				count++;git add
			}
		}
		return count;
	}
	//copy multipal duplicate number into single number and store it in an array
	public int[] copyArray()
	{
		int array[]=new int[arr.length];
		
		//System.out.println("elements of an array into another array is :");
		boolean falg=false;
		for(int counter=0;counter<(arr.length);counter++)
		{
			int countNo=checkFrequency(arr[counter]);
			
			if(countNo==1)
			{
				array[counter]=arr[counter];
			}
			else if(countNo>1)
			{
				for(int iCount=0;iCount<arr.length;iCount++)
				{
					if(array[iCount]==arr[counter])
					{
						falg=true;
					}
				}
				if(falg == false)
				{
					array[counter]=arr[counter];
		
				}
			}
		}
		
		return array;
		
	}
	public void frequencyOfEachElement()
	{
		int array[]= copyArray();
		System.out.println("Element    Frequency");
		for(int counter=0;counter<array.length;counter++)
		{
			
			int checkCount=checkFrequency(array[counter]);
			if(checkCount!=0)
			{
				System.out.print("   "+array[counter]+"          ");
				System.out.println(checkCount);
			}
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