package Java_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollections_BeforeJava9 {
	public static void main(String[] args) {
		List<String> sportList = new ArrayList<String>();
        sportList.add("Hockey");
        sportList.add("Cricket");
        sportList.add("Tennis");
         
        List<String> unModifiableSportList = Collections.unmodifiableList(sportList);
        HashMap<Integer,Integer> map = new HashMap<>();

        System.out.println(sportList);    //Output : [Hockey, Cricket, Tennis]
         
        System.out.println(unModifiableSportList);    //Output : [Hockey, Cricket, Tennis]
         
//        unModifiableSportList.add("Wrestling");     //It gives run-time error
         
        sportList.add("Kabaddi");      //It gives no error and will be reflected in unModifiableSportList
         
        System.out.println(sportList);    //Output : [Hockey, Cricket, Tennis, Kabaddi]
         
        System.out.println(unModifiableSportList);    //Output : [Hockey, Cricket, Tennis, Kabaddi]
  	}
}
