/*
Last:	02/02/2020
Desc:	An implementation of quick sort.
*/

public class QuickSort 
{
	// basic constructor
	public QuickSort()
	{
		//System.out.println("quick sort class initialized...\n");
		return;
	}
	
	// sort an array of integers
	public void sort(int[] unsortedArr, int i, int k)
	{
		int j = 0;
		
		if (i >= k)
		{
			return;
		}
		
		j = partition(unsortedArr, i, k);
		
		sort(unsortedArr, i, j);
		sort(unsortedArr, j + 1, k);
		
		return;
	}
	
	// partition helper function used by sort
	public int partition(int[] arr, int i, int k)
	{
		int mid = i + (k - i) / 2;
		int piv = arr[mid];
		
		int lo = i;
		int hi = k;
		
		boolean done = false;
		
		while (!done)
		{
			while (arr[lo] < piv)
			{
				++lo;
			}
			
			while (piv < arr[hi])
			{
				--hi;
			}
			
			if (lo >= hi)
			{
				done = true;
			}
			else
			{
				swap(arr, lo, hi);
				++lo;
				--hi;
			}
		}
		
		return hi;
	}
	
	// swap helper function used by sort
	public void swap(int[] arr, int loc1, int loc2)
	{
		int temp = arr[loc1];
		arr[loc1] = arr[loc2];
		arr[loc2] = temp;
		return;
	}
	
	// for debugging purposes only
	public static void main (String[] args)
	{
		return;
	}
}
