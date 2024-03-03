import java.util.Scanner;

public class TPA_CHAR {

    public static void FindLetter(String[] arr) {
        for (String i : arr) {
            if (i.equalsIgnoreCase("a") || i.equalsIgnoreCase("o") || i.equalsIgnoreCase("u")
                    || i.equalsIgnoreCase("e") || i.equalsIgnoreCase("i")) {
                System.out.println(i + " este vocala");
            }
            else {
                System.out.println(i + " este consoana");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea array-ului: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + ". Introduceti elementul: ");
            array[i] = scanner.nextLine();
        }

        FindLetter(array);
    }
}
