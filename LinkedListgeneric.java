import datastructures.linkedList.Node;

public class LinkedListgeneric<T> {

	private class Node {
		T data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public T getFirst() throws Exception {
		if (size() == 0) {
			throw new Exception("linked list is empty");
		} else {
			return this.head.data;
		}
	}

	public T getLast() throws Exception {
		if (size() == 0) {
			throw new Exception("linked list is empty");
		} else {
			return this.tail.data;
		}
	}

	public T getAt(int k) throws Exception {
		if (size() == 0) {
			throw new Exception("linked list is empty");
		}
		if (k < 0 || k >= this.size) {
			throw new Exception("Invalid index");
		}
		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getNodeAt(int k) throws Exception {
		if (size() == 0) {
			throw new Exception("linked list is empty");
		}
		if (k < 0 || k > this.size) {
			throw new Exception("Invalid index");
		}
		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addLast(T item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		if (this.size > 0) { // null pointer removal
			tail.next = nn;
		}
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void addFirst(T item) {
		// new node
		Node nn = new Node();
		nn.data = item;

		// attach
		if (this.size > 0) {
			nn.next = head;
		}
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}
		// summary
		else {
			this.head = nn;
			this.size++;
		}
	}

	public void addAt(T item, int k) throws Exception {
		if (k < 0 || k > size()) {
			throw new Exception("Invalid index");
		}
		if (k == 0) {
			addFirst(item);
		} else if (k == this.size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;
			Node prev = getNodeAt(k - 1);
			Node ahead = getNodeAt(k);
			prev.next = nn;
			nn.next = ahead;
			this.size++;

		}
	}

	public T removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		Node fn = this.head;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}

		return fn.data;
	}

	public T removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		T temp = this.tail.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sm2 = getNodeAt(this.size - 2);
			sm2.next = null;
			this.tail = sm2;
			this.size--;
		}
		return temp;
	}

	public T removeAt(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		if (k < 0 || k >= this.size) {
			throw new Exception("Invalid index");
		}
		if (k == 0) {
			return removeFirst();
		} else if (k == this.size - 1) {
			return removeLast();
		} else {
			Node prev = getNodeAt(k - 1);
			Node self = prev.next;
			Node ahead = self.next;
			prev.next = ahead;
			this.size--;
			return self.data;
		}
	}

	public int find(T item) {
		int index = 0;
		for (Node temp = this.head; temp != null; temp = temp.next) {
			if (temp.data == item) {
				return index;
			}
			index++;
		}
		return -1;

	}

}
