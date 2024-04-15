package poly;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.abs;

//점들의 좌표를 가지고 있는 삼각형 클래스
public class Triangle implements Figure{
    ArrayList<Point> list = new ArrayList<>();

    public void setPoint(int x, int y)
    {
        list.add(new Point(x,y));
    }
    @Override
    public void getPoints() {
        for (Point point : list) {
            System.out.println(point);
        }
    }

    @Override
    public double getArea() {
        Collections.sort(list,new pointComparator());

        int pts[][]= {{list.get(0).x1,list.get(0).y1},{list.get(1).x1,list.get(1).y1},{list.get(2).x1,list.get(2).y1}};

        double result = abs((pts[0][0]*pts[1][1]+pts[1][0]*pts[2][1]+pts[2][0]*pts[0][1])
                -(pts[1][0]*pts[0][1]+pts[2][0]*pts[1][1]+pts[0][0]*pts[2][1]));

        result = result / 2;

        return result;
    }
}
