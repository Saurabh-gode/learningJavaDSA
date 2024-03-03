package assignments.basics;

import mathHelpers.Area;

public class AreaCalculator {

    public static void main(String[] args) {
        Area areaObj = new Area();

        System.out.println(areaObj.getAreaOfCircle(4));
        System.out.println(areaObj.getAreaOfTrapezoid(4, 4, 5));
    }
}
