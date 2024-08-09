public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] array = {10, 20, 4, 45, 99, 6, 78};  
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        System.out.println("The second largest number in the array is: " + secondLargest);
    }
}
