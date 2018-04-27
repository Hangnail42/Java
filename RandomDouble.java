import java.util.*;
class RandomDouble {
  public static void main (String args[])throws InterruptedException{
    double value = 0;
    int i; // for loop counter
    int max = 10; // maximum number of cards or random values
      int count = 0;
      double firstmin = -1.0;
        System.out.println("* * * * * * * * * *");

        for (i = 0; i < max; i++){
          value = Math.random()*52;
          if(i == 0)firstmin = value;
          if(value > firstmin) count++;

          System.out.println("\t "+value);
          Thread.sleep(250);
        }
        System.out.println("\n count = "+count);


      }//end main
}//end class
