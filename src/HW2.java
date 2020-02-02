/*
Author: Michael Deakin
Info:	CSCI230-Spring-2020-HW2
Last:	02/02/2020
Desc:	Driver program to test implementation of Insertion Sort and
		Quick Sort.
*/

import java.util.Random;

public class HW2
{
	public void testInsertionSort()
	{
        InsertionSort testIns = new InsertionSort();
		
		//random numbers
        Random random = new Random();
        int numbers[] = new int[16];
        for (int i = 0; i < numbers.length; ++i) 
        {
            numbers[i] = random.nextInt(100);
        }

        //output unsorted
        System.out.print("Unsorted: ");
        for(int n : numbers)
            System.out.print(n + " ");
        System.out.println("");

        //call a sorting algorithm you made
        System.out.println("-- InsertionSort --");
        testIns.sort(numbers);

        //output sorted
        System.out.print("Sorted:   ");
        for (int i = 0; i < numbers.length; ++i) 
        {
            System.out.print(numbers[i] + " ");
        }
		return;
	}
	
	public void testQuickSort()
	{
		QuickSort testQuick = new QuickSort();
		
		Random random = new Random();
        int numbers[] = new int[16];
        for (int i = 0; i < numbers.length; ++i) 
        {
            numbers[i] = random.nextInt(100);
        }

        //output unsorted
        System.out.print("Unsorted: ");
        for(int n : numbers)
            System.out.print(n + " ");
        System.out.println("");

        //call a sorting algorithm you made
        System.out.println("-- QuickSort --");
        testQuick.sort(numbers);

        //output sorted
        System.out.print("Sorted:   ");
        for (int i = 0; i < numbers.length; ++i) 
        {
            System.out.print(numbers[i] + " ");
        }
		return;
	}
	
    public static void main(String[] args) 
    {
    	HW2 main = new HW2();
    	
    	System.out.println("Testing insertion sort...\n");
    	
    	main.testInsertionSort();
    	
    	System.out.println("\nTesting ended.");
    	
    	//System.out.println("Testing quict sort...\n");
    	
    	//main.testQuickSort();
    	
    	//System.out.println("\nTesting ended.");
    	
    	
    }
}
