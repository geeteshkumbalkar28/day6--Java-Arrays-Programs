//Java Program to sort an array in ascending order

public class SortAscending
{
	public static void main(String arg[])
	{
		SortAscending obj=new SortAscending();
		int arr[] = {88,45,68,99,-1,65,68-87,45-66};
		System.out.println("array :");
		for(int counter=0;counter<arr.length;counter++)
		{
			System.out.println(arr[counter]);
		}
		int sArray[]=obj.sort(arr);
		System.out.println("array in ascending order :");
		for(int counter=0;counter<arr.length;counter++)
		{
			System.out.println(arr[counter]);
		}
	}
	public int[] sort(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
				int temp=0;
			for(int j=i+1;j<array.length;j++)
			{
				temp=0;
				if(array[i] > array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
}