import java.util.Comparator;

/**
 * Created by Ivan_Surus on 1/30/2017.
 */
public class GeometricObjectComporator implements Comparator<GeometricObject>{

// сортировка по возрастанию (площадь)
    //чтобы сделать другую сортировку нужно изменть условия в методе compare
    @Override
    public int compare(GeometricObject o1, GeometricObject o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();
        if (area1 < area2){
            return -1;
        } else if (area1 == area2) {
            return 0;
        } else {
            return 1;
        }
    }
}
