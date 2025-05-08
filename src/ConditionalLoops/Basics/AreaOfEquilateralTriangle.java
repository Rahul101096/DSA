//Area Of Equilateral Triangle
package ConditionalLoops.Basics;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        double side = 5.0; // Length of the side of the equilateral triangle
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2); // Area formula for equilateral triangle
        System.out.println("Area of the equilateral triangle with side " + side + " is: " + area);
    }
}
