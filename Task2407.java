public class Task2407 {
    public static void main(String[] args) {

        System.out.println("sum = " + sumOddFact());
    }

    // метод вычисления суммы факториалов нечетных чисел от 1 до 9
    public static int sumOddFact() {
        int[] a = new int[9];
        int fact = 1;
        int sum = 0;
        // заполняем массив числами от 1 до 9
        // одновременно считаем факториал 
        // и сумму факториалов нечетных чисел
        for (int i = 0; i < 9; i++){
            a[i] = i + 1;
            fact *= a[i];
            if (a[i] % 2 != 0){
                sum += fact;
            }
        }
        return sum;
    }
}
