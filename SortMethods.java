/**
 *	SortMethods - Sorts an array of Integers in ascending order.
 *
 *	@author Katie Wang
 *	@since	November 26, 2024 
 */
public class SortMethods {
	
	/**
	 *	Bubble Sort algorithm - in ascending order
	 *	@param arr		array of Integer objects to sort
	 */
	public void bubbleSort(Integer [] arr) {
		
		for (int outer = arr.length - 1; outer > 0; outer--)
			for (int inner = 0; inner < outer ; inner++) //bubble it up
				 if (arr[inner].compareTo(arr[inner + 1]) > 0) // element on left greater than right hand side
					swap(arr, inner, inner + 1);
					
	}
	
	/**
	 *	Swaps two Integer objects in array arr
	 *	@param arr		array of Integer objects
	 *	@param x		index of first object to swap
	 *	@param y		index of second object to swap
	 */
	private void swap(Integer[] arr, int x, int y) {
		Integer temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	/**
	 *	Selection Sort algorithm - in ascending order (you implement)
	 *	@param arr		array of Integer objects to sort
	 */
	public void selectionSort(Integer [] arr) {
		
		// Sorts a[0], ..., a[size-1] in ascending order
		for (int n = arr.length; n > 1; n--)
		{
			// Find index iMax of the largest element 
			int iMax = 0;
			for (int i = 1; i < n; i++) {
				if (arr[i] > arr[iMax])
					iMax = i;
			}			
			
			// Swap a[iMax] with a[n-1]
			
			swap(arr, iMax, n-1);
				
		}
	}
	
	/**
	 *	Insertion Sort algorithm - in ascending order (you implement)
	 *	@param arr		array of Integer objects to sort
	 */
	public void insertionSort(Integer [] arr) {
		for (int n = 1; n < arr.length; n++ )
		{
			Integer aTemp = arr[n];
			
			// Going backward until finding an element a[i] <= aTemp
			
			int i = n;
			while (i > 0 &&  aTemp < arr[i-1])
			{
				arr[i] = arr[i-1];
				i--;
			}
			
			arr[i] = aTemp;
			
		}
	}
	
	/**
	 *	Merge Sort algorithm - in ascending order (you implement)
	 *	@param arr		array of Integer objects to sort
	 */
	public void mergeSort(Integer [] arr) {
		int n = arr.length;
		Integer[] temp = new Integer[n];
		recursiveSort(a, 0, n-1);
		
	}
	
	public void recursiveSort(Integer[] a, int from, int to);
	{
		if (to - from < 2) // Base case: 1 or 2 elements
		{
			if (to > from && a[to] < a[from])
			{
				// swap a[to] and a[from]
				swap(a, to, from);
			}
		} else 
		{
			int middle = (from + to) / 2;
			recursiveSort(a, from, middle);
			recursiveSort(a, middle + 1, to);
			merge(a, from, middle, to);
		}
	}
	
	public void merge(Integer[] a, int from, int middle, int to) 
	{
		int i = from, j = middle + 1, k = from;
		
		// While both arrays have elements left unprocessed:
		while ( i <= middle && j <= to)
		
	}
	
	
	public 
	
	/*****************************************************************/
	/************************* For Testing ***************************/
	/*****************************************************************/
	
	/**
	 *	Print an array of Integers to the screen
	 *	@param arr		the array of Integers
	 */
	public void printArray(Integer[] arr) {
		if (arr.length == 0) System.out.print("(");
		else System.out.printf("( %4d", arr[0]);
		for (int a = 1; a < arr.length; a++) {
			if (a % 10 == 0) System.out.printf(",\n  %4d", arr[a]);
			else System.out.printf(", %4d", arr[a]);
		}
		System.out.println(" )");
	}

	public static void main(String[] args) {
		SortMethods se = new SortMethods();
		se.run();
	}
	
	public void run() {
		Integer[] arr = new Integer[10];
		// Fill arr with random numbers
		for (int a = 0; a < 10; a++)
			arr[a] = (int)(Math.random() * 100) + 1;
		System.out.println("\nBubble Sort");
		System.out.println("Array before sort:");
		printArray(arr);
		System.out.println();
		bubbleSort(arr);
		System.out.println("Array after sort:");
		printArray(arr);
		System.out.println();
	
		for (int a = 0; a < 10; a++)
			arr[a] = (int)(Math.random() * 100) + 1;
		System.out.println("\nSelection Sort");
		System.out.println("Array before sort:");
		printArray(arr);
		System.out.println();
		selectionSort(arr);
		System.out.println("Array after sort:");
		printArray(arr);
		System.out.println();

		for (int a = 0; a < 10; a++)
			arr[a] = (int)(Math.random() * 100) + 1;
		System.out.println("\nInsertion Sort");
		System.out.println("Array before sort:");
		printArray(arr);
		System.out.println();
		insertionSort(arr);
		System.out.println("Array after sort:");
		printArray(arr);
		System.out.println();

/*		
		for (int a = 0; a < 10; a++)
			arr[a] = (int)(Math.random() * 100) + 1;
		System.out.println("\nMerge Sort");
		System.out.println("Array before sort:");
		printArray(arr);
		System.out.println();
		mergeSort(arr);
		System.out.println("Array after sort:");
		printArray(arr);
		System.out.println();
*/
	}
}
