package ex_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

public class Stat1 {
	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String s = "abcbdegyiyijkdhwejkcdhjkhjkeghjkghjklghhwehiou9'qwdab";
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);

			}

		}
		System.out.println(map.keySet());
		System.out.println(map.values());

		Set<Entry<Character, Integer>> freq = map.entrySet();
		Iterator<Entry<Character, Integer>> it = freq.iterator();
		while (it.hasNext()) {
			Entry<Character, Integer> item = it.next();
			System.out.println(item.getKey() + " has the value: " + item.getValue());
		}

		Object[] values = map.values().toArray();
		int max = (int) values[0];
		for (Object item : values) {
			System.out.println(item);
			if ((int)item > max) {
				max = (int) item;
			}

		}
		System.out.println("il mio max è: " + max);
		Object[] keys = map.keySet().toArray();
		for (Object key:keys) {
			System.out.println(key);

		}
	}

}
