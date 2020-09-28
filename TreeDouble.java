public class TreeDouble {
  public TreeDouble left;
  public TreeDouble right;
  
  /**
   * Build a tree by adding elements to the left n times recursively
   * When going up the recursion, add an element to the right of each element
   * 
   *    /\
   *   /\
   *  /\
   *
   *
   * @author Joel Beckmann
   */

  public static void main(String[] args) {
    int n = args.length;
    TreeDouble tree = build(n);
    inOrder(tree);
  }

  public TreeDouble() {
    this.left = null;
    this.right = null;
  }

  public static TreeDouble build(int height) {
    TreeDouble t = new TreeDouble();
    if (height > 0) {
      t.left = build(height - 1);
      TreeDouble d = new TreeDouble();
      t.right = d;
    }
    return t;
  }
  
  private static void inOrder(TreeDouble node) {
    if (node == null) {
        return;
    }

    inOrder(node.left);
    inOrder(node.right);
  }
    
}

