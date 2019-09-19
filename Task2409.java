import java.util.Scanner;

public class Task2409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"X\": ");
        double X = in.nextDouble();
        System.out.print("Enter begin \"Y\": ");
        double Y = in.nextDouble();
        System.out.print("Enter end \"Z\": ");
        double Z = in.nextDouble();
        System.out.print("Enter end \"T\": ");
        double T = in.nextDouble();

        System.out.print("Площадь равна: ");
        System.out.printf("%.2f", areaOfQuadrangle(X, Y, Z, T));
        System.out.println();
    }

    // метод вычисления площади четырехугольника
    public static double areaOfQuadrangle(double a, double b, double c, double d){
        double area1 = 0;
        double area2 = 0;
        double area = 0;
        double p = 0;      // полупериметр
        double ab = 0;

        // разбиваем четырехугольник на два треугольника
        // один прямоугольный со сторонами X, Y и линией, соединяющей вершины X и Y
        // второй со сторонами Z, Т и соединительной линией ХY, 
        // высчитанной по теореме Пифагора
        
        // площадь прямоугольного треугольника
        area1 = a * b / 2.0;
        // третья сторона второго треугольника
        ab = Math.sqrt(a * a + b * b);
        // полупериметр
        p = (ab + c + d) / 2.0;
        // площадь второго треугольника считаем по формуле Герона
        area2 = Math.sqrt(p * (p - ab) * (p - c) * (p - d));
        // общая площадь четырехугольника
        area = area1 + area2;

        return area;
    }
}
