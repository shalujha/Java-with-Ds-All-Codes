import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class hashmapdemo {

	
	public static void main(String[] args) {
		
		HashMap<String,Integer>map=new HashMap<>();
		map.put("USA", 200);
		map.put("UK", 150);
		map.put("INDIA", 300);
		map.put("CHINA", 350);
		map.put("SWEDEN", 100);
		System.out.println(map);
		map.put("BIHAR", 360);
		System.out.println(map);
		map.put("INDIA",325);
		System.out.println(map);
		System.out.println(map.get("INDIA"));
		System.out.println(map.get("RSA"));
		System.out.println(map.remove("USA"));
		System.out.println(map);
		System.out.println(map.containsKey("USA"));
		System.out.println("********** keys**************");
		Set<String> keys=map.keySet();
		for(String key: keys)
		{
			System.out.println(key);
		}
		System.out.println("*************values*************");
		Collection<Integer>values=map.values();
		for(Integer value: values)
		{
			System.out.println(value);
		}
		System.out.println("****************ENTRYSET*************");
		Set<Map.Entry<String,Integer>> entries=map.entrySet();

		for(Map.Entry<String,Integer>entry: entries)
		{
			
			System.out.println(entry.getKey()+"=>"+ entry.getValue());
	}
		
		
		
		
		

		



	}

}
