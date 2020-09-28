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
  *
  * @author Joel Beckmann
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
      t.left = build(height - 1);
      t.right = buildRight(height - 1);
    }
    return t;
  }

  public static TwinTree buildRight(int height) {
    TwinTree t = new TwinTree();
    if (height > 0) {
      t.right = buildRight(height - 1);
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

