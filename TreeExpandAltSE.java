public class TreeExpandAltSE {
  public TreeExpandAltSE left;
  public TreeExpandAltSE right;
  
  /**
   * Build a list of length n - 3
   * At the end build a tree of height 3
   */

  public static void main(String[] args) {
    int n = args.length;
    TreeExpandAltSE tree = new TreeExpandAltSE();
    build(tree, n);
  }

  public TreeExpandAltSE() {
    this.left = null;
    this.right = null;
  }

  public static void build(TreeExpandAltSE t, int length) {
    TreeExpandAltSE l = new TreeExpandAltSE();
    t.left = l;
    if (length > 3) {
      length--;
      build(l, length);
    } else {
      expand(l, length);
    }
  }

  public static void expand(TreeExpandAltSE t, int length) {
    if (length > 0) {
      TreeExpandAltSE l = new TreeExpandAltSE();
      TreeExpandAltSE r = new TreeExpandAltSE();
      t.left = l;
      t.right = r;
      length--;
      expand(l, length);    
      expand(r, length);
    }
  }
}

