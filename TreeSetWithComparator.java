import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ivan_Surus on 1/30/2017.
 */
public class TreeSetWithComparator {
    public static void main(String[] args) {
        Comparator<GeometricObject> comporator = new GeometricObjectComparator();
        Set <GeometricObject> set = new TreeSet<GeometricObject>(comporator);
        set.add(new RectangleGo(4,5));
        set.add(new RectangleGo(1,5));
        set.add(new CircleGo(4));
        set.add(new CircleGo(5));
        for (GeometricObject elements: set) {
            System.out.println("area = " + elements.getArea());
        }

    }
}
