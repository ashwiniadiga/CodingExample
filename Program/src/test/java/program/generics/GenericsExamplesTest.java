package program.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class GenericsExamplesTest {
	
	//@Test
	public void betterCasting(){
		List list = new ArrayList();
		Map<Integer, String> aMap = new HashMap<>();
		list.add("A String");
		list.add("Another String");
		String s = (String) list.get(0);
		aMap.put(1, "Map1");
		String s2 = aMap.get(1);
		System.out.println(s +"+" +s2);
	}
	
	//@Test
	public void boxesTest(){
		List<Box<String>> boxes = new ArrayList<>();
		Box<String> box = new Box<>();
		box.setObj("Box1");
		box.inspect(123);
		// Since it is extends Number type it will give you an error
		//box.inspect("test");
		Box<String> box2 = new Box<>();
		box2.setObj("Box2");
		
		boxes.add(box);
		boxes.add(box2);
		
		
	}
	
	//@Test
	public void usingPairs(){
		Pair<String, String> p1 = new OrderPair<>("aKey", "aValue");
		Pair<Integer, String> p2 = new OrderPair<>(123, "aValue");
		
	}
	
	@Test 
	public void ShowSumOfNumbers(){
		sumOfNumbers(Arrays.asList(1,2,3));
		sumOfNumbers(Arrays.asList(1.1,2.2,3.5));
		sumOfNumbers(Arrays.asList(2L,4L,5L));
		sumOfNumbers2(Arrays.asList(1,2,3));
		sumOfNumbers2(Arrays.asList(1.1,2.2,3.5));
		sumOfNumbers2(Arrays.asList(2L,4L,5L));
		
	}
	
	public void sumOfNumbers(List<? extends Number> nums){
		double d =0.0;
		for(Number num : nums){
			d +=num.doubleValue();
		}
		System.out.println(d);
	}

	
	public void sumOfNumbers2(List<? super Integer> nums){
		double d =0.0;
		for(Object num : nums){
			d +=((Integer)num).doubleValue();
		}
		System.out.println(d);
	}

}
