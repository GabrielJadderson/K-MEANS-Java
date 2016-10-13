package core;

import java.util.ArrayList;

/**
 * Created by GabrielHoward on 13/10/16.
 */
public class Vector2 {
    public float x;
    public float y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2(int x, int y) {
        this.x = (float) x;
        this.y = (float) y;
    }

    public Vector2 difference(Vector2 v1, Vector2 v2) {
        return new Vector2(v1.x-v2.x, v1.y-v2.y);
    }

    public Vector2 sum(Vector2 v1, Vector2 v2) {
        return new Vector2(v1.x+v2.x, v1.y+v2.y);
    }

}
