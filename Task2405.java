import java.util.Scanner;

public class Task2405 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int[] a = new int[n];
        int max = Integer.MIN_VALUE;
        int max_second = 0;

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 101) - 50;
            if (max < a[i]){
                max_second = max;
                max = a[i];
            }
            else if (max_second < max && max_second < a[i]){
                max_second = a[i];
            }
            System.out.printf(a[i] + " ");
        }                 
        System.out.println();
        
        System.out.println("Max = " + max);
        System.out.println("Max second = " + max_second);
    }
}
