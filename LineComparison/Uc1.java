package LineComparison;

import java.util.Scanner;

public class Uc1 {
    public static void main(String[] args) {
        System.out.println("Welcome To line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);

        //Variable
        System.out.println("Enter x1 value :");
        int x1 = sc.nextInt();
        System.out.println("Enter x2 value :");
        int x2 = sc.nextInt();
        System.out.println("Enter y1 value :");
        int y1 = sc.nextInt();
        System.out.println("Enter y2 value :");
        int y2 = sc.nextInt();

        //Computation
        int data = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The Length Of Cartesian Equation is :" + data);
    }
}
