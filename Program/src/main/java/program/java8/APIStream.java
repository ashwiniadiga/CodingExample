package program.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class APIStream {
	public static void main(String[] args){
		List<Integer> values = Arrays.asList(1,2,3,4);
		int result =0;
		for(int i: values){
			result = result+i*2;
		}
		System.out.println(result);
		System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
		
		Function<Integer, Integer> f = new Function<Integer, Integer>() {
			public Integer apply(Integer i){
				return i*2;
			}
		};
		BinaryOperator b = new BinaryOperator<Integer>(){
			
			public Integer apply(Integer i, Integer j){
				
				return i+j;
			}
		};
		Stream<Integer> s = values.stream();
		Stream<Integer> s1 = s.map(f);
		Integer sum =(Integer) s1.reduce(0, b);
		System.out.println(sum);
		
		Stream<Integer> ss = values.stream();
		Stream<Integer> ss1 = ss.map(new Function<Integer, Integer>(){
			public Integer apply(Integer i){
				return i*2;
			}
		});
		
		Optional<Integer> sum1 =  ss1.reduce(new BinaryOperator<Integer>(){
			public Integer apply(Integer i, Integer j){	
				return i+j; 
			}
		});
		System.out.println(sum1);
		
		Stream<Integer> sss1 = ss.map((i)-> i*2);
		
		Integer res =  sss1.reduce(0,(i,j)-> j+j);
		System.out.println(res);
			
		
		
	}
	public static void doubleIt(int i){
		System.out.println(i*2);
	}

}
