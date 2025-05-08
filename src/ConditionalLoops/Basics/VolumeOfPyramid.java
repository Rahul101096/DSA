//Volume Of Pyramid
package ConditionalLoops.Basics;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        double baseArea = 25.0; // Area of the base of the pyramid
        double height = 10.0; // Height of the pyramid
        double volume = (1.0 / 3.0) * baseArea * height; // Volume formula for pyramid
        System.out.println("Volume of the pyramid with base area " + baseArea + " and height " + height + " is: " + volume);
    }
}
