package com.bjsxt.dp.iterator;

import com.bjsxt.dp.iterator.Collection;

public class LinkedList implements Collection {
	Node head = null;
	Node tail = null;
	int size = 0;
	public void add(Object o) {
		Node n = new Node(o, null);
		if(head == null) {
			head = n;
			tail = n;
		}
		tail.setNext(n);
		tail = n;
		size ++ ;
	}
	
	public int size() {
		return size;
	}

	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator implements Iterator{
		private Node currentNode = head;
		
		@Override
		public boolean hasNext() {
			if(currentNode == null) return false;
			else return true;
		}

		@Override
		public Object next() {
			Object o = currentNode.getData();
			currentNode = currentNode.getNext();
			return o;
		}


		
	}
	
//	private class LinkedListIterator implements Iterator{
//
//		private Node currentNode = head;
//		private int nextIndex = 0;//…¢¿¼Ô´´úÂëÖÐµÄÐ´·¨
//		
//		@Override
//		public Object next() {
//			
//			Object data = currentNode.getData();
//			currentNode = currentNode.getNext();
//			nextIndex ++;
//			return data;
//		}
//
//		@Override
//		public boolean hasNext() {
//			
//			return nextIndex != size;
//		}
//		
//	}

}
