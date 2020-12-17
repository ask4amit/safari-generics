package shopping;

//public class GlovePair extends Pair<Glove> {
// NO, declares TWO type params, one horribly called String!!
//public class ClothingPair<E extends Sized, String> extends Pair<E> {
// multiple type constraints use &, can have many interfaces.
// Can (though questionable design) have a SINGLE class, must come first
public class ClothingPair<E extends /*Object &*/ Sized & Colored> extends Pair<E> {
// String x;
//  String name = "Fred";

  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean isMatched() {
    return left.getSize() == right.getSize() &&
        left.getColor().equals(right.getColor());
  }


  public static <F extends Sized & Colored> boolean match(F left, F right) {
    return left.getSize() == right.getSize() &&
        left.getColor().equals(right.getColor());
  }
}
