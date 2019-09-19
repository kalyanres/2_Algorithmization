import java.util.Scanner;

public class Task2om9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int temp = 0;
        int count = 1;
        int max_c = 0;

        // массив заполняется случайными числами от -5 до 5
        for (int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 11) - 5;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println();

        // делаем копию массива для изменений
        b = a.clone();
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (i == 0 && b[i] == b[j]){
                    count++;
                } else if (b[i] != b[0] && b[i] == b[j]) {
                    count++;
                    // записываем b[0] в совпадающий элемент для последующего исключения его из поиска
                    b[j] = b[0];        
                }
            }
            if (count > max_c){
                max_c = count; 
                temp = i;  // запоминаем, на каком элементе больше повторений
            }

            // при равном количестве повторений запоминаем минимальное число
            if (max_c == count){
                if (a[i] < a[temp])
                    temp = i;
            }
            count = 1;
        }
        System.out.println(a[temp]);
    }
}
