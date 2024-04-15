package poly;

import java.util.Comparator;

public class pointComparator implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        if(o1.x1>o2.x1) return 1;
        if(o1.x1<o2.x1) return -1;
        return 0;
    }
}
