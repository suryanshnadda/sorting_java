class insertionsort {

  void insertion(int a[]) {
    int len = a.length;

    for (int i = 1; i < len; i++) {
      int key =a[i];
  int j=i-1;
      while(j>=0 && a[j]>key)
      {
        a[j+1]=a[j];
        j--;
      }
      a[j+1]=key;

    }
    for (int i = 0; i < len; i++) {

      System.out.println(a[i]);
    }

  }

}

class Main {
  public static void main(String[] args) {
    insertionsort obj = new insertionsort();
    int a[] = new int[] { 0,-1,3, 1, 5, 2, 4, 2, 3,43,43,4,32,4,2 };
    obj.insertion(a);
  }
}