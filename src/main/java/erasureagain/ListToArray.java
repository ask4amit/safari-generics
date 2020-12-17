package erasureagain;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

  public static <F, E extends F> F[] toArray(List<E> in, Class<F> cl) {
    E[] result = (E[]) Array.newInstance(cl, in.size());

    for (int i = 0; i < result.length; i++) {
      result[i] = in.get(i);
    }

    return result;
  }

  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim", "Sheila");

//    String [] namesArr = toArray(names, String.class);
    CharSequence [] namesArr = toArray(names, CharSequence.class);
    System.out.println(namesArr.getClass().getName());

    for (CharSequence s : namesArr) {
      System.out.println(s);
    }

    namesArr[0] = new StringBuilder();
  }
}
