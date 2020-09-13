public class BuildTreeConstSE {
  public BuildTreeConstSE left;
  public BuildTreeConstSE right;
  
  /**
   * Build a full binary tree with constant height
   */

  public static void main(String[] args) {
    int n = 5;
    BuildTreeConstSE tree = new BuildTreeConstSE();
    build(tree, n);
    inOrder(tree);
  }

  public BuildTreeConstSE() {
    this.left = null;
    this.right = null;
  }

  public static void build(BuildTreeConstSE t, int height) {
    if (height > 0) {
      BuildTreeConstSE l = new BuildTreeConstSE();
      build(l, height - 1);
      BuildTreeConstSE r = new BuildTreeConstSE();
      build(r, height - 1);
      t.left = l;
      t.right = r;
    }
  }
  
  public static void inOrder(BuildTreeConstSE t) {
    if (t != null) {
      inOrder(t.left);
      inOrder(t.right);
    }
  }
}

