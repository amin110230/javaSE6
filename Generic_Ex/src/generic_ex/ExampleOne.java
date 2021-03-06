package generic_ex;

import java.util.ArrayList;
import java.util.List;

public class ExampleOne {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(2)); // add any type object
        list.add("a String"); // add any type object
        System.out.println((Integer) list.get(0)); //explicit casting needed
        System.out.println((String) list.get(1)); //explicit casting needed
        
        List<String> myStrList = new ArrayList();
        myStrList.add("a String");
//        myStrList.add(new Integer(2)); // compile time type safety
        System.out.println(myStrList.get(0));
        for (String s : myStrList) {
            System.out.println(s); // no explicit casting needed
        }

    }

}
