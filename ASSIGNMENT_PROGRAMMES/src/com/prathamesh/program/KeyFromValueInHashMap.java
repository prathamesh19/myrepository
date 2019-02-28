package com.prathamesh.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KeyFromValueInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class MyKeyRetrievingMech {
	public static List getKeyFromValue1(Map hm, Object value) {
		List l = new ArrayList();
		for (Object o : hm.keySet()) {
			if ((hm.get(o)).equals(value))
				l.add(o);
		}
		return l;
	}

	public static List getKeyFromValue2(Map hm, Object value) {
		List l = new ArrayList();
		Iterator itr = hm.keySet().iterator();
		while (itr.hasNext()) {
			Object key = itr.next();
			if ((hm.get(key)).equals(value))
				l.add(key);
		}
		return l;
	}

	public static List getKeyFromValue3(Map hm, Object value) {
		List l = new ArrayList();
		Set<Map.Entry<Object, Object>> s = hm.entrySet();
		Iterator itr = s.iterator();
		for (Map.Entry<Object, Object> entry : s) {
			if (entry.getValue().equals(value))
				l.add(entry.getKey());
		}
		return l;
	}

	public static List getKeyFromValue4(Map hm, Object value) {
		List l = new ArrayList();
		Set<Map.Entry<Object, Object>> s = hm.entrySet();
		Iterator<Map.Entry<Object, Object>> itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry<Object, Object> e = itr.next();
			Object key = e.getKey();
			Object val = e.getValue();
			if (val.equals(value))
				l.add(key);
		}
		return l;
	}
}
