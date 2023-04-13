/**

               *Ali Şer Gök
               *ID: 2022719075
               *Date: 04/01/2023
 *
 * I got all the coefficients and constant term of a polynomial from the user, respectively.
 * I asked the user to enter the interval value , minimum value and maximum value respectively.
 * I created a new object by assigning the coefficients entered by the user to the Polynomial object.
 * Using the setDeltaX() method, I assigned the value entered by the user to the deltaX value of the object I created.
 * Finally, I call the result of the integral calculation by assigning the minimum and
 *                   maximum values entered by the user to the computeIntegral() method.
 * I printed the result.

 */

import java.util.Scanner;

public class aliser_gok {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Enter the coefficient a (the coefficient of the 3rd degree x value.)");
        double a=input.nextDouble();

        System.out.println("Enter the coefficient b (the coefficient of the 2nd degree x value.)");
        double b=input.nextDouble();

        System.out.println("Enter the coefficient c (the coefficient of the 1st degree x value.)");
        double c=input.nextDouble();

        System.out.println("Enter the coefficient d (constant term)");
        double d=input.nextDouble();

        System.out.println("Enter the deltaX value");
        double x=input.nextDouble();

        System.out.println("Enter the minimum value of x");
        double min=input.nextDouble();

        System.out.println("Enter the maximum value of x");
        double max=input.nextDouble();




        System.out.println("-------------");
        System.out.println(a+"x^3 "+b+"x^2 "+c+"x "+d+           //I printed it so that the user can see the values entered.
                "\n in the range ("+min+" - "+max+")"+
                "\n deltaX is: "+x);
        System.out.println();

        Polynomial p = new Polynomial(a, b, c, d);
        p.setDeltaX(x);
        System.out.println("Result: "+p.computeIntegral(min, max));
        System.out.println("-------------");

        /*
                 * If you wish, you can use the codes below to find the
                 * correct answers to the polynomials written in the assignment.


        System.out.println("-------------");
        System.out.println("f(x) = x^2-2 in the range (0,2)");

        Polynomial p1 = new Polynomial(0, 1, 0, -2);
        p1.setDeltaX(0.0001);
        System.out.println(p1.computeIntegral(0, 2));


        System.out.println("-------------");
        System.out.println("f(x) = 9x^2-2x-18 in the range (-2,3)\n");
        Polynomial p2 = new Polynomial(0, 9, -2, -18);
        p2.setDeltaX(0.0001);
        System.out.println(p2.computeIntegral(-2, 3));


        System.out.println("-------------");
        System.out.println("f(x) = 3x^3-2x-15 in the range (-4,3)");
        Polynomial p3 = new Polynomial(3, 0, -2, -15);
        p3.setDeltaX(0.0001);
        System.out.println(p3.computeIntegral(-4, 3));


        System.out.println("-------------");
        System.out.println("f(x) = 3 in the range (-6,6)");
        Polynomial p4 = new Polynomial(0, 0, 0, 3);
        p4.setDeltaX(0.0001);
        System.out.println(p4.computeIntegral(-6, 6));
        
         */





    }
}