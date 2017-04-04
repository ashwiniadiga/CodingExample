package program.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class APIForEach {
	public static void main(String[] args){
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
//		for(int i=0; i<6; i++){
//			System.out.println(values.get(i));
//		}
//		Iterator<Integer> itr = values.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
//		
//		for(int i : values){
//			System.out.println(i);
//		}
		Consumer<Integer> c = new Consumer<Integer>(){
			public void accept(Integer i){
				System.out.println(i);
			}
		};
		values.forEach(c);
		Consumer<Integer> b = (Integer i) -> System.out.println(i);
		values.forEach(b);
		System.out.println("values.forEach(i -> System.out.println(i));");
		values.forEach(i -> System.out.println(i));
		System.out.println("values.forEach(System.out::println);");
		values.forEach(System.out::println);
		System.out.println("i->doubleIt(i)");
		values.forEach(i->doubleIt(i));
		System.out.println("APIForEach::doubleIt");
		values.forEach(APIForEach::doubleIt);
	}
	
	public static void doubleIt(int i){
		System.out.println(i*2);
	}

}


