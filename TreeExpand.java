public class TreeExpand {
  public TreeExpand left;
  public TreeExpand right;
  
  /**
   * Build a list of length n - 3
   * At the end build a tree of height 3
   */

  public static void main(String[] args) {
    int n = args.length;
    TreeExpand tree = build(n);
  }

  public TreeExpand() {
    this.left = null;
    this.right = null;
  }

  public static TreeExpand build(int length) {
    TreeExpand t = new TreeExpand();
    if (length > 3) {
      length--;
      t.left = build(length);
    } else {
      t.left = expand(length);
    }
    return t;
  }

  public static TreeExpand expand(int length) {
    TreeExpand t = new TreeExpand();
    if (length > 0) {
      length--;
      t.left = expand(length);    
      t.right = expand(length);
    }
    return t;
  }
}

