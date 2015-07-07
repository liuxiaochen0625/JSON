package Random;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class random {
	public static void main(String args[]){
		int a[] = new int[]{1,2,3,4,5,6,7};
		System.out.println(a.length);
		System.out.println(new Random().nextInt(16));
		AtomicInteger access = new AtomicInteger();
		access.set(0);
	}
}
