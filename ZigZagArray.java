import java.util.Arrays;

class ZigZagArray {
    static int arr[] = new int[] { 3, 9, 6, 1, 7, 5, 8 };

    static void zigZag() {
        Arrays.sort(arr);
        for (int i = 1; i <= arr.length - 2; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        zigZag();
        System.out.println(Arrays.toString(arr));
    }
}