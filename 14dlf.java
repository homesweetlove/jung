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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Shape> v = new Vector<>();
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int cmd = sc.nextInt();
            if (cmd == 1) {
                System.out.print("Line(1), Rect(2), Circle(3)>>");
                int type = sc.nextInt();
                if (type == 1) v.add(new Line());
                else if (type == 2) v.add(new Rect());
                else if (type == 3) v.add(new Circle());
            } else if (cmd == 2) {
                System.out.print("삭제할 도형의 위치>>");
                int idx = sc.nextInt();
                if (idx < 1 || idx > v.size()) {
                    System.out.println("삭제할 수 없습니다.");
                } else {
                    v.remove((int)(idx - 1));
                }
            } else if (cmd == 3) {
                for (Shape s : v) s.draw();
            } else {
                System.out.println("프로그램종료");
                break;
            }
        }
    }
}



삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>Line(1), Rect(2), Circle(3)>>삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>Line(1), Rect(2), Circle(3)>>삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>Line(1), Rect(2), Circle(3)>>삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>Line
Rect
Circle
삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>삭제할 도형의 위치>>삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>삭제할 도형의 위치>>삭제할 수 없습니다.
삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>Line
Circle
삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>프로그램종료

