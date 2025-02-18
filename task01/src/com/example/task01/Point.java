package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public Point() {

    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public Point createPoint(int x, int y) {
        return new Point(x,y);
    }


    public void flip() {

        int temp = x;
        x = -y;
        y = -temp;
    }
    public double distance(Point point) {

        return Math.sqrt(Math.pow (x - point.x , 2) + Math.pow (y - point.y, 2));
    }

    public String toString() {

        return String.format("( %s, %s)",x,y);
    }
}
