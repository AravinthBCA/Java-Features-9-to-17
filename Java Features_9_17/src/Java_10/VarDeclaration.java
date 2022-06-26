package Java_10;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class VarDeclaration {
	public static void main(String[] args) {
		var i =10;
//		i = "abc"; // throw an exception
		HashMap<String,List<String>> map = new HashMap<String,List<String>>();
		
		var map1 = new HashMap<String,List<String>>();
		
		for(Entry<String, List<String>> entry : map.entrySet()) {	
			List<String> list = entry.getValue();
		}
		
		for(var entry : map.entrySet()) { 
			var list  = entry.getValue();
		}
	}
}
