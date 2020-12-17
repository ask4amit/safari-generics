package usealist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseAList {
  public static void breakAList(List l) {
    l.add(LocalDate.now());
  }

  public static void main(String[] args) {
//    List<String> names = new ArrayList<String>(List.of(/*LocalDate.now(), */"Alice"));
    List<String> names = new ArrayList<>(List.of(/*LocalDate.now(),*/ "Alice"));
//    names = Collections.checkedList(names, String.class);
    names.add("Fred");
    names.add("Jim");
    names.add("Sheila"); // lists are extensible, nicer than arrays

//    names.add(LocalDate.now());
//    String zero = (String)names.get(0);
    breakAList(names);
    String zero = names.get(0);
    System.out.println(zero);
    System.out.println(names.get(4));
    // so far so good
  }
}
