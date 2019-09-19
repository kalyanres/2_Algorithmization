public class Task2212 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        int temp = 0;
        int[][] a = new int[n][n];

        // массив заполняется случайными числами от 0 до 100
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = (int)(Math.random() * 89) + 10;
                System.out.print(a[i][j] + " ");
            }                 
            System.out.println();
        }
        System.out.println();

        // Пузырьковая сортировка по возрастанию
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n - 1; j++){
                for (int k = 0; k < n - 1 - j; k++){
                    if (a[i][k] > a[i][k + 1]) {
                        temp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = temp;
                    }
                }
            }
        }
        
        // Print
        System.out.println("Сортировка строк матрицы по возрастанию");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Пузырьковая сортировка строк по убыванию
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n - 1; j++){
                for (int k = 0; k < n - 1 - j; k++){
                    if (a[i][k] < a[i][k + 1]) {
                        temp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = temp;
                    }
                }
            }
        }
        // Print
        System.out.println("Сортировка строк матрицы по убыванию");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
