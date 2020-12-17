package shopping;

public class Store {
  public static void main(String[] args) {
    ClothingPair<Glove> pg = new ClothingPair<>(new Glove(5, "Red"), new Glove(6, "Red"));
    ClothingPair<Glove> pg2 = new ClothingPair<>(new Glove(5, "Blue"), new Glove(5, "Red"));

    System.out.println("gloves match " + pg.isMatched());
    System.out.println("other gloves match " + pg2.isMatched());
  }
}
