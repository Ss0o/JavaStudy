package poly;

import java.util.Scanner;

public class FigureMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        Scanner sc = new Scanner(System.in);

        int x, y;
        for (int i = 0; i < 3; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            sc.nextLine();
            triangle.setPoint(x, y);
        }
        triangle.getPoints();
        System.out.println(triangle.getArea());
    }

}
