public class BuildTreeConst {
  public BuildTreeConst left;
  public BuildTreeConst right;
  
  /**
   * Build a full binary tree with constant height
   */

  public static void main(String[] args) {
    int n = 5;
    BuildTreeConst tree = build(n);
    inOrder(tree);
  }

  public BuildTreeConst() {
    this.left = null;
    this.right = null;
  }

  public static BuildTreeConst build(int height) {
    BuildTreeConst t = new BuildTreeConst();
    if (height > 0) {
      BuildTreeConst l = build(height - 1);
      BuildTreeConst r = build(height - 1);
      t.left = l;
      t.right = r;
    }
    return t;
  }
  
  public static void inOrder(BuildTreeConst t) {
    if (t != null) {
      inOrder(t.left);
      inOrder(t.right);
    }
  }
}

