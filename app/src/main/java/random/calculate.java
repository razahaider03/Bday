package random;

import java.util.*;
import java.util.Random;
import java.util.Scanner;



public class calculate {

    public static
    void main ( String[] args ) {
        System.out.println("Hello everyone!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of person & No. of simulation to be done");
        int size = sc.nextInt();
        int count = sc.nextInt();
        sc.close();
        int duplicate=0;
        for ( int i=0; i<count; i++ ) {
            if (day(size,i+1)==1){
                duplicate++;
            }
        }
            System.out.println((double) duplicate/count*100);
    }
        private static int day(int size, int seed){
            Random rand=new Random();
            rand.setSeed(seed);
            List<Integer> Bday=new ArrayList<>(size);
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
