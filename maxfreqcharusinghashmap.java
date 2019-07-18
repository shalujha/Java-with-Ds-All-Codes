import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maxfreqcharusinghashmap {
	public static void main(String[] args) {
		String str = "aabbaaabcdda";
		System.out.println(getMax(str));
	}
	public static Character getMax(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (map.containsKey(cc)) {
				int ov = map.get(cc);
				int nv = ov + 1;
				map.put(cc, nv);
			} else {
				map.put(cc, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		int max = 0;
		char maxChar = '\0';
		for (Map.Entry<Character, Integer> entry : entries) {
			int a = entry.getValue();
			if (a > max) {
				max = a;
				maxChar = entry.getKey();
			}
		}
		return maxChar;
	}

}
