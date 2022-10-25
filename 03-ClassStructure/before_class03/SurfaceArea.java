public class SurfaceArea {
    
    public static int rectangleArea(int width, int length) {
        return width*length;
    }
    
    public static double triangleArea(int base, int height) {
        return base*0.5*height;
    }
    
    public static double circleArea(int radius) {
        return radius*radius*3.14;
    }
    
    public static void main(String[] args) {
        double areaRec = rectangleArea(4,5);
        System.out.println(areaRec);
        double areaCirc = circleArea(3);
        System.out.println(areaCirc);
        double areaTrian = triangleArea(3,4);
        System.out.println(areaTrian);
    }
}