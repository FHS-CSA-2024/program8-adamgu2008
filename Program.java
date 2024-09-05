//import stuff here
import java.lang.Math;
import java.util.Scanner;
//Your code here
public class Program8{
    public static void main(String[] args){
        //request user input
        int val1;
        int val2;

        Scanner getVal1 = new Scanner(System.in);
        System.out.print("Enter value: ");
        val1 = getVal1.nextInt();

        Scanner getVal2 = new Scanner(System.in);
        System.out.print("Enter value: ");
        val2 = getVal2.nextInt();

        //operations
        int sum = val1+val2;
        int dif = val1-val2;
        int product = val1*val2;
        double avg = (double) (val1+val2)/2;
        int dist = Math.abs(dif);
        int max = (Math.abs(val1-val2) + val1 +val2)/2;
        int min = (-dist+val1+val2)/2;

        //prints
        System.out.println("sum: "+sum);
        System.out.println("difference: "+dif);
        System.out.println("product: "+product);
        System.out.println("average: "+avg);
        System.out.println("distance: "+dist);
        System.out.println("maximum: "+max);
        System.out.println("minimum: "+min);
    }
}
//Paste console output below:
/*
Enter value: 13
Enter value: 20
sum: 33       
difference: -7
product: 260  
average: 16.5 
distance: 7   
maximum: 20   
minimum: 13 
*/
