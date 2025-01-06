package algo;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestingAlgo {

	public static void main(String[] args) {
		Integer[] a=new Integer[] {6, 5, 4, 3,2,1};

		mergeSort(a,0,a.length-1);
		Stream<Integer> stream=Arrays.stream(a);
		
		stream.forEach((x) -> System.out.println(x));	
		
	}
	
	private static void mergeSort(Integer[] a,Integer l,Integer r) {
		if(l<r) {
			
			Integer q=(l+r)/2;
			mergeSort(a, l, q);
			mergeSort(a, q+1, r);
			merge(a, q, r, l);
		}
	}
	
	private static void merge(Integer[] a,Integer q,Integer r,Integer l) {
		
		Integer n1=q-l+1;
		Integer n2=r-q;
		Integer left[]=new Integer[n1+1];
		Integer right[]=new Integer[n2+1];
		

		for(Integer i=0;i<n1;i++)
			left[i]=a[i+l];
		for(Integer i=0;i<n2;i++)
			right[i]=a[i+q+1];
		
		left[n1]=Integer.MAX_VALUE;
		right[n2]=Integer.MAX_VALUE;
		Integer j = 0, i = 0, k = l;
		while (k <= r) {
			if (left[i] < right[j]) {
				a[k] = left[i];
				i++;
			} else {
				a[k] = right[j];
				j++;
			}
			k = k + 1;
		}
		
/*		Stream<Integer> stream=Arrays.stream(a);
		
		stream.forEach((x) -> System.out.println(x));*/
		
	}
	
	
}
