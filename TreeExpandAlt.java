public class TreeExpandAlt {
  public TreeExpandAlt left;
  public TreeExpandAlt right;
  
  /**
   * Build a list of length n - 3
   * At the end build a tree of height 3
   *
   * @author Joel Beckmann
   */

  public static void main(String[] args) {
    int n = args.length;
    TreeExpandAlt tree = build(n);
  }

  public TreeExpandAlt() {
    this.left = null;
    this.right = null;
  }

  public static TreeExpandAlt build(int length) {
    TreeExpandAlt t = new TreeExpandAlt();
    if (length > 3) {
      length--;
      t.left = build(length);
    } else {
      t.left = expand(length);
    }
    return t;
  }

  public static TreeExpandAlt expand(int length) {
    TreeExpandAlt t = new TreeExpandAlt();
    if (length > 0) {
      length--;
      t.left = expand(length);    
      t.right = expand(length);
    }
    return t;
  }
}

