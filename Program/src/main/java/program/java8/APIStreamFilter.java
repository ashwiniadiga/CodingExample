package program.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class APIStreamFilter {
	public static void main(String[] args){
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		List<Integer> values2 = Arrays.asList(12,6,46,68,79);
		int result = 0;
		for(int i: values){
			if(i%5 ==0){
				result +=i;
			}
		}
		System.out.println(result);
		Predicate<Integer> p = new Predicate<Integer>(){
			public boolean test(Integer i){
				return i%5 ==0;
			}
			
		};
		System.out.println(values.stream().filter(p).reduce(0,(c,e) -> (c+e)));
		System.out.println(values.stream().filter((i)-> (i%5==0)).reduce(0, Integer::sum));	
		System.out.println(values.stream()
				.filter(i-> i%5==0)
				.map(i -> i*2).findFirst());
		System.out.println(values2.stream()
				.filter(i-> i%5==0)
				.map(i -> i*2).findFirst());
		System.out.println(values.stream()
				.filter(i-> i%5==0)
				.map(i -> i*2).findFirst().orElse(0));
		System.out.println(values2.stream()
				.filter(i-> i%5==0)
				.map(i -> i*2).findFirst().orElse(0));
		System.out.println(values2.stream()
				.filter(APIStreamFilter::isDivisible)
				.map(APIStreamFilter::mapDouble).findFirst().orElse(0));
		
	}
	
	public static boolean isDivisible(int i){
		System.out.println("Divisible i"+i);
		return i%5==0;
	}
	public static int mapDouble(int i){
		System.out.println("Double i"+i);
		return i*2;
	}
}
