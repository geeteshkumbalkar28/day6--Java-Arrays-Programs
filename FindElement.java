//Program to find number of elements in an array
import java.util.*;

public class FindElement
{
	public static void main(String arg[])
	{
		FindElement obj = new FindElement();
		Scanner scan = new Scanner(System.in);
		int arr[] = {10,20,30,40,50,60,70,80,90,100,55,69,78};
		
		System.out.println("Enter the element that you want to find in array");
		int checkNo = scan.nextInt();
		
		boolean bAns = obj.checkElement(arr,checkNo);
		if(bAns==true)
		{
			System.out.println("Element is present in array");
		}
		else if(bAns==false)
		{
			System.out.println("Element is not present in array");
		}
	}
	private boolean checkElement(int array[],int checkNumber)
	{
		boolean flag = false;
		for(int counter=0;counter<array.length;counter++)
		{
			if(array[counter]==checkNumber)
			{
				flag = true;
				break;
			}
		}
		return flag;
			
	}
}