public class TwinTree {
  public TwinTree left;
  public TwinTree right;
  
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
    TwinTree tree = build(n);
    inOrder(tree);
  }

  public TwinTree() {
    this.left = null;
    this.right = null;
  }

  public static TwinTree build(int height) {
    TwinTree t = new TwinTree();
    if (height > 0) {
      height--;
      t.left = build(height);
      t.right = buildRight(height);
    }
    return t;
  }

  public static TwinTree buildRight(int height) {
    TwinTree t = new TwinTree();
    if (height > 0) {
      height--;
      t.right = buildRight(height);
    }
    return t;
  }
  
  private static void inOrder(TwinTree node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    inOrder(node.right);
  }
}

