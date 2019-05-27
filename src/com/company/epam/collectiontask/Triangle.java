package com.company.epam.collectiontask;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashSet;

/**
 * Created by Vladyslav_Lyshchuk on 5/27/2019.
 */
public class Triangle {
    private final double firstSide;

    private final double secondSide;

    private final double thirdSide;
    private final String type = "";

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        if (!isTriangleExists(firstSide, secondSide, thirdSide)) {
            throw new IllegalArgumentException();
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public static boolean isTriangleExists(double firstSide, double secondSide,
                                           double thirdSide) {
        return (0 > Double.compare(thirdSide, (firstSide + secondSide))) &&
                (0 > Double.compare(secondSide, (firstSide + thirdSide))) &&
                (0 > Double.compare(firstSide, (secondSide + thirdSide)));
    }

    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    /**
     * Получение площади треугольника
     */
    public double getArea() {
        double semiPerimeter = getPerimeter()/2;
        double buffer = semiPerimeter * (semiPerimeter - firstSide)
                * (semiPerimeter - secondSide)
                * (semiPerimeter - thirdSide);
        return Math.sqrt(buffer);
    }

    // getters

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    @Override
    public String toString() {
        final String DELIMETER = ", ";
        return "Triangle: " + firstSide + DELIMETER +
                secondSide + DELIMETER + thirdSide;
    }

    public boolean is_right () {
        if (((firstSide*firstSide) == ((secondSide*secondSide) + (thirdSide*thirdSide))) ||
                ((secondSide*secondSide) == ((firstSide*firstSide) + (thirdSide*thirdSide))) ||
                ((thirdSide*thirdSide) == ((firstSide*firstSide) + (secondSide*secondSide))))
            return true;
        else
            return false;
    }

    // Method to test for a scalene triangle.
    public boolean is_scalene () {
        if ((firstSide != secondSide) && (firstSide != thirdSide) && (secondSide != thirdSide))
            return true;
        else
            return false;
    }

    // Method to test for an isosceles triangle.
    public boolean is_isosceles () {
        if (((firstSide == secondSide) && (firstSide != thirdSide)) ||
                ((firstSide == thirdSide) && (firstSide != secondSide)) ||
                ((secondSide == thirdSide) && (secondSide != firstSide)))
            return true;
        else
            return false;
    }

    // Method to test for an equilateral triangle.
    public boolean is_equilateral () {
        if ((firstSide == secondSide) && (firstSide == thirdSide))
            return true;
        else
            return false;
    }
}

class Get_Triangle{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5.0,5.0,5.0);
        getType(triangle);
//        HashSet<Triangle> triangles = new HashSet<Triangle>(triangle);
    }

    public static void getType(Triangle triangle){
        if(triangle.is_equilateral() == true){
            System.out.println("Этот треугольник - равносторонний");
        }
        else if (triangle.is_isosceles() == true){
            System.out.println("Этот треугольник - равнобедренный");
        }
        else if (triangle.is_scalene() == true){
            System.out.println("Этот треугольник - неравносторонний");
        }
        else{
            System.out.println("неизвестно");
        }
    }
}
