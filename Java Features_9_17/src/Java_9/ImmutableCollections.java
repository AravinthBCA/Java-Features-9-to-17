package Java_9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollections {
	public static void main(String[] args) {
		List<String> list = List.of("abc","def","hij"); // null not allow
//		list.add("asd"); // throw an error because it's already immutable
		Set<String> set = Set.of("abc","def"); // null not allow
//		set.add("asd"); // throw an error UnsupportedOperationException
		Map<Integer,String> map = Map.of(1,"string"); // null not allow
	}
}
