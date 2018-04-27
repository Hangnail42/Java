class SumLoop{
  public static void main (String a[]){
    int value =Integer.parseInt(a[0]);
    System.out.println(value);
    int sum = 0;
    for (int i = 0; i<=value;i++){
      System.out.println(sum);
      sum = sum + i;
    }
  }
}
