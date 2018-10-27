package com.liber;

class Point
{
    double x;
    double y;

    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "[x: "+x+", y: "+y+"]";
    }
}