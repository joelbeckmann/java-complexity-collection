public class BuildTreeSE {
  public BuildTreeSE left;
  public BuildTreeSE right;
  
  /**
   * Build a full binary tree with height n
   *
   * @author Joel Beckmann
   */

  public static void main(String[] args) {
    int n = args.length;
    BuildTreeSE tree = new BuildTreeSE();
    build(tree, n);
    inOrder(tree);
  }

  public BuildTreeSE() {
    this.left = null;
    this.right = null;
  }

  public static void build(BuildTreeSE t, int height) {
    if (height > 0) {
      BuildTreeSE l = new BuildTreeSE();
      build(l, height - 1);
      BuildTreeSE r = new BuildTreeSE();
      build(r, height - 1);
      t.left = l;
      t.right = r;
    }
  }
  
  public static void inOrder(BuildTreeSE t) {
    if (t != null) {
      inOrder(t.left);
      inOrder(t.right);
    }
  }
}

