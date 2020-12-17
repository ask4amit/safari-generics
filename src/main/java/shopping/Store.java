package shopping;

public class Store {
  public static <F extends Sized & Colored> boolean match(F left, F right) {
    return left.getSize() == right.getSize() &&
        left.getColor().equals(right.getColor());
  }
  public static void main(String[] args) {
    ClothingPair<Glove> pg = new ClothingPair<>(new Glove(5, "Red"), new Glove(6, "Red"));
    ClothingPair<Glove> pg2 = new ClothingPair<>(new Glove(5, "Blue"), new Glove(5, "Red"));

    System.out.println("gloves match " + pg.isMatched());
    System.out.println("other gloves match " + pg2.isMatched());

    System.out.println("Proposed pair matches? " +
        ClothingPair./*<Shoe>*/match(new Shoe(5, "Red"), new Shoe(6, "Red")));

    System.out.println("Proposed pair matches? " +
//        ClothingPair.match(new Glove(5, "Red"), new Glove(6, "Red")));
        Store.match(new Glove(5, "Red"), new Glove(6, "Red")));
  }
}
