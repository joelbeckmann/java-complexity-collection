public class BuildList {
  public BuildList next;
  
  public BuildList() {
    this.next = null;
  }

  public static BuildList build(int n) {
    if(n <= 0) {
      return null;
    } else {
      BuildList l = new BuildList();
      l.next = build(n-1);
      return l;
    }
  }

  public static void main(String[] args) {
    BuildList l = build(args.length);
    while(l.next != null) {
      l = l.next;
    }
  }
}

