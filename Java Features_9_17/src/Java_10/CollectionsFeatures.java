package Java_10;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CollectionsFeatures {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		list.add(3);list.add(5);list.add(6);list.add(8);list.add(9);
		var list1 = list.stream().filter(i -> i%3==0).collect(Collectors.toList()); 
		var list2 = list.stream().filter(i -> i%3==0).collect(Collectors.toUnmodifiableList()); // new feature
		list1.add(10);
		list2.add(10); // it throw an error UnSupportedOperation because of ImmutableCollections
	}

}
