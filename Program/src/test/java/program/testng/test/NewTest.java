package program.testng.test;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("First Test");
	  
	  String s = "Ab,c,de!$";
	  char[] str = s.toCharArray();
	  StringBuilder str2 = new StringBuilder();
	  
	 
	  int i=0;
	  int j=s.length()-1;
	  
	  while(i<j){
		
		  if(Character.isAlphabetic(str[i]) && Character.isAlphabetic(str[j])){
			  char c= str[i];
			  str[i] = str[j];
			  str[j] =c;

	
		  }
		  
	  }
  }
}
