/**
 * Created by Ivan_Surus on 1/30/2017.
 */
public class RectangleGo extends GeometricObject {

    private double sideA;
    private double sideB;

    RectangleGo(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
