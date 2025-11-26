package hashmap;

import java.util.*;
public class Hashmap_example_with_all_operations {

	public static void main(String[] args) {
		//Creating a HashMap
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "akhila");
		map.put(2, "madhu");
		map.put(3, "joshi");
		System.out.println(map);
		//Accessing Elements
		System.out.println(map.get(2));
		System.out.println(map.get(4));//null
		System.out.println(map.getOrDefault(4, "not found"));//not found
		//Checking Existence
		System.out.println(map.containsKey(3));//true
		System.out.println(map.containsValue("akhila"));//true
		//Removing Elements
		map.remove(2);
		System.out.println(map);
		//iterating through hashmap
		for(HashMap.Entry<Integer,String>entry :map.entrySet() ) { //using entry set
			System.out.println(entry.getKey()+ "->" +entry.getValue());
		}
		for(Integer key :map.keySet()) { //using keyset
			System.out.println(key);
		}
		for(String value:map.values()) {  //using values
			System.out.println(value);
		}
	}
}

//output:
//{1=akhila, 2=madhu, 3=joshi}
//madhu
//null
//not found
//true
//true
//{1=akhila, 3=joshi}
//1->akhila
//3->joshi
//1
//3
//akhila
//joshi
