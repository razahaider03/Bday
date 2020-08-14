package random;

import java.util.*;
import java.util.Random;

public class calculate {

  public static void main(String[] args) {
    System.out.println(day(20));
  }

  public static List<Integer> day(int size) {
    Random rand = new Random();
    List<Integer> name = new ArrayList<Integer>(size);
    int count = 0;
    do {
      int days = rand.nextInt(365);
      name.add(days);
      count++;
    } while (count != size);
    return name;
  }
}
