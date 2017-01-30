/**
 * Created by Ivan_Surus on 1/30/2017.
 */
public class CircleGo extends GeometricObject {

    private double radius;


    CircleGo(double radius){
        this.radius = radius;

    }

    @Override
    public double getArea() {
        return 2 * 3.14 * radius * radius;
    }
}
