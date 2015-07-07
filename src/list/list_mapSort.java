package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class list_mapSort {
	public static void main(String []args){
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "liu");
		map.put("age", 22);
		list.add(map);
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("name", "liux");
		map1.put("age", 52);
		list.add(map1);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).get("name"));
			System.out.println(list.get(i).get("age"));
		}
		Collections.sort(list,new Comparator<Map<String, Object>>() {

			@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				return (int)o2.get("age")-(int)o1.get("age");
			}
		});
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).get("name"));
			System.out.println(list.get(i).get("age"));
		}
	}
}
