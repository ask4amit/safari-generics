package methodinvocation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Example {
  public static <E> List<E> filter(List<E> in, Predicate<? super E> test) {
    List<E> results = new ArrayList<>();

    for (E e : in) {
      if (test.test(e)) {
        results.add(e);
      }
    }

    return results;
  }
  public static void main(String[] args) {
    List<String> ls = List.of("Fred", "Jim", "Sheila");

    Predicate<CharSequence> pcs = s -> s.length() > 3;
    // defines boolean test(CharSequence cs);

//    Predicate<String> pstr = s -> s.length() > 3;
    System.out.println("Long strings are " +
        filter(ls, pcs));

    List<StringBuilder> lsb = List.of(new StringBuilder("FredX"), new StringBuilder("JiX"),
        new StringBuilder("SheilaX"));

//    Predicate<StringBuilder> pStrB = s -> s.length() > 3;
    System.out.println("Long strings are " +
        filter(lsb, pcs));


  }
}
