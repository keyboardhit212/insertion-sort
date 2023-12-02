public class InsertionSort {

    public static void main(String[] args) {
        int[] digits = {7, 2, 3, 1, 4};
        System.out.print("Before Sort: ");
        displayArray(digits);
        insertionSort(digits);
        System.out.print("After Sort: ");
        displayArray(digits);
    }

    public static void insertionSort(int[] digits) {
        int current_index = 1;
        while (current_index < digits.length) {
            int temp = digits[current_index];
            int i = current_index - 1;
            for (; i >= 0; i--) {
                if (digits[i] > temp)
                    digits[current_index--] = digits[i];
                else
                    break;
            }
            digits[current_index] = temp;
            current_index++;
        }
    }

    public static void displayArray(int[] digits) {
        for (int digit : digits)
            System.out.printf("%d ", digit);
        System.out.println();
    }
}
