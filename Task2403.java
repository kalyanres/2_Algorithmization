import java.util.Scanner;

public class Task2403 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"a\": ");
        double a = in.nextDouble();

        System.out.print("Площадь шестиугольника: ");
        System.out.printf("%.3f", area(a));
        System.out.println();
    }
    // метод вычисления площади шестиугольника
    public static double area(double l){
        // Правильный шестиугольник состоит из шести
        // равносторонних треугольников
        return 6.0 * l * l * Math.sqrt(3.0) / 4.0;
    }
}
