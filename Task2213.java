public class Task2213 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        int temp = 0;
        int[][] a = new int[n][n];

        // массив заполняется случайными числами от 10 до 99 
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = (int)(Math.random() * 89) + 10;
                System.out.print(a[i][j] + " ");
            }                 
            System.out.println();
        }
        System.out.println();

        // Пузырьковая сортировка по возрастанию
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m - 1; j++){
                for (int k = 0; k < m - 1 - j; k++){
                    if (a[k][i] > a[k + 1][i]) {
                        temp = a[k][i];
                        a[k][i] = a[k + 1][i];
                        a[k + 1][i] = temp;
                    }
                }
            }
        }
        
        // Print
        System.out.println("Сортировка столбцов матрицы по возрастанию");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Пузырьковая сортировка по убыванию
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m - 1; j++){
                for (int k = 0; k < m - 1 - j; k++){
                    if (a[k][i] < a[k + 1][i]) {
                        temp = a[k][i];
                        a[k][i] = a[k + 1][i];
                        a[k + 1][i] = temp;
                    }
                }
            }
        }
        // Print
        System.out.println("Сортировка столбцов матрицы по убыванию");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
