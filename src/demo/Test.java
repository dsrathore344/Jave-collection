package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class Test{
	
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(12);
		list.add(5);
		list.add(8);
		list.add(6);
		 Collections.synchronizedList(list);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			list.add(78);
			list.remove(0);	
			System.out.println(it.next());
		}
			
	}
}
