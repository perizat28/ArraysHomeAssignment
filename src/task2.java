public class task2 {
    public static void main(String[] args){
        int[] numbers= {10, 25, 8, 30, 15, 30};

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Ищем самое большое число
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        //Ищем второе по величине (строго меньше largest)
        int secondLargest = largest;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < largest) {
                if (!found || numbers[i] > secondLargest) {
                    secondLargest = numbers[i];
                    found = true;
                }
            }
        }

        //результат
        if (!found) {
            System.out.println("No second largest distinct number.");
        } else {
            System.out.println("Largest: " + largest);
            System.out.println("Second largest: " + secondLargest);
        }
    }

}

