package Ex_17_Arrays;

public class Lab_Interview_Q_2nd_High_Number_Array_forloop {
    public static void main(String[] args) {
        int[] numbers = {45, -10, 22, 98, 67, 98, 35, -7, 67, 12};

        // Assume the array has at least 2 elements
        int largest = numbers[0] > numbers[1] ? numbers[0] : numbers[1];
        int secondLargest = numbers[0] < numbers[1] ? numbers[0] : numbers[1];

        // One for loop starts from index 2
        for (int i = 2; i < numbers.length; i++) {

            int current = numbers[i];

            // Using ternary operators to compare and swapping to get  largest & second largest
            largest = current > largest ? current : largest;
            secondLargest = (current < largest && current > secondLargest) ? current : secondLargest;
        }

        // Print the largest and second largest
        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);

        // Print all indexes where second largest duplicate appears
        System.out.print("Second largest found at index(es): ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] == secondLargest ? i + " " : "");
        }

        System.out.println();
    }
}
