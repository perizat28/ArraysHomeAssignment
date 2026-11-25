public class task4 {
    public static void main(String[] args){
        int[] numbers = {4, 7, 2, 4, 9, 7, 1, 2, 8, 4};

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Ищем дубликаты и выводим каждый только один раз
        boolean hasDuplicates = false;
        System.out.print("Duplicate numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            // Проверяем, не встречалось ли это число раньше
            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (numbers[k] == numbers[i]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            // Считаем количество повторений числа numbers[i]
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
            }

            // Проверяем количество
            switch (count) {
                case 0:
                case 1:
                    break;
                default:
                    System.out.print(numbers[i] + " ");
                    hasDuplicates = true;
                    break;
            }
        }

        if (!hasDuplicates) {
            System.out.print("No duplicate numbers found.");
        }
        System.out.println();
    }
}
