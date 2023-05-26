
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
              System.out.print("Input: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words = {"sang gajah", "serigala", "harimau"};

        for (String word : words) {
            int a = 0;
            int b = str.indexOf(word, a);
            while (b != -1) {
                System.out.print(word + " - ");
                a = b + 1;
                b = str.indexOf(word, a);
            }
        }
    }
}
