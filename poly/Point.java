package poly;

import java.util.Comparator;

//좌표를 담을 클래스
public class Point implements Comparator<Point> {
    int x1,y1;

    public Point(int x1, int y1)
    {
        this.x1 = x1;
        this.y1 = y1;
    }
    @Override
    public String toString(){
        return "x: "+ x1 + " y: " + y1 +"입니다.";
    }

    @Override
    public int compare(Point o1, Point o2) {
        if(o1.x1>o2.x1) return 1;
        if(o1.x1<o2.x1) return -1;
        return 0;
    }
}
