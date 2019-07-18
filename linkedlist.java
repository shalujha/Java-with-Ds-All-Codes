
public class linkedlist {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public int getFirst() throws Exception {
		if (size() == 0) {
			throw new Exception("list is empty");
		} else {
			return this.head.data;
		}
	}

	public int getLast() throws Exception {
		if (size() == 0) {
			throw new Exception("list is empty");
		} else {
			return this.tail.data;
		}
	}

	public int getAt(int k) throws Exception {
		if (k == 0) {
			throw new Exception("list is empty");
		}
		if (k < 0 || k >= size()) {
			throw new Exception("Invalid Index");

		} else {
			Node temp = this.head;
			for (int i = 1; i <= k; i++) {
				temp = temp.next;
			}
			return temp.data;
		}
	}

	public Node getNodeAt(int k) throws Exception
	{
		if (k == 0) {
			throw new Exception("list is empty");
		}
		if (k < 0 || k >= size()) {
			throw new Exception("Invalid Index");

		} else {
			Node temp = this.head;
			for (int i = 1; i <= k; i++) {
				temp = temp.next;
			}
			return temp;
		}
		
		public void addLast(int item)
		{
			Node nn=new Node();
			nn.data=item;
			nn.next=null;
			if(size()>0)
			{
				tail.next=nn;	
			}
			if(this.size()==0)
			{
				this.head=nn;
				this.tail=nn;
				this.size()++;
			}else
			{
			this.tail=nn;
			this.size++;
			}
		}
		
		public void addFirst(int item)
		{
			Node nn=new Node();
			nn.data=item;
			nn.next=null;
			if(size()>0)
			{
				nn.next=this.head;
			}
			if(this.size()==0)
			{
				this.head=nn;
				this.tail=nn;
				this.size++;
			}else
			{
				this.head=nn;
				this.size++;
			}	
		}
		
		public void display()
		{
			Node temp;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
		public void addAt(int k,int item) throws Exception
		{
			if(k<0 || k>=size())
			{
				throw new Exception("invalid index");
			}
			if(k==0)
			{
				addFirst(item);
			}
			if(k<=this.size()-1)
			{
				addLast(item);
			}else
			{
				Node prev=getNodeAt(k-1);
				Node ahead=getNodeAt(k);
				Node nn=new Node();
				nn.data=item;
				prev.next=nn;
				nn.next=ahead;
				this.size++;
			}
		}
		
		
		public int removeFirst()throws Exception
		{
			if(size()==0)
			{
				throw new Exception("list is empty");
			}
			Node fn=this.head;
			if(size()==1)
			{
				this.head=null;
				this.tail=null;
				this.size--;
				
			}else
			{
				this.head=this.head.next;
				size--;
			}
			return fn.data;
		}
		
	
		public int removeLast() throws Exception
		{
			if(size()==0)
			{
				throw new Exception("list is empty");
			}
			Node fn=this.tail;
			if(size()==1)
			{
				this.head=null;
				this.tail=null;
				this.size--;
			}else
			{
				Node sm2=getNodeAt(this.size()-2);
				sm2.next=null;
				this.tail=sm2;
				this.size--;
			}
			
		}
		
		public int removeAt(int k) throws Exception
		{
			if(size()==0)
			{
				throw new Exception("list is Empty");
			}
			if(k<0 || k>=size())
			{
				throw new Exception("Invalid Index");
			}
			
			Node prev=getNodeAt(k-1);
			Node self=prev.next;
			Node ahead=getNodeAt(k);
			prev.next=ahead;
			this.size--;
		
		return self.data;	
		
	}
	}
	

}
