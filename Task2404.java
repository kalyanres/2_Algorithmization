import java.util.Scanner;

public class Task2404 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            x[i] = (Math.random() * 101.0) - 50.0;
            System.out.printf("%.3f", x[i]);
            System.out.print(" ");
        }                 
        System.out.println();

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            y[i] = (Math.random() * 101.0) - 50.0;
            System.out.printf("%.3f", y[i]);
            System.out.print(" ");
        }                 
        System.out.println();

        maxDistance(x, y, n);
    }

    // метод определения пары точек с наибольшим расстоянием
    public static void maxDistance(double[] x, double[] y, int size){
        double max = Double.MIN_VALUE;
        int max_i = 0;
        int max_j = 0;
        for (int i = 0; i < size - 1; i++){
            for (int j = i + 1; j < size; j++){
                double dx = x[i] - x[j];
                double dy = y[i] - y[j];
                double distance = Math.sqrt(dx * dx + dy * dy);
                if (max < distance){
                    max = distance;
                    max_i = i;
                    max_j = j;
                }
            }
        }

        System.out.print("Maximum distance: ");
        System.out.printf("%.3f", max);
        System.out.println();
        System.out.print("Points coordinates(");
        System.out.printf("%.3f", x[max_i]);
        System.out.print("; ");
        System.out.printf("%.3f", y[max_i]);
        System.out.println(")");
        System.out.print("                 (");
        System.out.printf("%.3f", x[max_j]);
        System.out.print("; ");
        System.out.printf("%.3f", y[max_j]);
        System.out.println(")");

    }
}
