public class BuildTree {
  public BuildTree left;
  public BuildTree right;
  
  /**
   * Build a full binary tree with height n
   */

  public static void main(String[] args) {
    int n = args.length;
    BuildTree tree = build(n);
  }

  public BuildTree() {
    this.left = null;
    this.right = null;
  }

  public static BuildTree build(int height) {
    BuildTree t = new BuildTree();
    if (height > 0) {
      height = height - 1;
      BuildTree l = build(height);
      BuildTree r = build(height);
      t.left = l;
      t.right = r;
    }
    return t;
  }
}

