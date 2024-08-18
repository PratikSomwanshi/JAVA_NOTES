package com.notes.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapObject {
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<>();

		mp.put(1, "Rohan");
		mp.put(2, "Pandit");
		mp.put(3, "lala");

		System.out.println(mp);
		System.out.println(mp.containsKey(1));
		System.out.println(mp.size());
		System.out.println(mp.isEmpty());
		mp.put(3, "John");
		System.out.println(mp);
//		mp.clear();
//		System.out.println(mp);

		Set<Integer> keySet = mp.keySet();

		for (Integer i : keySet) {
			System.out.println(i);
			System.out.println(mp.get(i));
		}

		Collection<String> values = mp.values();
		for (String o : values) {
			System.out.println(o);
		}

		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println(next.getKey() + " -- " + next.getValue());
		}
	}
}
