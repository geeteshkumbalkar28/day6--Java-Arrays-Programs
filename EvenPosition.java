//Java Program to print the elements of an array present on even Position
import java.util.*;

public class EvenPosition
{
	int arr[];
	public static void main(String arg[])
	{
	    Scanner scan1 = new Scanner(System.in);

		System.out.println("Enter how many element do you want");
		int arrayLength=scan1.nextInt();
		
		EvenPosition obj = new EvenPosition();
		obj.accept(arrayLength);
		obj.printEven();
			
	}
	public void printEven()
	{
		System.out.println("Array present on Even position :");
		for(int counter=0;counter<(arr.length);counter++)
		{
			if(counter%2 == 0){
			System.out.println(arr[counter]);}
			
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