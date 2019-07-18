
public class hashtableclient {

	
	public static void main(String[] args) throws Exception {
	
		hashtable<String,Integer> map=new hashtable<>(5);
		map.put("USA", 200);
		map.put("UK", 175);
		map.put("INDIA", 300);
		map.put("CHINA", 350);
	
		map.display();
	//	System.out.println("****************remove*********************");
	//	System.out.println(map.remove("USA"));
	}

}
	