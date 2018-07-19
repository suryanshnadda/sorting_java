class bubblesort {

  void bubble(int a[]) {
    int len = a.length;

    for (int i = 0; i < len; i++) {
    

      for (int j = 0; j < len-1-i; j++) {

            if(a[j]>a[j+1])
            {
              int temp =a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
            }
         
      }
      

    }
    for (int i = 0; i < len; i++) {

      System.out.println(a[i]);
    }

  }

}

class Main {
  public static void main(String[] args) {
    bubblesort obj = new bubblesort();
    int a[] = new int[] { 0,-1,3, 1, 5, 2, 4, 2, 3,43,43,4,32,4,2 };
    obj.bubble(a);
  }
}