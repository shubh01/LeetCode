package algo;

import java.util.ArrayList;
import java.util.List;

public class Consumer {

	public static void main(String[] args) {
		
		List<Integer> integers =new ArrayList<Integer>();
		
		integers.add(10);
		integers.add(11);
		integers.add(12);
		integers.add(13);
		integers.add(14);
		integers.add(15);
		integers.add(16);
		
		java.util.function.Consumer<Integer> a = b -> System.out.println(b);
		
		integers.parallelStream().forEach(a);
		
	}
	
}
