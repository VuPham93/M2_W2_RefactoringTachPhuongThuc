public class Cylinder {
    public static double getVolume(int radius, int height){
        double volume = getArea(radius) * height;
        return volume;
    }

    private static double getArea(int radius) {
        return Math.PI * radius * radius;
    }
}
