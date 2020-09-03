public class BuildAppendSE {
  public BuildAppendSE next;
  
  /**
   * Build list appList with length n
   * Then build list with length n
   * Then append appList to list
   */

  public static void main(String[] args) {
    int n = args.length;
    BuildAppendSE list = new BuildAppendSE();
    BuildAppendSE appList = new BuildAppendSE();
    append(list, appList, n);
    while (list.next != null) {
      list = list.next;
    }
  }

  public BuildAppendSE() {
    this.next = null;
  }

  public static void append(BuildAppendSE l, BuildAppendSE al, int length) {
    build(al, length);
    buildAppend(l, al, length);
  }
  
  public static void build(BuildAppendSE l, int length) {
    if (length > 0) {
      length--;
      BuildAppendSE n = new BuildAppendSE();
      l.next = n;
      build(n, length);
    }
  }
  
  public static void buildAppend(BuildAppendSE l, BuildAppendSE al, int length) {
    if (length > 0) {
      length--;
      BuildAppendSE n = new BuildAppendSE();
      l.next = n;
      buildAppend(n, al, length);
    } else {
      l.next = al;
    }
  }
}

