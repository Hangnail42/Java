import java.util.*;

class RandomShuffle {

  public static void printArray(int rInts[]){
    int match = 0;
    for (int i = 0; i < rInts.length; i++){
      System.out.print(rInts[i]+" ");
      if ((i+1) % 10 == 0)
        System.out.println();
        if (rInts[i] ==i)match++;
    }
    System.out.println("\n MATCHES : "+match+"\n");
  }
  public static int getMatches (int rInts[]){
    int match = 0;
    for (int i = 0; i < rInts.length; i++){
      //System.out.rint(rInts[i]+" ");
      //if ((i+1) % 10 == 0)
        //System.out.println();
        if (rInts[i] ==i)match++;
    }
    return match;
  }
  public static int[] swapInts(int baseInts[],int n, int last){
    int i;
    for(i = n; i < last-1; i++){
      baseInts[i] = baseInts[i+1];

    }
      baseInts[last-1] = -1;
    return baseInts;
  }
  public static int[] shuffle(int baseInts[],int randomInts[], int max){
    int i = 0;
    int last;
    int n;
    int temp;
    while (i < max){
      last = max-i;
      n = (int)(Math.random() *last);
      randomInts[i] = baseInts[n];
      baseInts[n] = -1;
      baseInts = swapInts(baseInts,n,last);
      i++;
    }
    return randomInts;
  }
  public static void main (String args[])throws InterruptedException{
    int i;
    int max = 52;
    int maxmatches = 0;
    int baseInts[] = new int[max];
    int randomInts[] = new int[max];
    int matches = 0;
    int count = 0;
    for(;;){
      if (count == 2147483647) break;
      count++;
      for (i = 0; i < max; i++) {
        baseInts[i] = i;
        randomInts[i] = -1;
      }
      System.out.println("\nBASE ARRAY NOT SHUFFLED* * * * * * * * * * * * *");
      printArray(baseInts);
      randomInts = shuffle(baseInts,randomInts,max);
      System.out.println("\nRANDOM ARRAY SHUFFLED * * * * * * * * * * * * *");
      printArray(randomInts);
      Thread.sleep(1000);
      matches = getMatches(randomInts);
      if (matches > maxmatches){maxmatches = matches;
        System.out.println("\n* MATCHES : "+matches+" * MAX MATCHES *"
        +maxmatches+" WITH "+count+" SHUFFLES ");
      }
    }
  }
}
