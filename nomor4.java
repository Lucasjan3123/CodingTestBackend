
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan (pisahkan dengan koma): ");
        String input = scanner.nextLine();
        String[] number = input.split(",");
        int[] numbers = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            numbers[i] = Integer.parseInt(number[i].trim());
        }
        System.out.println("Input: " + Arrays.toString(numbers));
        System.out.println("Output: " + findSmallestMissingPositive(numbers));

    }

 public static int findSmallestMissingPositive(int[] numbers) {
        int n = numbers.length;

        // Mencari nilai minimum dan maksimum di dalam array
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > 0 && numbers[i] < max) {
                max = numbers[i];
            }
            if (numbers[i] > min) {
                min = numbers[i];
            }
        }

        // Mencari bilangan cacah terkecil di dalam rentang [min, max]
        for (int i = max; i <= min; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (numbers[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }

        // Jika semua elemen terdapat pada rentang [min, max], maka bilangan cacah terkecil adalah min + 1
        return min + 1;
    }

}
