public class TreeExpandSE {
  public TreeExpandSE left;
  public TreeExpandSE right;
  
  /**
   * Build a list of length n - 3
   * At the end build a tree of height 3
   *
   * @author Joel Beckmann
   */

  public static void main(String[] args) {
    int n = args.length;
    TreeExpandSE tree = new TreeExpandSE();
    build(tree, n);
  }

  public TreeExpandSE() {
    this.left = null;
    this.right = null;
  }

  public static void build(TreeExpandSE t, int length) {
    TreeExpandSE l = new TreeExpandSE();
    t.left = l;
    if (length > 3) {
      build(l, length - 1);
    } else {
      expand(l, length);
    }
  }

  public static void expand(TreeExpandSE t, int length) {
    if (length > 0) {
      TreeExpandSE l = new TreeExpandSE();
      TreeExpandSE r = new TreeExpandSE();
      t.left = l;
      t.right = r;
      expand(l, length - 1);    
      expand(r, length - 1);
    }
  }
}

