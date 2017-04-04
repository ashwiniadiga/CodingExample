package ArraysExample;

import java.util.HashMap;
import java.util.Map;

public class ArraySum {
	public static void main(String[] args){
		int[] arr = {12, 15, 19,-1, -3, -2, 0, 5, 7, 9};
		int sum = 7;
		
		findPairs(arr, sum);
		
	}
	public static void findPairs(int arr[], int sum){
		
		HashMap<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
		for(int i=0; i< arr.length; i++){
			if(arrMap.containsKey(arr[i])){
				
				System.out.println(arr[i]+","+arrMap.get(arr[i]));
			}
			arrMap.put(sum-arr[i], arr[i]);
		}
		System.out.println("-------");
		for(Map.Entry<Integer, Integer> entry : arrMap.entrySet()){
			System.out.println(entry.getKey()+","+entry.getValue());
			
		}
	}
	
	
	
	

}
