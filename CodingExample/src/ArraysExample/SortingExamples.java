package ArraysExample;

import java.util.Arrays;

public class SortingExamples {
	public static void main(String[] args ){
		int[] x = { 9, 2, 4, 7, 3, 7, 10 };
		System.out.println(Arrays.toString(x));
		
		quickSort(x, 0, x.length-1);
		System.out.println(Arrays.toString(x));
	}
	
	static void quickSort(int[] arr, int low, int high){
		
		if(low > high){
			return;
		}
		
		
		int middle = low + (high-low)/2;
		int pivot = arr[middle];
		int i = low;
		int j = high;
		
		while(i <=j){
		
			while( arr[i] < pivot){
				i++;
			}
			while(arr[j] > pivot){
				j--;
			}
			if(i <= j){
				//System.out.println(arr[i] +" "+ arr[j]+ " "+ arr[middle]);
				//System.out.println(Arrays.toString(arr));
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			
		}
		
		if(low < j){
			quickSort(arr, low, j);
		}
		if(i < high ){
			quickSort(arr, i, high);
		}
	}

}
