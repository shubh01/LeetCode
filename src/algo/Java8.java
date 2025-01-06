package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {
			
		String negValue = "-123";
		if(negValue.startsWith("-"))
			System.out.println("("+negValue+")");
		String value ="612.3457";
		if(value.contains(".")) {
			String v1=value.split("\\.")[1];
			if(v1.length()>2) {
				double roundOff = Math.round(Double.parseDouble(value) * 1000.0) / 1000.0;				
				System.out.println(String.valueOf(roundOff));
			}
		}
		/*List<String> list=new ArrayList<String>();
		list.add("e");
		list.add("d");
		list.add("c");
		list.add("b");
		list.add("a");
		
		Spliterator<String> spliterator=list.stream().spliterator();
		System.out.println("Characterstics: "+spliterator.characteristics());
		System.out.println("Estimated size: "+spliterator.estimateSize());
		System.out.println("Exact sized: "+spliterator.getExactSizeIfKnown());
		spliterator.tryAdvance(System.out::println);
		spliterator.tryAdvance(System.out::println);
		spliterator.tryAdvance(System.out::println);
		spliterator.forEachRemaining(System.out::println);
		System.out.println(	"Has characterstics: "+spliterator.hasCharacteristics(0));*/
/*		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);		
		list.add(3);
		list.add(4);
		list.add(10);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		
		List<Integer> data=list.stream().filter(i -> i>2).collect(Collectors.toList());
		System.out.println(data);
		List<Integer> data1=list.stream().map(i  -> i*i ).distinct().collect(Collectors.toList());
		System.out.println(data1);
		
		list.stream().sorted().forEach(System.out::println);*/
		
/*		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(1, 10);
		map.put(5, 50);
		map.put(4, 40);
		map.put(3, 30);
		map.put(2, 20);
		
		Map<Integer, Integer> dataMap=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		dataMap.entrySet().stream().forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));*/
		
		test(1.2);
	}
	
	public static void test(Object a) {
		System.out.println("Object method called");
	}
	
	public static void test(Integer a) {
		System.out.println("Integer method called");
	}
	
	public static void test(String a) {
		System.out.println("String method called");
	}
	
	public static void test(int a) {
		System.out.println("Int method called");
	}
	
	public static void test(float a) {
		System.out.println("float method called");
	}
	
	public static void test(double a) {
		System.out.println("Double method called");
	}
}
