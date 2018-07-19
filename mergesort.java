class mergesort {

  void merge(int a[]) {
    int len = a.length;

    for (int i = 0; i < len; i++) {
      int mini = i;

      for (int j = i + 1; j < len; j++) {
        if (a[mini] > a[j]) {
          mini = j;
        }
      }
      int temp = a[i];
      a[i] = a[mini];
      a[mini] = temp;

    }
    for (int i = 0; i < len; i++) {

      System.out.println(a[i]);
    }

  }

}

class Main {
  public static void main(String[] args) {
    mergesort obj = new mergesort();
    int a[] = new int[] { 0,-1,3, 1, 5, 2, 4, 2, 3 };
    obj.merge(a);
  }
}