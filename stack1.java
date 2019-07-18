public class stack1 {
	int[] data;
	int tos = -1;

	public stack1(int cap) {
		this. data = new int[cap];
		this.tos = -1;
	}

	public void push(int item) throws Exception {
		if(isFull())
		{
			throw new Exception("stack is full");
		}
		else
		{
			this.tos++;
			this.data[this.tos] = item;
		}
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack is empty");
		} else {
			int rv = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return rv;

		}
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack is empty");
		} else {
			int rv = this.data[this.tos];
			return rv;
		}
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isFull() {
		if (size() == data.length) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void display() {
		for (int i = this.tos; i >= 0; i--) {
			System.out.println(this.data[i]);
		}
	}
}
