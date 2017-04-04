package ArraysExample;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateInString {
	
	public static void main(String[] args){
		String str1 = "Hello World I am coming";
		String str2 = "lWw c k c";
		
		DuplicateInString duplicate = new DuplicateInString();
		duplicate.findDuplicates(str1, str2);
		duplicate.findDuplicates2(str1, str2);
	}
	
	public void findDuplicates(String str1, String str2){
		HashSet<Character> firstString = new HashSet<Character>();
		
		for(int i=0; i< str1.length(); i++){
			firstString.add(str1.charAt(i));	
		}
		
		for(int i=0; i< str2.length(); i++){
			if(firstString.contains(str2.charAt(i)))
			{
						System.out.println(str2.charAt(i));
				
			}
		
		}
	}
	
	public void findDuplicates2(String str1, String str2){
		char[] charStr1 = str1.toCharArray();
		char[] charStr2 = str2.toCharArray();
		Arrays.sort(charStr1);
		System.out.println(charStr1);
		
		for(int i=0; i< str2.length(); i++){
			char c = charStr2[i];
			System.out.println(c);
			boolean result =isStringPresent(c, charStr1, 0, charStr1.length-1);
			
					if(result){
						System.out.println(c);
				
			}
		
		}
	}

	public boolean isStringPresent(char c, char[] str, int start, int end){
		boolean result= false;
		if(start> end){
			return false;
		}
		int mid = start+(end-start)/2;
		//System.out.println(mid+","+end+","+start);
			if(str[mid]== c){
				return true;
			}
			else if(str[mid] < c){
				result = isStringPresent(c, str, mid+1, end);
			}else if(str[mid] > c){
				result = isStringPresent(c, str, start, mid-1);
			}
			return result;
		}
		
		
	
}
