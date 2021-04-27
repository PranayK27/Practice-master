package JavaChallenges;

import java.util.Scanner;

class Point{
    final double x;
    final double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point point){
        if (this == null || point == null)
            throw new RuntimeException("Point are not initialized");

        double dx = this.x;// - point.x;
        double dy = this.y;// - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class DistanceBtw2Points {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Point point = new Point(a, b);

        System.out.println(point.distance(point));

    }
}
