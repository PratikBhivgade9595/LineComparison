package LineComparison;

import java.util.Scanner;

public class Uc2 {
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
        System.out.println("Enter a1 value :");
        int a1 = sc.nextInt();
        System.out.println("Enter a2 value :");
        int a2 = sc.nextInt();
        System.out.println("Enter b1 value :");
        int b1 = sc.nextInt();
        System.out.println("Enter b2 value :");
        int b2 = sc.nextInt();

        //Computation
        int data1 = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The Length Of Cartesian Equation data1 is :" + data1);
        int data2 = (int) Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
        System.out.println("The Length Of Cartesian Equation data2 is :" + data2);

        Integer l1 = data1;
        Integer l2 = data2;

        if (l1.equals(l2)) {
            System.out.println("The length of Cartesion Equation is Same");
        } else
            System.out.println("The length of Cartesion Equation is Not Same");
    }
}
