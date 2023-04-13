# Integral-Computation
The total of the area between the x-axis and the polynomial according to the left-hand Riemann method

Assignment 2 Integral Computation


Write a Java program to compute integral of a maximum 3rd degree polynomial function of the form f(x) = ax3 + bx2 + cx + d using the left-hand Riemann sum method. Details of the Reimann sum method can be found at:
https://www.storyofmathematics.com/riemann-sum/
Method basically forms rectangles of width deltaX and the integral value is approximated by the area sum of these
rectangles as shown in Figure 1. Note that the integral can also be negative depending on the function. Your program
should get the function coefficients a, b, c, d and the deltaX from the user and output the approximated integral
value.

Figure 1. Illustration of numerical computation of an integral.
Image taken from ![image](https://user-images.githubusercontent.com/98125147/231752866-71f21be6-14e7-4093-8ca4-ac40411e4271.png)

In your program, you should use Polynomial class which stores 1) function coefficients in an array list and 2) deltaX
as data fields. All data fields should be private. The constructor should be called as: Polynomial p = new
Polynomial(a,b,c,d). You need to implement the following public class methods:
1. valueAt(x: double): returns double. This method returns the function value f(x) at x.
2. setDeltaX(deltaX: double): void. This method sets the deltaX parameter such as 0.0001
3. computeIntegral(minX: double, maxX: double): returns double. This method computes the Riemann sum and
returns the approximate integral.
In your report, provide the user input and outputs for the following polynomials using a very small deltaX. Note
that user may enter any polynomial up to a 3rd degree.

f(x) = x2-2 in the range (0,2)

f(x) = 9x2-2x-18 in the range (-2,3)

f(x) = 3x3-2x-15 in the range (-4,3)

f(x) = 3 in the range (-6,6)

You are free to design how a user inputs the polynomial and deltaX values.

