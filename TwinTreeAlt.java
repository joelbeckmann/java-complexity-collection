public class TwinTreeAlt {
  public TwinTreeAlt left;
  public TwinTreeAlt right;
  
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
    TwinTreeAlt tree = build(n);
    inOrder(tree);
  }

  public TwinTreeAlt() {
    this.left = null;
    this.right = null;
  }

  public static TwinTreeAlt build(int height) {
    TwinTreeAlt t = new TwinTreeAlt();
    if (height > 0) {
      height--;
      t.left = build(height);
      t.right = buildRight(height);
    }
    return t;
  }

  public static TwinTreeAlt buildRight(int height) {
    TwinTreeAlt t = new TwinTreeAlt();
    if (height > 0) {
      height--;
      t.right = buildRight(height);
    }
    return t;
  }

  private static void inOrder(TwinTreeAlt node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    inOrder(node.right);
  }
}

