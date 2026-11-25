import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Original: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Спрашиваем индекс
        System.out.print("Enter index to remove: ");
        int index = scanner.nextInt();

        // Проверяем, что индекс попадает в границы массива
        if (index >= 0 && index < numbers.length) {
            for (int i = index; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            System.out.print("Updated: ");
            for (int i = 0; i < numbers.length - 1; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid index.");
        }

        scanner.close();
    }
}
