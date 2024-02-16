package Point;

import java.util.Scanner;

public class SixPointDistanceTester {
    private static Scanner input = new Scanner(System.in); //we will retrieve multipoints of x and y coordinates.

    public static void main(String[] args) {
        computeShortestDistance(enterPoint());
        //   enterPoint();
    }

    public static Point[] enterPoint(){
        Scanner scanner = new Scanner(System.in);
        Point[] points = new Point[6];
        System.out.println("Enter 6 points of x and y: ");

        for(int i = 0; i < 6; i++ ){
            System.out.print("Point "+ ('a' + i));
            String name = scanner.next();
            double x =scanner.nextDouble();
            double y = scanner.nextDouble();
            points[i] = new Point(input.nextDouble(), input.nextDouble());
        }
        return points;
    }


    public static void computeShortestDistance(Point[] points){

        //we will complete this part on Thursday
        double shortestDistance = Point.distance(points[0], points[1]);
        Point p1 = points[0];
        Point p2 = points[1] ;

        for(int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length; j++){
                double aDistance =  Point.distance(points[i], points[j]);
                if(aDistance < shortestDistance){
                    shortestDistance = aDistance;
                    p1 = points[i];
                    p2 = points[j];
                }
            }
        }

        System.out.printf("The shortest distance between ( %.1f,%.1f ) and (%.1f ,%.1f ) is (%.2f  )");

    }
}
