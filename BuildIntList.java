public class BuildIntList {
  public BuildIntList next;
  public int value;
  
  public BuildIntList(int i) {
    this.next = null;
    this.value = i;
  }

  public static BuildIntList build(int n) {
    if(n <= 0) {
      return null;
    } else {
      BuildIntList l = new BuildIntList(n);
      l.next = build(n-1);
      return l;
    }
  }

  public static void main(String[] args) {
    BuildIntList l = build(args.length);
    while(l.next != null) {
      l = l.next;
    }
  }
}

