package mathHelpers;

import static java.lang.Math.pow;

public class Area {
    static final double pi = 3.142;

    public double getAreaOfCircle(double radius) {
        // formula : pi * (r*r)
        return (pi * (radius * radius));
    }

    public double getAreaOfRectangle(double length, double width) {
        // formula length * width;
        return length * width;
    }

    public double getAreaOfSquare(double sideOfASquare) {
        // formula a * a; sideSquare;
        return pow(sideOfASquare, 2);
    }

    public double getAreaOfTriangle(double base, double height) {
        // formula 1/2 * base * height;
        return 0.5 * (base * height);
    }

    public double getAreaOfTrapezoid(double base_1, double base_2, double height) {
        // formula  1/2 * (base_1 + base_2) * height;

        if (base_1 == base_2) {
            return -1;
        }

        return 0.5 * (base_1 + base_2) * height;
    }

    public double getAreaOfEllipse(double major_axis, double minor_axis) {
        // formula πab;
        // a = radius of the major axis
        // b = radius of the minor axis

        return pi * (major_axis * minor_axis);
    }

    public double getAreaOfRhombus(double diagonal_1, double diagonal_2) {
        //formula ( diagonal_1 * diagonal_2 ) / 2;
        return (diagonal_1 * diagonal_2) / 2;
    }

    public double getAreaOfParallelogram(double base, double height) {
        //formula (base * height) ;
        return (base * height);
    }

    public double getAreaOfIsoscelesTriangle(double base, double height) {
        //formula  1/2 × base × Height ;
        return 0.5 * base * height;
    }

    public double getAreaOfEquilateralTriangle(double side) {
        //formula (√3/4) side* side;
        return Math.sqrt(3) * Math.pow(side, 2) / 4;
    }
}
