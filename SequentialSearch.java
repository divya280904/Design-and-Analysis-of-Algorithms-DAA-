public class SequentialSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 0, 1, 9};
        int target = 1;
        int result = sequentialSearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
