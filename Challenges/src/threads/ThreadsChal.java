package threads;

import java.util.Random;
import java.util.ArrayDeque;

public class ThreadsChal extends Thread {
		static ArrayDeque<Integer> a;
		
		public CustomThread() {
			if(a == null) {
				a = new ArrayDeque<Integer>();
			}
		}
}
