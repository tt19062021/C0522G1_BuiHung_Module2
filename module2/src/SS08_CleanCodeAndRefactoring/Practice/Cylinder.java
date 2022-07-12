package SS08_CleanCodeAndRefactoring.Practice;

public class Cylinder{
    public static double getVolume(double radius, double height){
//        double baseArea = Math.PI * radius * radius;
//        double perimeter = 2 * Math.PI  * radius;
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);

        return perimeter * height + 2 * baseArea;
    }
    private static double getBaseArea(double radius){
        return 2 * Math.PI * radius;

    }
    private static double getPerimeter(double radius) {
        return Math.PI * radius * radius;
    }
}
