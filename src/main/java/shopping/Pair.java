package shopping;

// this E *declares* an *instance* generic parameter
public class Pair<E> {
  protected E left, right;

  public Pair(E left, E right) {
    this.left = left;
    this.right = right;
  }

  public E getLeft() {
    return left;
  }

  public void setLeft(E left) {
    this.left = left;
  }

  public E getRight() {
    return right;
  }

  public void setRight(E right) {
    this.right = right;
  }

//  public void setBoth(List<E> le)
  @Override
  public String toString() {
    return "Pair{" +
        "left=" + left +
        ", right=" + right +
        '}';
  }

//  public static void doStuff(E something) {}
}
