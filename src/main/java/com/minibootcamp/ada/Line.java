package com.minibootcamp.ada;

public class Line {

    public static double calculateLength(int x1, int y1, int x2, int y2) {
        if (y1 == y2 && x1 != x2) {
            return Math.abs(x2 - x1);
        } else if (x1 == x2 && y1 != y2) {
            return Math.abs(y2 - y1);
        }

        return 0.0;
    }
}
