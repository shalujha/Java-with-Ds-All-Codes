
public class linkedlistgenericclient {
	public static void main(String[] args) {

		LinkedListgeneric list=new LinkedListgeneric();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.display();
		System.out.println(list.find(30));

	}

}
