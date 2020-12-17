package shopping;

import java.time.LocalDate;

public class UseAPair {
  public static void main(String[] args) {
//    Pair<String> p = new Pair<>("Fred", LocalDate.now());
    Pair<String> p = new Pair<>("Fred", "Jones");
    String first = p.getLeft();
//    p.setRight(LocalDate.now());
    p.setRight("Jones-Barnes");

    Pair<LocalDate> pld = new Pair(LocalDate.now(), LocalDate.now().plusDays(3));
  }
}
