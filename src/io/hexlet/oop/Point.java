package io.hexlet.oop;
class Point {
    private int coordinateX;
    private int coordinateY;

    Point(int xCoordinate, int yCoordinate) {
        this.coordinateX = xCoordinate;
        this.coordinateY = yCoordinate;
    }

    public int getX() {
        return coordinateX;
    }

    public int getY() {
        return coordinateY;
    }
}
