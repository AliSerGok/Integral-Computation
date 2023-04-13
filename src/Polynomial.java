/**
                 *Ali Şer Gök
                 *ID: 2022719075
                 *Date: 04/01/2023
 *
 *
 * I start by creating a Polynomial class. Since I will use ArrayList, I am importing ArrayList class.
 * I created a constructer that will create a Polynomial object by taking all the coefficients of a polynomial from the user.
 * I created a method valueAt() that finds the polynomial value at any point x.
 * I created a setter method where we can assign a value to the deltaX variable.
 * I created the method computeIntegral() which calculates the integral value in certain ranges of my polynomial

 */

import java.util.ArrayList;

public class Polynomial {
    private ArrayList<Double> coefficients;   //coefficients list will store all coefficients of polynomial.

    private double deltaX;                    // deltaX variable will store the delta x value entered by user.


    /**
     * No-arg constructor
     */
    public Polynomial(){}

    /**
     * Constructor: Creates a polynomial by taking the @param a, @param b, @param c
     * and @param d from the user and storing them in the list.
     */
    public Polynomial(double a, double b, double c, double d) {
        this.coefficients = new ArrayList<>();
        this.coefficients.add(a);
        this.coefficients.add(b);
        this.coefficients.add(c);
        this.coefficients.add(d);
    }

    /**
     * Calculates the polynomial at point x
     * @param x is the x value on that x-axis of any polynomial that is between the minimum and maximum
     *         values on the x-axis. This x value is determined according to the deltaX value in the
     *         computeIntegral() method and assigned to the valueAt() method.
     * @return y is the value of the polynomial at that point.
     */
    public double valueAt(double x) {
        double y=0;
        for (int i = 0; i < this.coefficients.size(); i++) {
            y += this.coefficients.get(i) * Math.pow(x, coefficients.size()-(i+1));
        }

        return y;
    }

    /**
     * Assigns new values to the private deltaX variable
     * @param deltaX is the interval size value specified by the user.
     */
    public void setDeltaX(double deltaX) {
        this.deltaX = deltaX;
    }

    /**
     * Finds the rectangular area corresponding to each interval and sums them all.
     * @param minX is the minimum x value to start the field calculation. Assigned by the user.
     * @param maxX is the maximum value of x to terminate the field calculation. Assigned by the user.
     * @return integral: The polynomial value at each x point is found by multiplying by the interval size
     * (deltaX) and summing them all to calculate the integral. The x point to be calculated for
     * the x polynomial value is found by adding deltaX to each "i" value, starting from the minimum value.
     */
    public double computeIntegral(double minX, double maxX) {
        double integral = 0;
        for (double i = minX; i < maxX; i += this.deltaX) {
            integral += this.valueAt(i) * this.deltaX;
        }
        return integral;
    }
}