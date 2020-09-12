public class BuildTree {
  public BuildTree left;
  public BuildTree right;
  
  /**
   * Build a full binary tree with height n
   */

  public static void main(String[] args) {
    int n = args.length;
    BuildTree tree = build(n);
    inOrder(tree);
  }

  public BuildTree() {
    this.left = null;
    this.right = null;
  }

  public static BuildTree build(int height) {
    BuildTree t = new BuildTree();
    if (height > 0) {
      BuildTree l = build(height - 1);
      BuildTree r = build(height - 1);
      t.left = l;
      t.right = r;
    }
    return t;
  }
  
  public static void inOrder(BuildTree t) {
    if (t != null) {
      inOrder(t.left);
      inOrder(t.right);
    }
  }
}

