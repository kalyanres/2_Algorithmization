import java.util.Scanner;

public class Task2305 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int[] a = new int[n];
        int temp = 0;
        int temp_i = 0;

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 101) - 50;
            System.out.print(a[i] + " ");
        }                 
        System.out.println();

        // реализация сортировки вставками
	    for (int i = 1; i < n; i++) {
		    temp = a[i];
		    temp_i = bin_find(a, i - 1, a[i]);
		    for (int j = i; j > temp_i; j--) {
			    a[j] = a[j - 1];
		    }
		    a[temp_i] = temp;
	    }

        // вывод на экран
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }                 
        System.out.println();
    }
        
        // функция бинарного поиска
    public static int bin_find(int[] array, int size, int value) {
        int left = 0;
        int right = size + 1;
        int aver = 0;
        while (left <= right) {
            aver = (left + right) / 2;
            if (aver == 0){
                if (value < array[aver])
                    return 0;
                else 
                    return 1;
            }
            else if (value == array[aver]) {
                return aver;
            }
            else if (value <= array[aver] && value > array[aver - 1])
                return aver;
            if (value < array[aver])
                right = aver - 1;
            else 
                left = aver + 1;
        }
        return aver;
    }
    
}
