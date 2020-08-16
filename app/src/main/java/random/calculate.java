package random;

import java.util.*;
import java.util.Random;



public class calculate {

    public static
    void main ( String[] args ) {
        System.out.println("hello everyone");
        //System.out.println(day(28));
        int count=2000,duplicate=0;
        for ( int i=0; i<count; i++ ) {
            // day(28,i+1);
            if (day(20,i+1)==1){
                duplicate++;
            }
        }
            System.out.println((double) duplicate/count*100);
    }
        private static int day(int size, int seed){
            Random rand=new Random();
            rand.setSeed(seed);
            List<Integer> Bday=new ArrayList<>(size);
            // List<Integer> rep = new ArrayList<>(10); // for check which are same.
            int loop=0, same=0;
            do {
                int days=rand.nextInt(365);

                if (!Bday.contains(days)) {
                    Bday.add(days);
                } else if (Bday.contains(days)) {
                    same++;
                    break;
                }
                loop++;
            } while (loop != size);
            return same;
        }

}
