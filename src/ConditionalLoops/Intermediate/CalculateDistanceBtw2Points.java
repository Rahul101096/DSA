package ConditionalLoops.Intermediate;

import static java.awt.geom.Point2D.distance;

public class CalculateDistanceBtw2Points {
    public static void main(String[] args) {
        double x1 = 3.0; // x-coordinate of the first point
        double y1 = 4.0; // y-coordinate of the first point
        double x2 = 7.0; // x-coordinate of the second point
        double y2 = 1.0; // y-coordinate of the second point

        // Calculate the distance using the distance formula
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);

//        static double distance(int x1, int y1, int x2, int y2)
//        {
//            return Math.sqrt(Math.pow(x2 - x1, 2)
//                    + Math.pow(y2 - y1, 2) * 1.0);
//        }
//        // Driver code
//        public static void main(String[] args)
//        {
//            System.out.println(
//                    Math.round(distance(3, 4, 4, 3) * 100000.0)
//                            / 100000.0);
//        }

    }
}
