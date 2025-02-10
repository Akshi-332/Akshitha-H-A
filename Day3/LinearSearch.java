public class LinearSearch{
    public static int linear(int[] arr, int lookingFor, int index) {
        if (index >= arr.length) return -1;
        if (arr[index] == lookingFor) return index;
        return linear(arr, lookingFor, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        int lookingFor = 4;
        int result = linear(arr, lookingFor, 0);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}