package main;
import core.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by GabrielHoward on 13/10/16.
 */
public class Main {

    public static void main(String[] args) {

        Point p2 = new Point(new Vector2(2,3));
        Point p3 = new Point(new Vector2(3, 4));
        Point p4 = new Point(new Vector2(1, 5));

        ArrayList<Point> pointList = new ArrayList<>();
        pointList.add(p2);
        pointList.add(p3);
        pointList.add(p4);

        double dx = SSQ(getCentroid(pointList), pointList);

        System.out.println(dx);
    }

    //2D
    public static double SSQ(Centroid cn, ArrayList<Point> points) {
        double solution = 0.0;
        System.out.println(cn.vec2.x + " y: " + cn.vec2.y);
        for (Point p : points) {
            solution += Math.pow((cn.vec2.x - p.vec2.x), 2) + Math.pow((cn.vec2.y - p.vec2.y), 2);
        }
        return solution;
    }

    //2D
    public static Centroid getCentroid(ArrayList<Point> points) {
        float x = 0.0f;
        float y = 0.0f;
        for (Point p : points) {
            x += p.vec2.x;
            y += p.vec2.y;
        }
        return new Centroid(new Vector2(x / points.size(), y / points.size()));
    }

}
