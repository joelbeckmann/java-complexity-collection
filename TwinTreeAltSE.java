public class TwinTreeAltSE {
  public TwinTreeAltSE left;
  public TwinTreeAltSE right;

  /*
  * creates a tree like this
  *
  *   /\
  *  /\ \
  * /\ \ \
  *
  *
  * @author Joel Beckmann
  */

  public static void main(String[] args) {
    int n = args.length;
    TwinTreeAltSE tree = new TwinTreeAltSE();
    build(tree, n);
    inOrder(tree);
  }

  public TwinTreeAltSE() {
    this.left = null;
    this.right = null;
  }

  public static void build(TwinTreeAltSE t, int height) {
    if (height > 0) {
      height--;
      TwinTreeAltSE l = new TwinTreeAltSE();
      TwinTreeAltSE r = new TwinTreeAltSE();
      t.left = l;
      t.right = r;
      build(l, height);
      buildRight(r, height);
    }
  }

  public static void buildRight(TwinTreeAltSE t, int height) {
    if (height > 0) {
      height--;
      TwinTreeAltSE r = new TwinTreeAltSE();
      t.right = r;
      buildRight(r, height);
    }
  }

  private static void inOrder(TwinTreeAltSE node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    inOrder(node.right);
  }
}
