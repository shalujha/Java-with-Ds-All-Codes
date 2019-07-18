public class queue {
	int[] data;
	int front;
	int size;

	public queue() {
		this.data = new int[5];
		this.front = 0;
		this.size = 0;
	}

	public queue(int cap) {
		this.data = new int[cap];
	}

	public void enqueue(int item) {
		int idx = this.front + this.size;
		this.data[idx] = item;
		size++;
	}

	public int dequeue() {
		int rv = this.data[front];
		this.front++;
		this.size--;
		return rv;
	}

}
