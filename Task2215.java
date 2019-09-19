import java.util.Scanner;

public class Task2215 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int sum = 0;
        int[][] a = new int[2 * n - 1][2 * n - 1];
        int[][] b = new int[n][n];
        
        // для нечетных n применяем метод террас
        // создаем расширенную матрицу
        if (n % 2 != 0){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    a[n - 1 - j + i][j + i] = j + i * n + 1;
                }
            }

            for (int i = 0; i < n; i++){
                // добавление в матрицу b[n][n] основной таблицы
                for (int j = 0; j < n; j++){
                    if (a[i + n / 2][j + n / 2] != 0){
                        b[i][j] = a[i + n / 2][j + n / 2];
                    }
                }
                // добавление в матрицу b[n][n] левой терассы
                for (int j = 0; j < n/2; j++){
                    if (a[n/2 + i][j] != 0) {
                        b[i][n/2 + j + 1] = a[n/2 + i][j];
                    }
                }
                // добавление в матрицу b[n][n] правой терассы
                for (int j = n/2 + n; j < 2 * n - 1; j++){
                    if (a[n/2 + i][j] != 0) {
                        b[i][j - n/2 - n] = a[n/2 + i][j];
                    }
                }
                // добавление в матрицу b[n][n] верхней терассы
                for (int j = 0; j < n/2; j++){
                    if (a[j][n/2 + i] != 0){
                        b[n/2 + j + 1][i] = a[j][n/2 + i];
                    }
                }
                // добавление в матрицу b[n][n] нижней терассы
                for (int j = n/2 + n; j < 2 * n - 1; j++){
                    if (a[j][n/2 + i] != 0){
                        b[j - n/2 - n][i] = a[j][n/2 + i];
                    }
                }
            }


        // для четных чисел
        } else {
            
            // Заполняем две матрицы размером nxn числами в прямом и 
            // обратном порядке
            int[][] m1 = new int[n][n];            
            int[][] m2 = new int[n][n];            
            
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    m1[i][j] = j + 1 + i * n;
                    m2[i][j] = n * n - j - i * n;
                }
            }

            // заполняем матрицу b[n][n]
            for (int i = 0; i < n/2; i++){
                //заполняем верхний левый квадрат
                for (int j = 0; j < n/2; j++){
                    if (i == j || i + j == n/2 - 1){
                        b[i][j] = m2[i][j];
                    } else {
                        b[i][j] = m1[i][j];
                    }
                }
                //заполняем верхний правый квадрат
                for (int j = n/2; j < n; j++){
                    if (j - i == n/2 || i + j == n - 1){
                        b[i][j] = m2[i][j];
                    } else {
                        b[i][j] = m1[i][j];
                    }
                }
            }

            for (int i = n/2; i < n; i++){
                //заполняем нижний левый квадрат
                for (int j = 0; j < n/2; j++){
                    if (i - j == n/2 || i + j == n - 1){
                        b[i][j] = m2[i][j];
                    } else {
                        b[i][j] = m1[i][j];
                    }
                }
                //заполняем нижний правый квадрат
                for (int j = n/2; j < n; j++){
                    if (j == i || i + j == n + n/2 - 1){
                        b[i][j] = m2[i][j];
                    } else {
                        b[i][j] = m1[i][j];
                    }
                }
            }


        }
        
        // Print
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                sum += b[i][j];
                System.out.print(b[i][j] + " ");
            }
            System.out.println(" " + sum);
            sum = 0;
        }
        System.out.println();
    }
}
