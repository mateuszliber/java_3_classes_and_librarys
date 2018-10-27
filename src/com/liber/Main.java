package com.liber;
import java.awt.Rectangle;

public class Main
{
    public static void main(String[] args)
    {
        Rectangle obj1 = new Rectangle(0,0,4,3);
        System.out.println(obj1);


        Rectangle obj2 = new Rectangle(1,1,4,3);
        System.out.println(obj2);

        //pdpkt. 3.1
        //Link do dokumentacji Recktangle:
        //https://courses.cs.washington.edu/courses/cse341/98au/java/jdk1.2beta4/docs/api/java/awt/Rectangle.html

        //pdpkt. 3.2
        Rectangle obj3 = (Rectangle) obj1.createIntersection(obj2);
        System.out.println("Wynik przecięcia: "+obj3);

        //pdpkt. 3.3
        boolean ifContains = obj2.contains(obj1);
        System.out.println("Czy zawiera: "+ifContains);

        //pdpkt. 3.4
        Rectangle obj4 = new Rectangle(-3,0,6,3);
        boolean ifContainsPoint = obj4.contains(2, -1);
        System.out.println("Czy punky się zawiera: "+ ifContainsPoint);

        //pdpkt. 3.5
        Rectangle obj51 = new Rectangle(1,1,4,5);
        Rectangle obj52 = new Rectangle(4,-3,4,5);
        boolean ifIntersects = obj51.intersects(obj52);
        System.out.println("Czy się przecinają: "+ ifIntersects);

        //pdpkt 3.7
        Point pointTest = new Point(1, 1);
        com.liber.Rectangle rectangleInfoTest = new com.liber.Rectangle(3, 4);
        ((com.liber.Rectangle) rectangleInfoTest).save("plik.txt");
    }
}