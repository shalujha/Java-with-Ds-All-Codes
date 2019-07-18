public class client {

	public static void main(String[] args) {

		System.out.println("-------case 1 -------");
		p obj = new p();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		obj.fun();
		obj.fun1();
		
		System.out.println("-----case2----");
		p obj2=new c();
		System.out.println(obj2.d);
		System.out.println(obj2.d1);
		System.out.println(((c)obj2).d2);	// typecasting to make obj2 of c type
		obj2.fun();
		obj2.fun1();
		((c)obj2).fun2();
		
		System.out.println("-----case2-----");
		c obj4=new c();
		System.out.println(obj4.d);
		System.out.println(((p)obj4).d);// 20
		System.out.println(obj4.d1); //100
		System.out.println(obj4.d2); //200
		obj4.fun(); // in c fun
		obj4.fun1();  //in p fun1
		obj4.fun2();  // in c fun2
		

	}

}
