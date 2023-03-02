package ro.sda.fundamentals._2_conditional_statements;

/*
Write a method named area with one double parameter named radios.
The method need to return a double value that represents the area of a circle.
If the parameter radius is negative then return -1.0 to represent an invalid value.
Write another overloaded method with 2 parameters x and y (both doubles),
where x and y represent the sides of a rectangle.
The method need to return an area of an rectangle.
If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
For formulas and PI value please check the tips below.
Examples of input/output:
*   area(5.0); should return 78.53975
*   area(-1); should return -1 since the parameter is negative
*   area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
*   area(-1.0, 4.0); should return -1 since the first parameter is negative.
*/
public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(2.75));
        System.out.println(area(-5.9));
        System.out.println(area(10.2, 3.7));
        System.out.println(area(-2, 4));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return radius * radius * 3.14;

    }

    // method overloading is when we have a method
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }
}
