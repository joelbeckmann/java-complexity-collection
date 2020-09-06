public class TwinTreeSE {
  public TwinTreeSE left;
  public TwinTreeSE right;
  
  /*
  * creates a tree like this
  *
  *   /\
  *  /\ \
  * /\ \ \
  *
  */

  public static void main(String[] args) {
    int n = args.length;
    TwinTreeSE tree = new TwinTreeSE();
    build(tree, n);
    inOrder(tree);
  }

  public TwinTreeSE() {
    this.left = null;
    this.right = null;
  }

  public static void build(TwinTreeSE t, int height) {
    if (height > 0) {
      TwinTreeSE l = new TwinTreeSE();
      TwinTreeSE r = new TwinTreeSE();
      t.left = l;
      t.right = r;
      build(l, height - 1);
      buildRight(r, height - 1);
    }
  }

  public static void buildRight(TwinTreeSE t, int height) {
    if (height > 0) {
      TwinTreeSE r = new TwinTreeSE();
      t.right = r;
      buildRight(r, height - 1);
    }
  }
  
  private static void inOrder(TwinTreeSE node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    inOrder(node.right);
  }
}

