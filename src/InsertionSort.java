/*
Last:	02/02/2020
Desc:	An implementation of insertion sort.
*/

public class InsertionSort 
{
	// basic constructor
	public InsertionSort()
	{
		//System.out.println("insertion sort class initialized...\n");
		return;
	}
	
	// sort an array of integers
	public void sort(int[] unsortedArr)
	{
		int arrSize = unsortedArr.length;
		int i, j;
		
		for (i = 1; i < arrSize; i++)
		{
			j = i;
			while (j > 0 && unsortedArr[j] < unsortedArr[j - 1])
			{
				swap(unsortedArr, j);
				j--;
			}
		}
	}
	
	// swap helper function used by sort
	public void swap(int[] arr, int loc)
	{
		int temp = arr[loc];
		arr[loc] = arr[loc - 1];
		arr[loc - 1] = temp;
		return;
	}
	
	// for debugging purposes only
	public static void main (String[] args)
	{
		return;
	}
}
