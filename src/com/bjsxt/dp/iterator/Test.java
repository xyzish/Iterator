package com.bjsxt.dp.iterator;

import com.bjsxt.dp.iterator.ArrayList;;

public class Test {

	public static void main(String[] args) {
		
		//ArrayList al = new ArrayList();
		
		//Collection c = new ArrayList();
		Collection c = new LinkedList();
		for(int i = 0; i<15; i++) {
			c.add(new Cat(i));
		}
		System.out.println(c.size());
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.print(o + " ");
		}

	}

}
