package ArraysExample;

import java.util.Arrays;

public class MergeArray {
	public static void main(String [] args){
	int arr1[] = {1,2,6,8, 12};
	int arr2[] = {2,5,7,9,10, 13, 17, 19};
	int arr[] = mergeArray(arr1, arr2);
	System.out.println(Arrays.toString(arr));
	
}
	static int[] mergeArray(int[] arr1, int [] arr2){
		if(arr1.length <1){ return arr2;}
		if(arr2.length <1){ return arr1;}
		int arr[] = new int[arr1.length+arr2.length];
		
		int m = arr1.length;
		int n = arr2.length;
		
		while(n > 0 && m > 0){
			
			if(arr1[m-1] < arr2[n-1]){
				arr[m+n-1] = arr2[n-1];
				//System.out.println(Arrays.toString(arr));
				n--;
			}else{
				arr[m+n-1] = arr1[m-1];
				//System.out.println(Arrays.toString(arr));
				m--;
			}
			
			
		}
		while(n>0){
			arr[m+n-1] = arr1[n-1];
			n--;
		}
		while(m>0){
			arr[m+n-1] = arr1[m-1];
			m--;
		}
		System.out.println(Arrays.toString(arr));
		
		return arr;
	}


}
