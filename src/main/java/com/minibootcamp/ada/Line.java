package com.minibootcamp.ada;

public class Line {

    public static double calculateLength(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;

        return Math.sqrt((x * x) + (y * y));
    }
}
