import java.util.Scanner;

public class task_polibiy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String alpha = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя,.-";

        char[][] alphabet = new char[6][6];

        int countSteps = 0;

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet[i].length; j++) {
                alphabet[i][j] = alpha.charAt((countSteps++));
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet[i].length; j++) {
                System.out.print(alphabet[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Введите слово, которое хотите зашифровать: ");
        String word = scanner.nextLine();

        int[] shifredWord = new int[word.length()];

        int currentChar = 0;

        do {
            int jChar, iChar;
            for (int i = 0; i < alphabet.length; i++) {
                for (int j = 0; j < alphabet[i].length; j++) {
                    if (word.charAt(currentChar) == alphabet[i][j]) {
                        iChar = i;
                        jChar = j;

                        shifredWord[currentChar] = ((iChar + 1) * 10 + (jChar + 1));

                        currentChar++;
                        break;
                    }

                }
            }

        } while (currentChar != shifredWord.length);


        for (int i = 0; i < shifredWord.length; i++) {
            System.out.print(shifredWord[i] + " ");
        }


    }
}
