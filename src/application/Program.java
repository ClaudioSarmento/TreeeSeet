package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,1,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		System.out.println("Cole��o (a) = " + a);
		System.out.println("Cole��o (b) = " + b);
		System.out.println("====//====");
		
		//union
		System.out.println("Cole��o (c) recebe a uni�o de (a) e (b)");
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("Union: "+c);
		System.out.println("====//====");
		
		//intersection
		System.out.println("Cole��o (d) recebe a intersce��o de (a) e (b)");
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("Intersection: "+d);
		System.out.println("====//====");
		
		//difference
		System.out.println("Cole��o (e) recebe a diferen�a de (a) e (b)");
		Set<Integer> e = new TreeSet<>(a);		
		e.removeAll(b);
		System.out.println("Difference: "+e);
		System.out.println("====//====");

	}
}
