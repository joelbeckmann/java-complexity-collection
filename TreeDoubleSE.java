public class TreeDoubleSE {
  public TreeDoubleSE left;
  public TreeDoubleSE right;
  
  /**
   * Build a tree by adding elements to the left n times recursively
   * When going up the recursion, add an element to the right of each element
   * 
   *    /\
   *   /\
   *  /\
   *
   */

  public static void main(String[] args) {
    int n = args.length;
    TreeDoubleSE tree = new TreeDoubleSE();
    TreeDoubleSE.build(tree, n);
    inOrder(tree);
  }

  public TreeDoubleSE() {
    this.left = null;
    this.right = null;
  }

  public static void build(TreeDoubleSE t, int height) {
    if (height > 0) {
      TreeDoubleSE l = new TreeDoubleSE();
      t.left = l;
      build(l, height -1);
      TreeDoubleSE r = new TreeDoubleSE();
      t.right = r;
    }
  }
  
  private static void inOrder(TreeDoubleSE node) {
    if (node == null) {
        return;
    }

    inOrder(node.left);
    inOrder(node.right);
  }
}

