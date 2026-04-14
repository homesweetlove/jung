import java.util.*;

abstract class Shape {
    abstract void draw();
}

class Line extends Shape {
    public void draw() { System.out.println("Line"); }
}

class Rect extends Shape {
    public void draw() { System.out.println("Rect"); }
}

class Circle extends Shape {
    public void draw() { System.out.println("Circle"); }
}

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Shape> v = new Vector<>();

        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
            int cmd = Integer.parseInt(sc.nextLine());

            if (cmd == 1) {
                System.out.print("Line(1), Rect(2), Circle(3)>> ");
                int type = Integer.parseInt(sc.nextLine());

                if (type == 1) v.add(new Line());
                else if (type == 2) v.add(new Rect());
                else if (type == 3) v.add(new Circle());
            } 
            else if (cmd == 2) {
                System.out.print("삭제할 도형의 위치>> ");
                int idx = Integer.parseInt(sc.nextLine());

                if (idx < 1 || idx > v.size())
                    System.out.println("삭제할 수 없습니다.");
                else
                    v.remove(idx - 1);
            } 
            else if (cmd == 3) {
                for (Shape s : v) s.draw();
            } 
            else if (cmd == 4) {
                System.out.println("프로그램 종료합니다.");
                break;
            }
        }
    }
}