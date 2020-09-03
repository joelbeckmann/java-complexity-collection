public class BuildAppend {
  public BuildAppend next;
  
  /**
   * Build list appList with length n
   * Then build list with length n
   * Then append appList to list
   */

  public static void main(String[] args) {
    int n = args.length;
    BuildAppend list = append(n);
    while (list.next != null) {
      list = list.next;
    }
  }

  public BuildAppend() {
    this.next = null;
  }

  public static BuildAppend append(int length) {
    BuildAppend al = build(length);
    return buildAppend(al, length);
  }
  
  public static BuildAppend build(int length) {
    BuildAppend l = new BuildAppend();
    if (length > 0) {
      length--;
      l.next = build(length);
    }
    return l;
  }
  
  public static BuildAppend buildAppend(BuildAppend al, int length) {
    BuildAppend l = new BuildAppend();
    if (length > 0) {
      length--;
      l.next = buildAppend(al, length);
    } else {
      return al;
    }
    return l;
  }
}

