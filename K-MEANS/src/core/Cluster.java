package core;

import java.util.ArrayList;

/**
 * Created by GabrielHoward on 13/10/16.
 */
public class Cluster {
    public int index = 0;
    public ArrayList<Point> points;
    public Centroid centroid;

    public Cluster(int index, ArrayList<Point> points, Centroid centroid) {
        this.index = index;
        this.points = points;
        this.centroid = centroid;
    }
}
