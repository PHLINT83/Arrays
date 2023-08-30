import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
        System.out.println("Задача #1:");
        System.out.print("Введите размер массива: ");
        int n = kb.nextInt();
        int[] arr = new int[n];
/*        arr[2] = 1024;     //обращение к элементу массива на запись
        System.out.println(arr[2]);   //обращение к элементу массива на чтение*/
        for (int i = 0; i < n; i++) {
            System.out.print("Введите значение " + (i + 1 + " элемента: "));
            arr[i] = kb.nextInt();
        }

        System.out.println();
        System.out.println("Задача #2:");
        for (int i = 0; i < n; i++) {
            System.out.println("Значение элемента " + (i + 1) + ": " + arr[i]);
        }

        System.out.println();
        System.out.println("Задача #3:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println("Значение элемента " + (i + 1) + ": " + arr[i]);
        }

        System.out.println();
        System.out.println("Задача #4:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма всех элементов: " + sum);

        System.out.println();
        System.out.println("Задача #5:");
        double average = 0;
        for (int i = 0; i < n; i++) {
            average = (double) sum / n;
        }
        System.out.println("Среднее арифметическое элементов массива: " + average);

        System.out.println();
        System.out.println("Задача #6:");
        
                /*int[] fib = new int[]{3, 5, 8, 13, 21 };
        for(int i=0; i < fib.length; i++)
        {
            System.out.print(fib[i] + "\t");
        }
        System.out.println();*/
    }
}