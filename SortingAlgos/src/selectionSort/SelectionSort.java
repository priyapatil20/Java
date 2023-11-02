package selectionSort;

public class SelectionSort 
{
	public static int[] SelectionSorting(int arr[]) 
	{
			for(int i=0; i<=arr.length-2; i++)   //3 iterations so arr.length-2
			{
				int pos = i;
				int min = arr[pos];
				
				for(int j=i+1; j<=arr.length-1; j++) 
				{
					if(arr[j] < min) 
					{
						min = arr[j];
						pos = j;
					}
				}
				int temp = arr[pos]; //This line declares a temporary variable temp 
				                     //and assigns it the value of the element at index pos in the array arr. 
				                     //The purpose of this step is to save the value of one element 
				                     //so that it doesn't get lost during the swap.
				
				arr[pos] = arr[i];   //This line replaces the value of the element at index pos 
				                     //with the value of the element at index i. 
				                     //Essentially, this line is swapping the values of two elements in the array. 
				                     //The value originally at pos is stored in temp.
				
				arr[i] = temp;       //Finally, this line restores the value that was originally at index pos back to index i. 
				                     //This is necessary because the value at pos was overwritten in the previous step.
				                     //We use the temporary variable temp to store and retrieve this value.
				
			}
			return arr;
	}
}
