package Java_11;

import java.util.stream.Collectors;

public class StringAPI {
	public static void main(String[] args) {
		String str = " ";
		System.out.println(str.isBlank());
		
		str = "I\nam\nthe\ncreator of my destiny";
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));
		
		// java 11 supports unicode
		char c = '\u2000'; // Unicode represents ? mark
		str+=c;
		System.out.println(str);
		System.out.println(str.strip());  // remove unicodes
		System.out.println(str.stripLeading());  // remove unicode at first
		System.out.println(str.stripTrailing()); // remove unicode atlast
	}
}
