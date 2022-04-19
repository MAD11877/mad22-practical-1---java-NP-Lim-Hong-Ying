import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    int integer = -2;
    ArrayList<Integer> intstore = new ArrayList<Integer>();

    while (integer != -1) {
      System.out.print("Enter an integer (-1 to stop): ");
      integer = in.nextInt();
      intstore.add(integer);
    }

    Collections.sort(intstore);
    int listsize = intstore.size();
    int mostfreqint = 0;
    int freqofint = 0;
    int currentint = 0;
    int currentfreq = 0;

    for (int i = 0; i < listsize; i++) {
      if (intstore.get(i) == currentint) {
        currentfreq++;
      }

      else if (intstore.get(i) != currentint) {
        if (currentfreq > freqofint) {
          freqofint = currentfreq;
          mostfreqint = currentint;

          currentint = intstore.get(i);
          currentfreq = 1;
        }

        else {
          currentint = intstore.get(i);
          currentfreq = 1;
        }
      }
    }

    if (currentfreq > freqofint) {
      freqofint = currentfreq;
      mostfreqint = currentint;
    }

    System.out.println(intstore);
    System.out.println(mostfreqint);
  }
}
