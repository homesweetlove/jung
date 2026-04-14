import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        System.out.print("정수 (-1이 입력될 때까지)>> ");
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            v.add(n);
        }
        int max = Collections.max(v);
        System.out.println("가장 큰 수는 " + max);
    }
}





import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        while (true) {
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int n = sc.nextInt();
            if (n == 0) break;
            v.add(n);
            int sum = 0;
            for (int x : v) sum += x;
            System.out.println(v);
            System.out.println("현재 평균 " + sum / v.size());
        }
    }
}






import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> map = new TreeMap<>();
        System.out.println("** 포인트 관리 프로그램입니다 **");
        while (true) {
            System.out.print("이름과 포인트 입력>> ");
            String name = sc.next();
            if (name.equals("그만")) break;
            int point = sc.nextInt();
            map.put(name, map.getOrDefault(name, 0) + point);
            for (Map.Entry<String, Integer> e : map.entrySet())
                System.out.println("(" + e.getKey() + ", " + e.getValue() + ")");
        }
    }
}






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
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
            int cmd = sc.nextInt();
            if (cmd == 1) {
                System.out.print("Line(1), Rect(2), Circle(3)>> ");
                int type = sc.nextInt();
                if (type == 1) v.add(new Line());
                else if (type == 2) v.add(new Rect());
                else v.add(new Circle());
            } else if (cmd == 2) {
                System.out.print("삭제할 도형의 위치>> ");
                int idx = sc.nextInt();
                if (idx < 1 || idx > v.size()) System.out.println("삭제할 수 없습니다.");
                else v.remove(idx - 1);
            } else if (cmd == 3) {
                for (Shape s : v) s.draw();
            } else {
                System.out.println("beauty를 종료합니다.");
                break;
            }
        }
    }
}


