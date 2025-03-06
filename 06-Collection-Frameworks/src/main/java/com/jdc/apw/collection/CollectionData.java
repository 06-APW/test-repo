package com.jdc.apw.collection;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionData {
	static String[] array = { "Andrew", "William", "John", "Lucifer", "Kyle", "Mike" };

	public List<String> useList(String str) {

		return switch (str) {
		case "A" -> {
			ArrayList<String> list = new ArrayList<>();
			list.addAll(List.of(array));
			yield list;
		}
		case "L" -> {
			LinkedList<String> list = new LinkedList<>();
			list.addAll(List.of(array));
			yield list;
		}
		default -> null;
		};
	}
	
	// In set, elements can't be duplicated unlike List
	public Set<String> useSet(String s) {

		return switch (s) {
		case "H" -> {
			HashSet<String> set = new HashSet<>();
			set.addAll(Set.of(array));
			yield set;
		}
		
		case "L" -> {					// Arranged by first line,second line
			LinkedHashSet<String> set = new LinkedHashSet<>();
			//set.addAll(Set.of(array));
			
			yield set;
		}
		
		case "T" -> {					// Arranged by order
			TreeSet<String> set = new TreeSet<>();
			set.addAll(Set.of(array));
			yield set;
		}

		default -> null;
		};
	}

	public Queue<String> useQueue() {
		return null;
	}

	public Deque<String> useDeque() {
		return null;
	}

	public Map<Integer, String> useMap() {
		return null;
	}
}
