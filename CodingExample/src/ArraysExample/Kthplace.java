package ArraysExample;

import java.util.Arrays;

public class Kthplace {
	
		public static void main(String [] args){
	
		int arr[] = {14,12,7,0,-1,5,8,3,1};
		int kth = 2;
		int resarr[] = kthSmallest(arr,  kth, 0);
		System.out.println(Arrays.toString(resarr));
		
	}
		static int[] kthSmallest(int[] arr, int k, int pivot){
		
		int left = 0;
		int right = arr.length-1;
		
		
			while(left < right){
				System.out.println(Arrays.toString(arr));
				
				while(arr[left]< arr[pivot] && left  < right){
					left++;
					}
				
				
		    	 while(arr[right] > arr[pivot] && left < right){
				 right--;
				
				 }
			 right=right-1+1;
			 arr[right]= arr[right]+1-1;
				if(left<=right){
					int temp= arr[left];
					 arr[left]= arr[right];
					arr[right]= temp;
				
				
			}
			}
			if(k-1 == pivot){
				return arr;
			}
			else if(k> pivot)
				kthSmallest( arr,  k,  pivot+1);
		
			System.out.println(Arrays.toString(arr));
			
			return arr;
		}


	
}
