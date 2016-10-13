package core;

/**
 * Created by GabrielHoward on 13/10/16.
 */
public class Point {

    public Cluster cluster;
    public Vector3 vec3;
    public Vector2 vec2;

    public Point(Vector3 vec3) {
        this.vec3 = vec3;
    }

    public Point(Vector2 vec2) {
        this.vec2 = vec2;
    }
}
