import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

import java.util.Scanner;

public class FindEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0,count=0;
        double sum =0, average;

        while (i < 100){
            i ++;
            if (i %3 == 0 && i %4==0 ) {
                sum = sum + i;
                count++;

            }
        }
        average = sum/count;
        System.out.println(average);

    }
}
