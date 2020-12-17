package usealist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseAList {
  public static <E> void doStuff(E ... values) {
    System.out.println(values.getClass().getName()); // Might degenerate to array of OBJECT!
    for (E v : values) {
      System.out.println(v);
    }
  }

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

//    breakAList(names);
    String zero = names.get(0);
    System.out.println(zero);
//    System.out.println(names.get(4));

    // Type Erasure
    // compile time, List, where E is String becomes -> List

    // what about instanceof???
    if (names instanceof List/*<String>*/) {
      System.out.println("it's a list");
    }

    // "non reifiable type" something for which type info is
    // missing or incomplete at runtime
    // E, List<String>, E[]

    // Java's generics, DON'T play with primitives:
//    List<int> li; // NO :(
    // this is why we have autoboxing and autounboxing
    List<Integer> li = new ArrayList<>();
    li.add(3); // li.add(Integer.valueOf(3));

//    doStuff(new int [] {1, 2, 3});
    doStuff(1, 2, 3);
  }
}
